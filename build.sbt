val cross = new utest.jsrunner.JsCrossBuild(
  // Cross-platform settings
  organization := "com.lihaoyi",
  name := "demo",
  version := "0.1"
)

lazy val js = cross.js.settings(
  // JS-specific settings
)

lazy val jvm = cross.jvm.settings(
  libraryDependencies += "rhino" % "js" % "1.7R2"
)
