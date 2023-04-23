pipeline {
    agent {
        docker { image 'gradle:8.1-jdk17-alpine' }
    }
    stages {
        stage('Test') {
            steps {
                sh './gradlew cucumberCli'
            }
        }
    }
}