pipeline {
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
