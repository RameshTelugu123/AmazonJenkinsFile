pipeline {
    agent any
    tools {
        jdk 'jdk21'
        maven 'maven3.9.15'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/RameshTelugu123/AmazonJenkinsFile.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Publish HTML Report') {
            steps {
                publishHTML([
                    reportDir: 'target/site',
                    reportFiles: 'surefire-report.html',
                    reportName: 'Test Report'
                ])
            }
        }
    }
}
