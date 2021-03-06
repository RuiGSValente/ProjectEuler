/*
Even Fibonacci numbers

Problem 2
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
object Problem2 {

  private def nextFibonacci(a: Int, b: Int): Int = {
  a + 4 * b
}

  def auxFunction(a: Int, b: Int): Int = nextFibonacci(a, b) match {
    case threshold if (threshold > 4000000) => 0
    case firstFibonacci if (a == 0 && b == 2) =>  2 + firstFibonacci + auxFunction(b, firstFibonacci)
    case nextFibonacci =>  nextFibonacci + auxFunction(b, nextFibonacci)
  }

  def main(args: Array[String]): Unit = {
    println(auxFunction(0, 2))
  }
}
