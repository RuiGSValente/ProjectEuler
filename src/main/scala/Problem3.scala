/*
Largest prime factor

Problem 3
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143?
 */

object Problem3{
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

    val num = 600851475143L

    def auxFunction(value: Long, biggestPrime: Long, primeTest: Long): Long = {
      value match {
        case 1 => biggestPrime
        case x if (verifyIfPrime(primeTest) && (x % primeTest == 0)) => auxFunction(x/primeTest, primeTest, primeTest)
        case _ if (primeTest == 2) => auxFunction(value, biggestPrime, primeTest + 1)
        case _ => auxFunction(value, biggestPrime, primeTest + 2)
      }
    }

    println(auxFunction(num, biggestPrime = 1, primeTest = 2))

  }
}
