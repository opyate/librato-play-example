import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "librato-play-example"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      "com.yammer.metrics" % "metrics-core" % "2.1.2",
      "com.yammer.metrics" %% "metrics-scala" % "2.1.2",
      "com.librato.metrics" % "metrics-librato" % "2.1.2.2"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
