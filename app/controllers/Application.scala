package controllers

import play.api._
import play.api.mvc._

import _root_.com.yammer.metrics.scala.Instrumented

object Application extends Controller with Instrumented {
  
  private val metricIndex = metrics.timer("index")
  def index = metricIndex.time { Action {
    Ok(views.html.index("Your new application is ready."))
  }}
  
}