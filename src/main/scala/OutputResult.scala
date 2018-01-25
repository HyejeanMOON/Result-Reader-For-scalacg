
import reader._
import java.io.{PrintStream,PrintWriter}

trait OutputResult {

  def OutputResult:Unit={

    val rpw = new PrintWriter("CallGraph-Result.txt")
    val rps = new PrintStream("CallGraph-Result.txt")

    rps.println("Result:")

    rps.println("")
    rps.println("-------------------")

    rps.println("ID to Class:")
    rps.println("")

    for(i <- IDtoClass){

      rps.print((i._1) + " -> " )
      rps.println(i._2)

    }

    rps.println("")
    rps.println("-------------------")

    rps.println("ID to Method:")
    rps.println("")

    for(i <- IDtoMethod){

      rps.print((i._1) + " => " )
      rps.println(i._2)

    }

    rps.println("")
    rps.println("-------------------")

    rps.println("Caller to Callee:")
    rps.println("")

    for(c <- CallerToCallee){

      rps.print((c._1) + " -> ")
      rps.println(c._2)

    }

    rps.println("")

    rps.close()


  }

}
