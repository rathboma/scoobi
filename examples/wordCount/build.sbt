name := "Scoobi Word Count"

version := "1.0"

scalaVersion := "2.9.2"

scalacOptions ++= Seq("-Ydependent-method-types", "-deprecation")

libraryDependencies ++= Seq(
  "com.nicta" %% "scoobi" % "0.5.0-FOURSQUARE",
  "org.specs2" %% "specs2" % "1.11" % "optional"
  )


resolvers ++= Seq("Cloudera Maven Repository" at "https://repository.cloudera.com/content/repositories/releases/",
                  "Packaged Avro" at "http://nicta.github.com/scoobi/releases/",
                  "Sonatype-snapshots" at "http://oss.sonatype.org/content/repositories/snapshots")
