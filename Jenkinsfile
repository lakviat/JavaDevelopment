@Library('my-shared-library@1.0') // Specify the version of the shared library here
import com.example.MySharedLibrary

pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        // Build your code here
      }
    }

    stage('Test') {
      steps {
        // Run tests here
      }
    }

    stage('Publish Checks') {
      steps {
        // Configure Checks API publisher for GitHub
        step([$class: 'ChecksPublisher',
          provider: [$class: 'GitHubChecksPublisher',
            apiUri: 'https://api.github.com',
            statusUrl: 'https://github.com',
            checkRunTitle: 'My Jenkins Check',
            completedStatus: 'SUCCESS',
            notBuiltStatus: 'CANCELLED',
            notRunStatus: 'SKIPPED',
            customHeaders: [[name: 'Authorization', value: 'Bearer <your_personal_access_token>']],
            showMatrixConfiguration: false,
            showAggregatedResults: true
          ]
        ])
      }
    }
  }
}

