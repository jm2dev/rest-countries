package com.jm2dev

import org.scalatra.test.scalatest._
import org.scalatest.FunSuite

class CountriesTests extends ScalatraSuite with FunSuite {
  addServlet(classOf[Countries], "/*")

  test("Info page") {
    get("/info") {
      status should equal (200)
      body should include ("Information page")
    }
  }

  test("Countries") {
    get("/") {
      status should equal (200)
      body should include ("Espanya")
      body should include ("United Kingdom")
      body should include ("Scotland")
      body should include ("Wales")
    }
  }
}
