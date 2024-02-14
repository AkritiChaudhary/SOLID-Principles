pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Compile and run Java code
                sh 'javac -sourcepath src -d out SingleResponsibility/Main.java'
                sh 'java -cp out SingleResponsibility'
            }
        }
    }
}
