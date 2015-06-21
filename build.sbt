libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.6.1" % "test")

libraryDependencies += "joda-time" % "joda-time" % "2.8.1"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")