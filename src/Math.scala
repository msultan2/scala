/**
  * Created by mohamedsultan on 30/11/2016.
  */
import scala.math._
object Math {
  def main(args: Array[String]): Unit = {
    "5 + 4 = " + (5 + 4)
    "5 - 4 = " + (5 - 4)
    "5 * 4 = " + (5 * 4)
    "5 / 4 = " + (5 / 4)
    "5 % 4 = " + (5 % 4)

    // Shorthand notation (No randInt++, or randInt--)
    var randInt=0;
    randInt += 1
    "randInt += 1" + randInt

    randInt -= 1
    "randInt -= 1" + randInt

    randInt *= 1
    "randInt *= 1" + randInt

    randInt /= 1
    "randInt /= 1" + randInt

    // Import the math library in the terminal import scala.math._

    println(abs(-8))
    cbrt(64) // Cube root a^3 = n (Find a)
    ceil(5.45)
    round(5.45)
    floor(5.45)
    exp(1) // Euler's number raised to the power
    pow(2, 2) // 2^2
    sqrt(pow(2,2) + pow(2,2))
    hypot(2, 2) // sqrt(X^2 + y^2)
    log10(1000) // = 3 (10 × 10 × 10 = 10^3)
    log(2.7182818284590455) // Natural logarithm to the base e
    min(5, 10)
    max(5, 10)
    (random * (11 - 1) + 1).toInt // Random number between 1 and 10
    toRadians(90)
    toDegrees(1.5707963267948966)

    // acos, asin, atan, atan2, cos, cosh, sin, sinh, tan, tanh
  }
}
