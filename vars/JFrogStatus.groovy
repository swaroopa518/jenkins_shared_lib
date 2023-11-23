def call(String JfrogUser){
 withCredentials([usernamePassword(
            credentialsId: "jfrog",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        curl -u $USER -X PUT -T  */target/*.jar http://54.209.136.136:8082/artifactory/example-repo-local/"

    }
}

