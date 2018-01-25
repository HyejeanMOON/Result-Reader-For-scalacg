
import java.io.{PrintStream, PrintWriter}
import reader._


trait OutputDOT {

  def OutputDOTFile={

    val rpw = new PrintWriter("CallGraph-DOT.txt")
    val rps = new PrintStream("CallGraph-DOT.txt")

    rps.println("digraph G{")
    for(c <- CallerToCallee){

      rps.print("\"")
      rps.print(c._1)
      rps.print("\"")
      rps.print(" -> ")
      rps.print("\"")
      rps.print(c._2)
      rps.print("\"")
      rps.println(" ;")

    }

    rps.println("}")

    rps.close()

  }

}
