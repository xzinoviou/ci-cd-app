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
    }
}

node {
    //
}
