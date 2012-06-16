addSbtPlugin("de.johoop" % "cpd4sbt" % "1.1.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.8.3")

addSbtPlugin("com.typesafe.startscript" % "xsbt-start-script-plugin" % "0.5.1")

resolvers +=
  Resolver.url("heikoseeberger", new URL("http://hseeberger.github.com/releases"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

resolvers += {
  val typesafeRepoUrl = new java.net.URL("http://repo.typesafe.com/typesafe/ivy-releases")
  val pattern = Patterns(false, "[organisation]/[module]/[sbtversion]/[revision]/[type]s/[module](-[classifier])-[revision].[ext]")
  Resolver.url("Typesafe Ivy Snapshot Repository", typesafeRepoUrl)(pattern)
}

resolvers ++= Seq(Resolver.url("sbt-plugin-releases",
                                          new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns))

addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.0.10")  