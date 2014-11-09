package demo
import scala.scalajs.js

/**
 * JS-specific library code
 */
object DemoPlatform {
  def evalJS(s: String): String = {
    js.eval(s).toString
  }
  val whoAmI = "Scala.js"
}
