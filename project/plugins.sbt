// Easily manage scalac settings across scala versions with this
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.4.4")

// Makes our code tidy
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.6")

// Revolver allows us to use re-start and work a lot faster!
addSbtPlugin("io.spray" % "sbt-revolver" % "0.10.0")

// To keep our dependencies up to date
addSbtPlugin("net.vonbuchholtz" % "sbt-dependency-check" % "3.4.1")

// Enables test coverage analysis
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.9.3")

// Checks Maven and Ivy repositories for dependency updates
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.4")
