/*
Smallest multiple

Problem 5
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
object Problem5 {


  def main(args: Array[String]): Unit = {

    val num = 20

    def verifyFunction(n: Int, range: Int): Int = n match {
      case a if List.range(1, range+1).forall(a % _ == 0) => n
      case _ => verifyFunction(n + 1, range)
    }

    println(verifyFunction(1, num))
  }
}

