node {
    stage("checkout and test") {
        cleanWorkspace()
        checkout scm
        test()
    }
}

def cleanWorkspace() {
    sh "rm -rf *"
}

def test() {
    try {
        grdl("test")
    } finally {
        archiveUnitTestResults()
    }
}

def grdl(task) {
    println "gradlew ${task}"
    sh "./gradlew ${task}"
}

def archiveUnitTestResults() {
    junit 'build/reports/test-results/test/*.xml'
}