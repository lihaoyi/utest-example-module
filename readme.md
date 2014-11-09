utest-example-module
====================

This is a simple hello-world cross-platform module built using Scala.js. It shows off the basic principles of how to develop a cross-cross-build {Scala.js/Scala-JVM} X {2.10, 2.11} Scala library.

The contents of this library are rather ad-hoc, purely meant to serve as a proof of concept. It includes:

- A shared `Demo.square` function, which calculates the square of an `Int`, and behaves identically
- A shared `DemoPlatform.evalJS` function, which is implemented twice: in Scala.js using `eval`, and in Scala-JVM using Rhino, but behaves identically on both
- A `DemoPlatform.whoAmI` constant, which behaves differently on Scala.js and Scala-JVM

Apart from the implementation of the library, it also includes:

- Shared tests, which test both `DemoPlatform.square` and `DemoPlatform.evalJS`
- Platform-specific tests, which test `DemoPlatform.whoAmI` to verify that it has the correct (distinct!) values on Scala.js and Scala-JVM

The purpose of this library is to show you where to put things if you want to build a cross-platform Scala.js/Scala-JVM library: where to put the shared code, where to put platform-specific code, and how to share tests.

The shared code lives in `js/shared` and is symlinked to `jvm/shared`, ensuring that it only exists in one copy on the filesystem and cannot fall out of sync.

Usage
-----

There are various ways to exercise this skeleton after cloning the repo:

- `test` runs all tests on both Scala.js and Scala-JVM
- `js/test` and `jvm/test` only runs their respective half of the tests
- `+test` runs all tests in all of {Scala.js, Scala-JVM} X {2.10.4, 2.11.2}
- `+js/test` and `+jvm/test` behave as you'd expect.