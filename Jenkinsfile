#!/usr/bin/env groovy
node('maven') {
    stage 'build'
    openshiftBuild(buildConfig: 't2-paas-poc-build', showBuildLogs: 'true')

}