def call(credentialsId){

    withJFrogEnv(credentialsId: credentialsId) {
         sh 'make' 
         archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
    }
}
