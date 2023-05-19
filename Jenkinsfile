pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                checkout scm
            }
        }

         stage('Test QA ') {
            steps {
                sh 'java src/main/java/CodingAssessments/DuplicatesArrayList.java'
            }
        }

        stage('Deploy QA ') {
            steps {
                checkout scm
            }
        }
    }
}