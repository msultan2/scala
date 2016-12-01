/**
  * Created by mohamedsultan on 01/12/2016.
  */
object Tuples {
  def main(args: Array[String]): Unit = {
    // Tuples can hold values of many types, but they are immutable

    var tupleMarge = (103, "Marge Simpson", 10.25)

    printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)

    // Iterate through a tuple
    tupleMarge.productIterator.foreach{ i => println(i)}

    // Convert Tuple to String
    println(tupleMarge.toString())
  }
}
