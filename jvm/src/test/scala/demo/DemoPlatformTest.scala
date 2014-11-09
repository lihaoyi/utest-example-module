package demo

import utest._

/**
 * JVM-specific test code
 */
object DemoPlatformTest extends utest.TestSuite{
  val tests = TestSuite{
    'whoAmI{
      assert(DemoPlatform.whoAmI == "Scala-JVM")
    }
  }
}
