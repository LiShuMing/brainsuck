name := "brainsuck"

version := "1.0"

scalaVersion := "2.11.8"

enablePlugins(JavaAppPackaging)

libraryDependencies ++= Seq(
  "org.scalatest"    %% "scalatest" % "2.2.3",
  "com.github.scopt" %% "scopt"     % "3.3.0",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0"
)
