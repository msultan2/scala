/**
  * Created by mohamedsultan on 06/12/2016.
  */
object ExceptionHandling {
  def main(args: Array[String]): Unit = {
    def divideNums(num1 : Int, num2 : Int) = try
    {
      (num1 / num2)
    } catch {
      case ex: java.lang.ArithmeticException => "Can't divide by zero"
    } finally {
      // Clean up after exception here
    }

    println("3 / 0 = " + divideNums(3,0))
  }
}
