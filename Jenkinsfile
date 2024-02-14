pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Run Windows-specific steps
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
