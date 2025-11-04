pipeline {
    agent any

    stages {

        stage("build") {
            steps {
                echo "[--- Building started... ---] "
                sh './mvnw -DskipTests clean package'
            }
        }

        stage("test") {
            steps {
                echo "[--- Testing started... ---] "
                sh './mvnw test'
            }
        }

        stage("groovy-check") {
            steps {
                script {
                    def result = 1 + 1  > 1 ? 'IT Round ran Successfully' : 'IT Skipped'
                    echo "[----- $result -----]"
                }
            }
        }
    }
}

node {
    //
}
