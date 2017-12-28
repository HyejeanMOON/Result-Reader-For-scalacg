
import reader._

object mainClass {



  def main(args: Array[String]): Unit = {

    Scanner

    println("")
    println("-------------------")

    println("ID to Class:")
    println("")

    for(i <- IDtoClass){

      print((i._1) + " -> " )
      println(i._2)

    }

    println("")
    println("-------------------")

    println("ID to Method:")
    println("")

    for(i <- IDtoMethod){

      print((i._1) + " => " )
      println(i._2)

    }

    println("")
    println("-------------------")

    println("Caller to Callee:")
    println("")

    for(c <- CallerToCallee){

      print((c._1) + " -> ")
      println(c._2)

    }

    println("")

  }

}