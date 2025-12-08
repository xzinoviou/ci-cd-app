pipeline {
    agent none


    stages {

        stage("build") {
        agent { label 'jenkins-build-agent' }
            steps {
                echo "[--- Stage: Build started---] "
                echo "List of env variables test"
                echo "MYSQL_PORT = ${env.MYSQL_PORT}"
                echo "MYSQL_DB = ${env.MYSQL_DB}"
                echo "MYSQL_HOST = ${env.MYSQL_HOST}"
                echo "MYSQL_URL = ${env.MYSQL_URL}"
            }
        }

        stage("test") {
        agent { label 'jenkins-build-agent' }
            steps {
                echo "[--- Stage: Testing started---] "
            }
        }
    }
}

node {
    //
}
