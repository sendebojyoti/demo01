
mavenJob('Jenkins Tutorial Demo - Library 1 (DSL)') {

description 'Build job for Jenkins Tutorial / Library 1'

    logRotator {
        numToKeep 1
    }

    scm {
        git {
            remote {
                url 'https://github.com/sendebojyoti/demo01.git'
            }

            branch 'master'

           
        }
    }


    triggers {
        scm 'H/15 * * * *'
        snapshotDependencies false
    }

    rootPOM 'pom.xml'
    goals 'clean install'
    
    publishers {
        archiveArtifacts('**/*')
    }
    
}
