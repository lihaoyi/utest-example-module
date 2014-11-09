package demo

import org.mozilla.javascript.Context

/**
 * JVM-specific library code
 */
object DemoPlatform {
  def evalJS(s: String): String = {
    val mozillaJsContext = Context.enter()
    val scope = mozillaJsContext.initStandardObjects()

    val scriptjs = mozillaJsContext.compileString(
      s, "my-script", 1, null
    )

    Context.toString(scriptjs.exec(mozillaJsContext, scope))
  }
  val whoAmI = "Scala-JVM"
}
