def call(String jfrogUser){
    archiveArtifacts artifacts: '**/target/*.jar', followSymlinks: false
}
