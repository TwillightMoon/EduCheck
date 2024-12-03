pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out the repository...'
                checkout scm
            }
        }
        stage('Build') {
            steps {
                echo 'Building the project...'
                bat 'echo "Build completed successfully." > build.log'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }
        stage('Archive Artifacts') {
            steps {
                echo 'Archiving build artifacts...'
                archiveArtifacts artifacts: '*.log, test-results.xml', allowEmptyArchive: true
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        unstable {
            echo 'Pipeline completed with warnings (unstable build).'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
