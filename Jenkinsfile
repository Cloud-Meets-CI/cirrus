pipeline {
  agent any
  tools {
    org.jenkinsci.plugins.docker.commons.tools.DockerTool 'default'
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
