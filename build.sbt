version := "0.1"

scalaVersion := "2.13.0"

lazy val helloWorld = (project in file("."))
  .enablePlugins(AssemblyPlugin)
  .settings(
    name := "TestDeployProject",
    mainClass in (Compile, run) := Some("ru.test.helloworld.HelloWorld"),
    mainClass in assembly := Some("ru.test.helloworld.HelloWorld"),
    assemblyJarName in assembly := "HouseKeepingSystem.jar"
  )
