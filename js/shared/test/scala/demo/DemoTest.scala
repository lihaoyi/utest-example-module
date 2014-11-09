package demo
import utest._

/**
 * Cross-platform test code
 */
object DemoTest extends utest.TestSuite{
  val tests = TestSuite{
    'square{
      // Shared tests for the shared stuff in `Demo`
      * - assert(Demo.square(1) == 1)
      * - assert(Demo.square(2) == 4)
      * - assert(Demo.square(3) == 9)
    }
    'evalJS{
      // Tests for stuff in `DemoPlatform`. Note that even though the
      // `evalJS` is defined differently in both JS (which uses the
      // native `eval` function) and JVM (which uses Rhino) we can run
      // the same tests on both implementations
      * - assert(DemoPlatform.evalJS("1 + 2") == "3")
      * - assert(
        DemoPlatform.evalJS("(function(x){return x + 5})(10)") == "15"
      )
    }
  }
}
