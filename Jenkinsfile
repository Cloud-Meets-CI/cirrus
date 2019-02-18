pipeline {
  agent {
    docker {
      image 'ubuntu:latest'
    }

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