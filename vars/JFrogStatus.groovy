def call(credentialsId){

         sh 'make' 
         archiveArtifacts artifacts: '**/target/*.jar'
    }
}
