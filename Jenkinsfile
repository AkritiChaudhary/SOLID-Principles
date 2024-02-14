pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    /
                    if (isLinux()) {
                        sh 'echo "Hello World"'
                    } else {
                        bat 'echo "Hello World"'
                    }
                }
            }
        }
    }
}
