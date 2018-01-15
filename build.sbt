import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.12",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.1",
    libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.1",
    libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.2.1",
    libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.2.1" % "provided"


  )
