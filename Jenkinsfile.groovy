pipeline {
    agent any
    stage('ensureTools') {
        def jdkTool= tool 'jdk8'
        def mvnTool= tool 'Maven 3.3.9'
        //jdk 'jdk8'
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
