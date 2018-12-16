package com.prithvirajbilla


package object primesieve {

  def primes(n: Int): Seq[Int] = {
    var prime_list = Seq(2)
    3 to n foreach(k => {
      val isPrime = prime_list.takeWhile(prime => prime < math.sqrt(k).intValue()+1).forall(prime => k%prime != 0)
      if(isPrime) {
        prime_list = prime_list :+ k
      }
    })
    return prime_list
  }

}
