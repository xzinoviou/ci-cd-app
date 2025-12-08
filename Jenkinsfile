pipeline {
    agent any


    stages {

        stage("build") {
            steps {
                echo "[--- Stage: Build started---] "
                echo "MYSQL_PORT = ${env.MYSQL_PORT}"
                echo "MYSQL_DB = ${env.MYSQL_DB}"
                echo "MYSQL_HOST = ${env.MYSQL_HOST}"
                echo "MYSQL_URL = ${env.MYSQL_URL}"
            }
        }

        stage("test") {
            steps {
                echo "[--- Stage: Testing started---] "
            }
        }
    }
}

node {
    //
}
