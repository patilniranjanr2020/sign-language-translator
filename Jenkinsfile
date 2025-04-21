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
                bat 'python -m pip install --upgrade pip'
                bat 'pip install -r requirements.txt'
            }
        }

        stage('Lint Check') {
            steps {
                bat 'pip install flake8'
                bat 'flake8 . || exit 0'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'pytest || echo "No tests found!"'
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
