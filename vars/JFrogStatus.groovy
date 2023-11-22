def call(String JfrogUser){
 withCredentials([usernamePassword(
            credentialsId: "jfrog",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        
         archiveArtifacts artifacts: '**/target/*.jar', followSymlinks: false
     
  
    }
}

