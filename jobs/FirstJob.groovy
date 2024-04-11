pipeline {
    agent any
    stages {
        stage('echo') {
            steps {
                sh "echo Hi, ${params.name}, this is the first job."
                sh 'sleep 30'
            }
        }
    }
}

