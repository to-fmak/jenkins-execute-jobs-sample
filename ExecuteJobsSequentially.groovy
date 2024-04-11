pipeline {
    agent any
    stages {
        stage('first-job') {
            when {
                expression { params.firstJob }
            }
            steps {
                build job: 'first-job',
                parameters: [
                    string(name: 'name', value: 'T')
                ]
            }
        }
        stage('second-job') {
            when {
                expression { params.secondJob }
            }
            steps {
                build job: 'second-job',
                parameters: [
                    string(name: 'name', value: 'Fmak')
                ]
            }
        }
    }
}
