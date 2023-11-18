def call(credentialsId){

    withJFrogEnv(credentialsId: credentialsId) {
         sh 'mvn clean package jfrog:jfrog'
    }
}
