package com.jm2dev

import org.scalatra.test.scalatest._
import org.scalatest.FunSuite

class CountriesTests extends ScalatraSuite with FunSuite {
  addFilter(classOf[Countries], "/*")

  test("Info page") {
    get("/info") {
      status should equal (200)
      body should include ("Information page")
    }
  }
}
