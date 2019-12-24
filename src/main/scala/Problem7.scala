/*
10001st prime

  Problem 7
  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

  What is the 10 001st prime number?
 */
object Problem7 {
  def verifyIfPrime(x: Long): Boolean = {
  val value = scala.math.sqrt(x).toLong
    def verifyAux(y: Long): Boolean = y match {
      case _ if x == 1 => false
      case _ if x == 2 => true
      case _ if x == 3 => true
      case _ if y == 3 => (x % 3 != 0) && (x % 2 != 0)
      case _ => (x % y != 0 ) && verifyAux(y - 2)
    }
  verifyAux(value + 1 - value%2)
  }

  def main(args: Array[String]): Unit = {
    val maxCardinal = 10001
    def verifyNumberPrime(number: Long, cardinal: Int): Int = cardinal match{
      case a if (a == maxCardinal) => number.toInt-1
      case _ if verifyIfPrime(number) => verifyNumberPrime(number+1, cardinal+1)
      case _ => verifyNumberPrime(number+1, cardinal)
    }

    println(verifyNumberPrime(number = 1, cardinal = 0))
  }
}
