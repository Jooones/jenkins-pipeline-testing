node {
    stage("checkout and test") {
        checkout scm
        grdl("test")
    }
}

def grdl(task) {
    println "gradlew ${task}"
    sh "./gradlew ${task} --info --stacktrace"
}