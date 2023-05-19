pipeline {
    agent any

    parameters {
        choice(name: 'ENVIRONMENT', choices: ['Development', 'Staging', 'Production'], description: 'Select the target environment')
        string(name: 'GHERKIN_FILE', defaultValue: '', description: 'Select Gherkin file(s) to execute (comma-separated)', trim: true)
    }

    stages {
        stage('Clone Repository') {
            steps {
                checkout scm
            }
        }

        stage('Test QA') {
            steps {
                sh 'java src/main/java/CodingAssessments/DuplicatesArrayList.java'
            }
        }

        stage('Integration Test') {
            steps {
                sh 'java src/main/java/CodingAssessments/DuplicatesArrayList.java'
            }
        }

        stage('Regression Test') {
            steps {
                sh 'java src/main/java/CodingAssessments/DuplicatesArrayList.java'
            }
        }

        stage('Staging') {
            steps {
                sh 'java src/main/java/CodingAssessments/DuplicatesArrayList.java'
            }
        }

        stage('Deploy QA') {
            steps {
                checkout scm
            }
        }

        stage('Execute Tests') {
            steps {
                script {
                    def selectedEnvironment = ENVIRONMENT
                    def selectedFiles = GHERKIN_FILE.split(',').collect { it.trim() }.findAll { !it.isEmpty() }

                    echo "Selected environment: ${selectedEnvironment}"
                    echo "Selected Gherkin file(s): ${selectedFiles}"

                    if (selectedFiles) {
                        // Use the selected environment and Gherkin file(s) in the test execution steps
                        // ...testing
                    } else {
                        echo "No Gherkin file selected. Skipping test execution."
                    }
                }
            }
        }
    }
}
