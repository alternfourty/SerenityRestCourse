pipeline {
    agent any
    environment {
        appName = "Serenity_Jenkins"
        GRADLE_HOME = tool 'Gradle'
    }
    stages {
        stage('Stage 1 - Build') {
            steps {
                echo 'Building project'
                bat "${GRADLE_HOME}\\gradle build"
            }
        }
    }
    post{
        always{
            echo "Pipeline complete"
        }
        success{
            echo "Test Execution was successful"
        }
        failure{
            echo "Test Execution Failed"
        }
    }
}