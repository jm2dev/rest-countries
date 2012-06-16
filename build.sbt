import AssemblyKeys._

import com.typesafe.startscript.StartScriptPlugin

import de.johoop.cpd4sbt.CopyPasteDetector._

organization := "com.jm2dev"

name := "rest-countries"

version := "1.0.2"

scalaVersion := "2.9.1"

assemblySettings

jarName in assembly := "rest-countries.jar"

resourceGenerators in Compile <+= (resourceManaged, baseDirectory) map { (managedBase, base) =>
  val webappBase = base / "src" / "main" / "webapp"
  for {
    (from, to) <- webappBase ** "*" x rebase(webappBase, managedBase / "main/" )
  } yield {
    Sync.copy(from, to)
    to
  }
}

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

seq(cpdSettings : _*)

libraryDependencies ++= Seq(
                    "org.scalatra" %% "scalatra" % "2.1.0.M1",
                    "org.scalatra" %% "scalatra-scalate" % "2.1.0.M1",
                    "org.scalatra" %% "scalatra-scalatest" % "2.1.0.M1" % "test",
                    "org.scalatest" %% "scalatest" % "1.7.2" % "test",
                    "org.scalatra" %% "scalatra-lift-json" % "2.0.2",
                    "org.eclipse.jetty" % "jetty-webapp" % "8.1.0.RC5",
                    "org.fusesource.scalamd" % "scalamd" % "1.5",
                    "org.slf4j" % "slf4j-api" % "1.6.4",
                    "ch.qos.logback" % "logback-core" % "1.0.2",
                    "ch.qos.logback" % "logback-classic" % "1.0.2",
                    "javax.servlet" % "servlet-api" % "2.5" % "provided"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

