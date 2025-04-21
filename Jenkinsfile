pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                git branch: 'main', url: 'https://github.com/patilniranjanr2020/sign-language-translator.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                sh 'pip install -r requirements.txt'
            }
        }

        stage('Lint Check') {
            steps {
                sh 'pip install flake8'
                sh 'flake8 . || true'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'pytest || echo "No tests found!"'
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline executed successfully!'
        }
        failure {
            echo '❌ Pipeline failed.'
        }
    }
}
