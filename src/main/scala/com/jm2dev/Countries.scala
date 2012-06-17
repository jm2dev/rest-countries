package com.jm2dev

import org.scalatra._
import scalate.ScalateSupport

class Countries extends ScalatraServlet with ScalateSupport {
  get("/") {
    contentType = "text/html"

    jade("countries")
  }

  get("/info") {
    contentType = "text/html"

    jade("info")
  }
}
