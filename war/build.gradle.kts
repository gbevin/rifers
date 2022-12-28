plugins {
    war
}

base {
    archivesName.set("rifers")
    version = 1.0
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":app"))
}

tasks.war {
    webAppDirectory.set(file("../app/src/main/webapp"))
    webXml = file("src/web.xml")
    rootSpec.exclude("**/jetty*.jar", "**/slf4j*.jar", "**/rife2*-agent.jar")
}

tasks.test {
    enabled = false
}