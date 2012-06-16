package com.jm2dev

import org.eclipse.jetty.servlet.DefaultServlet
import org.eclipse.jetty.util.resource.Resource

class MyDefaultServlet extends DefaultServlet {
  override def getResource(resourceString: String): Resource =
  {
    val url = this.getClass().getResource(resourceString)
    Resource.newResource(url)
  }
}
