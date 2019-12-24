/*
Sum square difference

Problem 6
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

object Problem6 {
  val range = 100
  val listRange = List.range(1, range + 1)

  def main(args: Array[String]): Unit = {
    def auxMultiply(range: List[Int]): Int = range match {
      case a if (a.length == 1) => 0
      case b => b.tail.map(2*b.head*_).sum + auxMultiply(b.tail)
    }
    println(auxMultiply(listRange))
  }
}
