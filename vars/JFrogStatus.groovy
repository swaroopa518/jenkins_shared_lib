def call(String jfrogUser){
    withCredentials([usernamePassword(
            credentialsId: "my-artifactory",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
           sh  "curl -X PUT -u $USER -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar"
           sh "read -p $PASS"           
        }
}
