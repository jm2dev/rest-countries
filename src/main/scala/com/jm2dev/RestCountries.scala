package com.jm2dev

import org.eclipse.jetty.servlet.{ServletContextHandler, ServletHolder}
import org.eclipse.jetty.server.Server

object RestCountries {
  def main(args: Array[String]) {
    val port = if (args.isEmpty)
      9091
    else
      args(0).toInt
    val server = new Server(port)
    val context = new ServletContextHandler(ServletContextHandler.SESSIONS);
    context.setContextPath("/")
    context.addServlet(classOf[Countries], "/*")
    context.addServlet(new ServletHolder(new MyDefaultServlet), "/css/*")
    context.addServlet(new ServletHolder(new MyDefaultServlet), "/images/*")
    context.addServlet(new ServletHolder(new MyDefaultServlet), "/img/*")
    context.addServlet(new ServletHolder(new MyDefaultServlet), "/js/*")
    context.addServlet(new ServletHolder(new MyDefaultServlet), "/check.txt")

    server.setHandler(context)

    server.start
    server.join
  }
}
