New project from scratch:
1. Make new directory, cd into it
2. touch build.sbt
3. sbt
-- this creates project and target folders

Useful sbt commands:
* compile
* run
* test (runs all tests)
* testQuick (runs only tests that failed before, or which were not run last time)

Prefixing an sbt command with "~" runs that command every time the source code folder changes


Main class goes in top-level/src/main/scala/package-name/ClassName.scala


Creating a new sbt project from a template:
1. Make new directory, cd into it
2. sbt new scala/hello-world.g8
-- Creates a new project from the hello-world template on GitHub