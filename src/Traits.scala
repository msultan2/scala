/**
  * Created by mohamedsultan on 05/12/2016.
  */
object Traits {
  def main(args: Array[String]): Unit = {
    val superman = new Superhero("Superman")
    println(superman.fly)
    println(superman.hitByBullet)
    println(superman.ricochet(2500))
  }

  // A trait is a like a Java interface in that a class can extend more then 1
  // Unlike Java interfaces traits can provide concrete methods and fields
  trait Flyable {
    def fly : String

  }

  trait Bulletproof {
    def hitByBullet : String

    // You can define concrete methods in traits
    def ricochet(startSpeed : Double) : String = {
      "The bullet ricochets at a speed of %.1f ft/sec".format(startSpeed * .75)
    }
  }

  // The first trait starts with extends and then with for each other
  class Superhero(val name : String) extends Flyable with Bulletproof{
    def fly = "%s flys through the air".format(this.name)

    def hitByBullet = "The bullet bounces off of %s".format(this.name)
  }
}
