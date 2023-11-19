def call(){
        archiveArtifacts artifacts: '**/target/*.jar', followSymlinks: false
    }
