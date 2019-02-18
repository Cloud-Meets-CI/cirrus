pipeline {
  agent any

  stages {
    stage('build') {
      steps {
        sh '''chmod +x gradlew
./gradlew assemble'''
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
          sh 'docker -version'
        }
        }
      }
    }
  }
}
