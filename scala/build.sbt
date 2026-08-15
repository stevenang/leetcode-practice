ThisBuild / scalaVersion := "3.8.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "leetcode-practice-scala",

    libraryDependencies +=
      "org.scalameta" %% "munit" % "1.2.0" % Test,

    testFrameworks +=
      new TestFramework("munit.Framework")
  )