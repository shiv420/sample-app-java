pipeline {
    agent any
    options {
        timeout(time: 1, unit: 'MINUTES') 
    }
     stages {
        stage('Git Pull and Compile') {
            steps {
                // Get some code from a GitHub repository
               git branch: 'Develop', url: 'https://github.com/shiv420/sample-app-java.git'

                // Run Maven on a Unix agent.
                sh "/opt/maven/bin/mvn -DskipTests=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    echo 'Git Pull and compile successfully.'
                }
            }
        }
        stage('Deploy'){
            steps{
                sh "cp target/*.war /opt/"
            }
            post{
              success{
               echo 'Deploy successfully' 
             } 
            }
            
        }
    }
}
