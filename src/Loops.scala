/**
  * Created by mohamedsultan on 29/11/2016.
  */
object Loops {
  def main(args: Array[String]): Unit = {
   var i=0
    println("While Loop ...")
    while (i <= 10) {
      println(i)
      i += 1
    }

    i=0
    println("Do ... While")
    do{
      println(i)
      i+=1
    }while (i<=20)

    println("For ... loop")
    for (i<-1 to 10){
      println(i)
    }

     println("For ... Untill")
    val randLetters="ABCDEFGHI"
    for (i<-0 until randLetters.length){
      println(i)
    }

    println("Loop on list")
    val aList=List(1,2,3,4,5)
    for (i<- aList){
      println("List item:"+i)
    }

    println("Conditional Loop")
    var evenList=for { i<-1 to 20
    if (i%2)==0
    } yield i

    for (i<-evenList){
      println(i)
    }

    println("Inner Loops")
    for (i<-1 to 5;j<-6 to 10){
      println("-----")
      println("i:"+i)
      println("j:"+j)
    }
  }
}
