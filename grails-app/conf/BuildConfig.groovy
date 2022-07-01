grails.servlet.version = "3.0" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.work.dir = "target/work"
grails.project.target.level = 1.7
grails.project.source.level = 1.7
grails.tomcat.jvmArgs = ["-Xms384m", "-Xmx2000m", "-UseJVMCIClassLoader"] // This last arg is to test GraalVM
grails.project.dependency.resolver = "maven" // or ivy
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    legacyResolve false // whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility

    repositories {
        inherits true // Whether to inherit repository definitions from plugins
        grailsCentral()
        mavenLocal()
        mavenCentral()
        grailsPlugins()
        grailsHome()
        mavenRepo "http://repo.grails.org/grails/core"
        mavenRepo "http://repo.grails.org/grails/plugins"
        mavenRepo "http://download.java.net/maven/2/"
        mavenRepo "http://repository.jboss.com/maven2/"
        mavenRepo "http://maven.springframework.org/milestone/"
        mavenRepo "http://mvnrepository.com/artifact/" //Add this Repo to download Logentries log4j Library
        mavenRepo "https://mvnrepository.com/artifact/" //Add this Repo to download Logentries log4j Library
        mavenRepo 'http://repo.smokejumperit.com'
        mavenRepo 'http://repo.grails.org/grails/repo/'
        mavenRepo "https://mvnrepository.com/artifact/com.itextpdf/itextpdf"
        mavenRepo "http://repo.grails.org/grails/libs-releases/"
        mavenRepo "http://m2repo.spockframework.org/ext/"
        mavenRepo "http://m2repo.spockframework.org/snapshots/"
        mavenRepo "http://oss.sonatype.org/content/repositories/snapshots"
        mavenRepo "http://jcenter.bintray.com/"
        mavenRepo "https://mvnrepository.com/artifact/org.openclover"
    }

    dependencies {        
        runtime 'mysql:mysql-connector-java:5.1.22'
        test "org.grails:grails-datastore-test-support:1.0.2-grails-2.4"
    }

    plugins {
        build ":tomcat:8.0.33"        
        compile ":scaffolding:2.1.2"
        compile ':cache:1.1.8'        
        compile ":asset-pipeline:2.5.7"        
        runtime ":hibernate4:4.3.10" 
        runtime ":database-migration:1.4.0"
        runtime ":jquery:1.11.1"
        compile ":jdbc-pool:7.0.47"
        compile ':redis:1.6.2'
    }
}
