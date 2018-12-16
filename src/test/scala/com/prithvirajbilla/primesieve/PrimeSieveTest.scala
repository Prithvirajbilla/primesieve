package com.prithvirajbilla.primesieve

import org.scalatest.WordSpec
import org.scalatest.MustMatchers._

class PrimesieveTest extends WordSpec {
  "primesieve.primes" should {
    "generate primes if n < 10" in {
      // Arrange -- Act
      val primesList = primes(10)

      // Assert
      primesList must be (Seq(2,3,5,7))
    }
  }
}
