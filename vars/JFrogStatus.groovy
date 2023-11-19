def call(credentialsId){
        withSonarQubeEnv(credentialsId: credentialsId) {
        archiveArtifacts artifacts: '**/target/*.jar', followSymlinks: false
        }
    }
