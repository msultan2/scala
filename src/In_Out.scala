/**
  * Created by mohamedsultan on 30/11/2016.
  */
import scala.io.StdIn.{readLine, readInt }

object In_Out {

  def main(args: Array[String]): Unit = {

    println("Different prints")

    val name="Derek"
    val age=39
    val weight=175.5

    println(s"Hello $name")
    println(f"I am ${age+1} and weight $weight%.2f")
/*
    %c for character
    %d for interger
    %f for floats
    %s for Strings
*/
    println("spaces and left/right justifications")
    printf("'%5d'\n",5)
    printf("'%-5d'\n",5)

    println("for zero filling")
    printf("'%05d'\n",5)

println("Decimal places")
    printf("'%.5f'\n",3.14)

    println("Differnt Inputs")
    var numberGuess = 0

    do {
      print("Guess a number ")
      numberGuess = readLine.toInt
      //    readInt,readDouble,readByte,readShort,readLong
    } while (numberGuess != 15)

    printf("You guessed the secret number %d\n", 15)
  }


}
