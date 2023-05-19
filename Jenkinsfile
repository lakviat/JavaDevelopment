pipeline {
    agent any

        parameters {
            choice(name: 'ENVIRONMENT', choices: ['QA', 'Development', 'Staging', 'Production'], description: 'Select the target environment')

        extendedChoice(name: 'GHERKIN_FILE', description: 'Select Gherkin file to execute', multiSelectDelimiter: ',', type: 'PT_MULTISELECT', value: '', groovyScript: '''
                    def files = []
                    def directory = new File('.').absolutePath
                    def pattern = ~/.*\.feature$/

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

        stage('Deploy QA ') {
            steps {
                checkout scm
            }
        }
    }
}