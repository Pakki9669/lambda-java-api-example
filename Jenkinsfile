pipeline {
    agent any
    tools {
      //  maven 'Maven_3.5.4'
    }
    stages {
        stage('Compile'){
            steps{
               // def jdkTool= tool 'jdk8'
                //def mvnTool= tool 'Maven 3.3.9'
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
