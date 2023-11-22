def call(credentialsId){

    withJFrogInstanceEnv(credentialsId: credentialsId) {
         archiveArtifacts artifacts: '**/target/*.jar', followSymlinks: false
    }
}
