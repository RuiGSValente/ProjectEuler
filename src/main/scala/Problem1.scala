/*
Multiples of 3 and 5

Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */

object Problem1 {
  def verify(x: Int): Int = {
    if ((x % 3 == 0) || (x % 5 == 0)) x
    else 0
  }
  def main(args: Array[String]): Unit = {
    def auxFunction(num: Int): Int = num match {
      case 1000 => 0
      case _ => verify(num) + auxFunction(num + 1)
    }
    println(auxFunction(num = 0))
  }
}
