pipeline {
    tools {
        maven 'localmaven'
        jdk 'localjava'
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
        stage('Create a Docker Image'){
            steps{
                sh "pwd"
//                sh "ls -a"
                sh "docker build .t  sendebojyoti:latest"
            }

        }

//        stage('Deploy to Production'){
//            steps{
//                timeout(time:5, unit:'DAYS'){
//                    input message:'Approve PRODUCTION Deployment?'
//                }
//                build job: 'Deploy_Application_Prod_Env'
//            }
//        }
    }
}