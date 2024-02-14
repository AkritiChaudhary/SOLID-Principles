pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                     if (isUnix()) {
                        sh 'echo "Hello World"'
                    } else {
                        bat 'echo "Hello World"'
                    }
                }
            }
        }
    }
}
