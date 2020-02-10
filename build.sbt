name := "akka-dockerize"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http"   % "10.1.11",
  "com.typesafe.akka"  %% "akka-stream" % "2.5.26"
)

enablePlugins(JavaAppPackaging)

// Dockerfileに書く内容
packageName in Docker := "akka-dockerize"
version in Docker := "1.0"
dockerExposedPorts := List(8080)
dockerBaseImage := "openjdk:latest"
dockerCmd := Nil
