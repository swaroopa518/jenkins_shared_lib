def call(String hubUser){
    withCredentials([usernamePassword(
            credentialsId: "my-artifactory",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
            curl -X POST -u $USER -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar
            read -p $PASS           
        }
}
