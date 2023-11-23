def call(String JfrogUser){
 withCredentials([usernamePassword(
            credentialsId: "jfrog",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh("curl -u $USER -X PUT -T  **/target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://<EC2IP>:8082/artifactory/example-repo-local/
        sh "read -s $PASS"
    }
}

