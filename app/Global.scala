import play.api.GlobalSettings
import play.api.Play
import com.librato.metrics._

object Global extends GlobalSettings {

  override def onStart(app: play.api.Application) {
    val libratoUsername = Play.maybeApplication.flatMap(_.configuration.getString("librato.username")).getOrElse("someone@example.org")
    val libratoAPIKey = Play.maybeApplication.flatMap(_.configuration.getString("librato.apikey")).getOrElse("abc")
    play.Logger.info("Starting app with Librato username=[%s], APIKey=[%s]".format(libratoUsername, libratoAPIKey))
    LibratoReporter.enable(LibratoReporter.builder(libratoUsername, libratoAPIKey, "librato-play-example"), 10, java.util.concurrent.TimeUnit.SECONDS)
  }
}