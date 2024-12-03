pipeline {
    agent any
    environment {
        BUILD_LOG = 'build.log'
        TEST_RESULTS = 'test-results.xml'
    }
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out the repository...'
                checkout scm
            }
        }
        stage('Build') {
            steps {
                echo 'Simulating build process...'
                bat """
                    echo "Build completed successfully." > ${BUILD_LOG}
                """
            }
        }
        stage('Test') {
            steps {
                echo 'Simulating test process...'
                bat """
                    echo "<testsuite tests='1' failures='0'><testcase classname='DummyTest' name='Test1'/></testsuite>" > ${TEST_RESULTS}
                """
                junit "${TEST_RESULTS}"
            }
        }
        stage('Archive Artifacts') {
            steps {
                echo 'Archiving build artifacts...'
                archiveArtifacts artifacts: "**/*.log", allowEmptyArchive: true
            }
        }
    }
    post {
        always {
            echo 'Pipeline finished.'
        }
        success {
            echo 'Build was successful.'
        }
        unstable {
            echo 'Build completed, but it is unstable. Check test results and logs.'
        }
        failure {
            echo 'Build failed.'
        }
    }
}
