def call(String JfrogUser){
 withCredentials([usernamePassword(
            credentialsId: "jfrog",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        curl -X PUT -u $USER -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://:8082/artifactory/example-repo-local/
         archiveArtifacts artifacts: '**/target/*.jar', followSymlinks: false
     
  
    }
}

