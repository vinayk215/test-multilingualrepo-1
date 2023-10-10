pipeline{
    agent any
    environment {
        PATH = "$PATH:/usr/share/maven/bin"
    }

    stages{
       stage('GetCode'){
            steps{
                git branch: 'bad', changelog: false, poll: false, url: 'https://github.com/vinayk215/test-multilingualrepo-1-QG.git'
            }
         }        
       stage('Build'){
            steps{
                sh 'mvn clean package'
            }
         }
        stage('SonarQube analysis') {
            steps{
                withSonarQubeEnv('sonarqube-9.9.2') {
                    sh "mvn sonar:sonar"
                }
            }
        }
        stage("Quality Gate") {
            steps {
        //        timeout(time: 1, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
           //     }
            }
        }
    }
}
