ThisBuild / version := "2024.3.1"

ThisBuild / scalaVersion := "3.4.0"

lazy val root = (project in file("."))
  .settings(
    name := "gekas-server",
    idePackagePrefix := Some("com.github.velet5.gekas"),
    libraryDependencies ++= Dependency.compile
  )
