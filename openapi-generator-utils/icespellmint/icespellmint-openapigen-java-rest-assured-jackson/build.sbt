lazy val root = (project in file(".")).
  settings(
    organization := "org.openapitools",
    name := "icespellmint-openapigen-java-rest-assured-jackson",
    version := "1.0.0",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.21",
      "io.rest-assured" % "scala-support" % "4.0.0",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.9.9" % "compile",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.9.9" % "compile",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.9" % "compile",
      "org.threeten" % "threetenbp" % "1.4.0" % "compile",
      "com.squareup.okio" % "okio" % "1.13.0" % "compile",
      "junit" % "junit" % "4.13" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
