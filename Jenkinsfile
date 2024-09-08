pipeline {
    agent any

    stages {

        stage("build") {
            steps {
                echo "[--- Building started... ---] "
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage("test") {
            steps {
                echo "[--- Testing started... ---] "
            }
        }
    }
}

node {
    //
}
