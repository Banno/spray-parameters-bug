name := "spray-paraeters-bug"

scalaVersion := "2.10.5"

scalacOptions := Seq(
  "-encoding", "utf8",
  "-feature",
  "-unchecked",
  "-deprecation",
  "-target:jvm-1.6",
  "-language:_",
  "-Xlog-reflective-calls",

  "-Xlog-implicits"

  // my compiler options from ~/.sbt/0.13/global.sbt
  // "-Xlint",
  // "-deprecation",
  // "-unchecked",
  // "-Xlog-free-terms",
  // "-Xlog-free-types"
)

libraryDependencies ++= Seq(
  "com.chuusai" % "shapeless_2.10.4" % "2.1.0",
  "com.typesafe.akka" %% "akka-actor" % "2.3.7",
  "io.spray" %% "spray-can" % "1.3.3",
  "io.spray" %% "spray-routing-shapeless2" % "1.3.3"
)
