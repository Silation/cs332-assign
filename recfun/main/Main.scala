package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
import scala.annotation.tailrec

  def pascal(c: Int, r: Int): Int = {
    require { r >= c }
    
    if (c * r == 0 || r == c) 1
    else
      pascal(c-1, r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    
    @tailrec
    def inner_balance(chars: List[Char], left_paren_stack: Int): Boolean = {
      if(chars.isEmpty && left_paren_stack == 0) true
      else if(chars.isEmpty && left_paren_stack != 0) false
      else if(left_paren_stack < 0) false
      
      else if(chars.head == '(')
        inner_balance(chars.tail, left_paren_stack + 1)
      else if(chars.head == ')')
        inner_balance(chars.tail, left_paren_stack - 1)
      else
        inner_balance(chars.tail, left_paren_stack)
      
    }
    
    inner_balance(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def innerChange(money: Int, coins: List[Int], method: Int): Int = {
      
      if (money < 0) 0
      else if (money == 0) 1
      
      else{
        if (coins.isEmpty) 0
        else
          innerChange(money - coins.head, coins, method) + innerChange(money, coins.tail, method)
      }
    }
    
    innerChange(money, coins, 0)
  }
}
