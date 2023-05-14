
lazy val buildSettings = Seq(
  name := "jsonic",
  version := "1.0.0",
  scalaVersion := "2.12.15"
)

scalaVersion := "2.12.12"

projectDependencies += "junit" % "junit" % "4.13.2" % "test"
projectDependencies += "io.netty" % "netty-all" % "4.1.92.Final"
projectDependencies += "org.slf4j" % "slf4j-api" % "2.0.7"
projectDependencies += "org.apache.commons" % "commons-lang3" % "3.8.1"

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
