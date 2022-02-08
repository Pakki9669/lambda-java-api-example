pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
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
