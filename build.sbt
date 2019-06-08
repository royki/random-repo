version := "0.1"
organization := "com.random"
scalaVersion := "2.12.8"
triggeredMessage := Watched.clearWhenTriggered
ensimeScalaVersion in ThisBuild := "2.12.8"
ensimeIgnoreScalaMismatch in ThisBuild := true

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "org.pegdown" % "pegdown" % "1.6.0" % "test"
)
