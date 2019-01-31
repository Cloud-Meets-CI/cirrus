pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh './gradlew assemble'
      }
    }
    stage('publish') {
      steps {
        sh 'ls target/'
      }
    }
  }
}