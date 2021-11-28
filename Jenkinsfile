pipeline {
    tools {
        maven 'localmaven'
        jdk   'localjava'
    }
    agent any

    stages {
        stage('Build Application') {
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo "Now Archiving the Artifacts...."
                    // archiveArtifacts artifacts: '**/*'
                }
            }
        }

        stage('Create a Docker Image') {
            steps {
                sh "pwd"
                sh "docker build . -t sendebojyoti:latest"
            }
        }
    }
}