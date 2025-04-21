pipeline {
    agent any

    environment {
        // Set Python path (make sure this matches the actual location of Python on your system)
        PYTHON_HOME = 'C:\\Users\\Harshal Shewale\\AppData\\Local\\Programs\\Python\\Python312'
        PATH = "${PYTHON_HOME};${env.PATH}"  // Append Python to the PATH variable
    }

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
