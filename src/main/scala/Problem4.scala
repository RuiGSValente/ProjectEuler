/*
Largest palindrome product

Problem 4
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

object Problem4 {
  def isPalindrome(n: Int): Boolean = n match{
    case x if (((((x%10001)%1010)%100==0) && (x<=99999) && (x>=10000))||(((x%100001)%10010)%1100==0) && (x<=999999) && (x>=100000)) => true
    case _ => false
  }

  def isProduct(n: Int): Boolean = {
    def isProductAux(n: Int, x:Int): Boolean  = n match{
      case z_0 if ((z_0.toDouble%x==0) && ((z_0/x).toDouble%1==0) && (z_0/x>=100) && (z_0/x<=999)) => true
      case z_1 if (x>100) => isProductAux(z_1, x-1)
      case _ => false
    }
    isProductAux(n, 999)
  }

  def main(args: Array[String]): Unit = {

    val num = 999999

    def auxFunction(num: Int): Int = num match {
      case x_0 if (isPalindrome(x_0) && isProduct(x_0)) => x_0
      case x_1 if (x_1>10000) => auxFunction(num-1)
      case _ => 0
    }

    println(auxFunction(num))
  }

}
