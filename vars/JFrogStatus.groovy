def call(){

         sh 'make' 
         archiveArtifacts artifacts: '**/target/*.jar'
    }
}
