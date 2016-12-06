/**
  * Created by mohamedsultan on 01/12/2016.
  */
object Classes {
  def main(args: Array[String]): Unit = {
    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName, rover.getSound)

    val whiskers = new Animal("Whiskers", "Meow")
    println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}")

    println(whiskers.toString)

    val spike = new Dog("Spike", "Woof", "Grrrr")

    spike.setName("Spike")
    println(spike.toString)

    val fang = new Wolf("Fang")
    fang.moveSpeed = 36.0
    println(fang.move)
  }


  // Classes are used as blueprints to create objects
  // Objects define the attributes (fields) and capabilities (methods) of an
  // object

  class Animal(var name : String, var sound : String) {
    this.setName(name)

    // Any code that follows the class name is executed each time an
    // object is created as part of the Primary Constructor

    // This function is defined in the Animal companion object below
    val id = Animal.newIdNum

    // You must initialize all fields
    // protected means the field can only be accessed directly by methods
    // defined in the class or by subclasses
    // private fields can't be accessed by subclasses of Animal
    // public fields can be accessed directly by anything

    // protected var name = "No Name"
    // protected var sound = "No Sound"

    // Getters and setters are used to protect data
    def getName() : String = name
    def getSound() : String = sound
    def setName(name : String){
      // Check if the String contains numbers and if so don't allow
      if(!(name.matches(".*\\d+.*")))

      // this allows us to refer to any object without knowing its name
        this.name = name
      else
        this.name = "No Name"
    }
    def setSound(sound : String) {
      this.sound = sound
    }

    // Subclasses can't call this constructor unlike with Java
    def this (name : String){

      // This calls the primary constructor defined on the class line
      this("No Name", "No Sound")
      this.setName(name)
    }

    def this (){
      // This calls the primary constructor defined on the class line
      this("No Name", "No Sound")
    }

    // You can override any other method
    override def toString() : String = {

      // How to format Strings
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }

  }

  // The companion object for a class is where you'd define static class
  // variables and functions in Java
  object Animal {
    private var idNumber = 0
    private def newIdNum = { idNumber += 1; idNumber }
  }

  // ---------- INHERITANCE ----------
  // A class that inherits from another gains all its fields and methods
  // A class declared final can't be extended
  class Dog (name : String, sound : String, growl : String) extends
    Animal(name, sound){

    def this (name : String, sound : String){
      this("No Name", sound, "No Growl")
      this.setName(name)
    }

    def this (name : String){
      this("No Name", "No Sound", "No Growl")
      this.setName(name)
    }

    def this (){
      this("No Name", "No Sound", "No Growl")
    }

    // You can override any other method
    override def toString() : String = {
      return "%s with the id %d says %s or %s".format(
        this.name, this.id, this.sound, this.growl)
    }
  }

  // ---------- ABSTRACT CLASS ----------
  // An abstract class can't be instantiated. It is made up of both abstract
  // and non-abstract methods and fields

  abstract class Mammal(val name : String){
    // An abstract field has no initial value
    var moveSpeed : Double

    // An abstract method has no body
    def move : String

  }

  class Wolf(name : String) extends Mammal(name){
    // You don't use override when defining abstract fields
    var moveSpeed = 35.0;

    def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)

  }
}
