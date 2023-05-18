
pipeline {
  agent any

  stages {
    stage('Checkout SCM')  {
      steps {
        git credentialsId: '1d98a67d-ae83-4971-b884-672adeaabb46', url: 'https://github.com/lakviat/JavaDevelopment'
      }
    }
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

