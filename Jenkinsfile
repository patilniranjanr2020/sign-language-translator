pipeline {
    agent any

    environment {
        ANDROID_HOME = '/path/to/android/sdk'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/patilniranjanr2020/sign-language-translator.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    sh './gradlew clean build'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    sh './gradlew test'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    echo 'Deploying to the relevant environment'
                }
            }
        }
    }

    post {
        success {
            echo 'Build and tests completed successfully!'
        }

        failure {
            echo 'There was a problem with the build.'
        }
    }
}
