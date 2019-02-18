pipeline {
  agent any

  stages {
    stage('build') {
      steps {
        //sh '''chmod +x gradlew
//./gradlew assemble'''
        echo 'build'
      }
    }
    stage('publish') {
      steps {
        sh 'ls'
      }
    }
    stage('docker') {
      steps {
        script {
        docker.withTool("default") {
          sh 'docker --version'
        }
        }
      }
    }
  }
}
