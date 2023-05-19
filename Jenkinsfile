pipeline {
    agent any

        parameters {
            choice(name: 'ENVIRONMENT', choices: ['QA', 'Development', 'Staging', 'Production'], description: 'Select the target environment')
        }

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