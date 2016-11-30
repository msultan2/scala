/**
  * Created by mohamedsultan on 30/11/2016.
  */
object Strings {
  def main(args: Array[String]): Unit = {
    var randSent = "I saw a dragon fly by"

    // Get the 3rd index value
    println("3rd Index : " + randSent(3))

    // Get String length
    println("String length " + randSent.length())

    // Concatenate strings
    println(randSent.concat(" and explode"))

    // Compare strings for equality
    println("Are strings equal " + "I saw a dragon".equals(randSent))

    // Get index of a match
    println("dragon starts at index ", randSent.indexOf("dragon"))

    // Convert a string into an array
    val randSentArray = randSent.toArray

    for (v <- randSentArray)
      println(v)
  }

}
