pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Compile and run Java code
                bat 'javac -sourcepath src -d out src/SingleResponsibility.java'
                bat 'java -cp out SingleResponsibility'
            }
        }
    }
}
