ThisBuild / scalaVersion:= "2.12.7"
ThisBuild / organization := "com.example"

lazy val hello = (project in file("."))
    .settings(
        name := "hello",
        libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    )
