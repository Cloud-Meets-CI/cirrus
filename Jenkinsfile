pipeline {
  agent any
  tools {
    docker 'default'
  }
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
        sh 'docker -version'
      }
    }
  }
}
