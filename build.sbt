scalaVersion in ThisBuild := "2.11.12"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.8"
lazy val root = (project in file("."))
  .settings(
    name := "Dada2026"
  )
