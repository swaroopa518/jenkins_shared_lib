def call(credentialsId){
        withSonarQubeEnv(credentialsId: credentialsId) {
        curl -XPUT-u $uname -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar
        }
    }
