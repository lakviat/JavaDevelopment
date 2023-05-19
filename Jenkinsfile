pipeline {
    agent any

    parameters {
        choice(name: 'ENVIRONMENT', choices: ['Development', 'Staging', 'Production'], description: 'Select the target environment')
        choice(name: 'GHERKIN_FILE', description: 'Select Gherkin file(s) to execute', multiSelectDelimiter: ',', type: 'PT_MULTI_SELECT', choices: getGherkinFiles())
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
                    def selectedFiles = GHERKIN_FILE.split(',')

                    echo "Selected environment: ${selectedEnvironment}"
                    echo "Selected Gherkin file(s): ${selectedFiles}"

                    // Use the selected environment and Gherkin file(s) in the test execution steps
                    // ...
                }
            }
        }
    }
}

def getGherkinFiles() {
    def files = []
    def directory = new File('src/test/java/Features').absolutePath
    def pattern = ~/.*\.feature$/

    directory.eachFileRecurse(groovy.io.FileType.FILES) {
        if (it.name =~ pattern) {
            files.add(it.name)
        }
    }

    return files.sort()
}
