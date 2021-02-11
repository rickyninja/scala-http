ThisBuild / scalaVersion := "2.11.8"
ThisBuild / organization := "com.acme"

name := "My HTTP"
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
libraryDependencies ++=  Seq(
    "org.scalaj" %% "scalaj-http" % "2.4.2",
)

