pipeline {
    agent any
    tools {
      maven 'Maven_3.10.0'
    }
    stages {
        stage('Compile'){
            steps{
                sh script: 'mvn clean -U install compile'
            }
        } 
        stage('build') {
            steps {
                echo "Hello World!"
            }
        }
    }
}
