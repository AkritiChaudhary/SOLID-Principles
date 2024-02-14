pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Compile and run Java code- Sample
                bat 'javac -sourcepath src -d out SingleResponsibility/Main.java'
                bat 'java -cp out SingleResponsibility'
            }
        }
    }
}
