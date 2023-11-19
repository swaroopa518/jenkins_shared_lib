def call(credentialsId){
        archiveArtifacts artifacts: '**/target/*.jar', followSymlinks: false
    }
