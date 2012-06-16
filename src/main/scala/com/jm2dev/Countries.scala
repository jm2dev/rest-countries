package com.jm2dev

import org.scalatra._
import scalate.ScalateSupport

class Countries extends ScalatraFilter with ScalateSupport {
  get("/info") {
    contentType="text/html"

    jade("info")
  }
}
