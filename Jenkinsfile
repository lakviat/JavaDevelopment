@Library('my-shared-library@1.0') // Specify the version of the shared library here
import com.example.MySharedLibrary

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Call a function from the shared library
                MySharedLibrary.build()
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Call another function from the shared library
                MySharedLibrary.test()
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Call another function from the shared library
                MySharedLibrary.deploy()
            }
        }
    }
}
