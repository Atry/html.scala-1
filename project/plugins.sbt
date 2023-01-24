addSbtPlugin(
  "com.thoughtworks.sbt-best-practice" % "sbt-best-practice" % "8.2.4"
)

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.15")

addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.1.1")

addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")

addSbtPlugin("org.lyranthe.sbt" % "partial-unification" % "1.1.2")

addSbtPlugin("com.thoughtworks.example" % "sbt-example" % "9.2.1")

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.21.1")

libraryDependencies += "net.sourceforge.htmlunit" % "htmlunit" % "2.70.0"

libraryDependencies += "io.circe" %% "circe-generic" % "0.12.3"

libraryDependencies += "com.softwaremill.sttp" %% "circe" % "1.7.2"

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.12.0")

addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "3.0.2")

addSbtPlugin("com.thoughtworks.sbt-scala-js-map" % "sbt-scala-js-map" % "4.1.1")

addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.3.6")
