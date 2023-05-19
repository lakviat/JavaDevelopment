pipeline {
    agent any

        parameters {
            choice(name: 'ENVIRONMENT', choices: ['QA', 'Development', 'Staging', 'Production'], description: 'Select the target environment')
         extendedChoice(name: 'GHERKIN_FILE', description: 'Select Gherkin file(s) to execute', multiSelectDelimiter: ',', type: 'PT_MULTISELECT', value: '', groovyScript: '''
                    def files = []
                    def directory = new File('.').absolutePath
                    def pattern = ~/.*\.src/test/java/Features$/

                    directory.eachFileRecurse(groovy.io.FileType.FILES) {
                        if (it.name =~ pattern) {
                            files.add(it.name)
                        }
                    }

                    return files.sort().join(',')
                ''')
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

        stage('Deploy QA ') {
            steps {
                checkout scm
            }
        }
    }
}