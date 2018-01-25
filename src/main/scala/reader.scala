

import scala.io._
import scala.collection.mutable.Map

object reader {


  var IDtoClass:Map[String,String] = Map().withDefaultValue("")
  var IDtoMethod= Map[String,String]().withDefaultValue("")
  var temp:Array[String] = Array()
  var CallerToCallee: Array[(String,String)] = Array()
  var EntryPoint:Array[String] = Array()


  def Scanner= {

    val fileName = "callgraph.txt"


    for (line <- Source.fromFile(fileName).getLines()) {

      temp = temp :+ line

    }


    for (t <- 0 until temp.length) {


      temp(t) match {

        case c if c.contains("CLASS") =>
          val TEMP = temp(t + 2) + "." + temp(t + 3)
          IDtoClass += (temp(t + 1) -> TEMP)


        case m if m.contains("METHOD") =>
          val className = IDtoClass.get(temp(t+4)).mkString

          val TEMP = className + "." + temp(t + 2)
          IDtoMethod += (temp(t + 1) -> TEMP)

        case c if c.contains("CALLEDGE") =>
          val caller = IDtoMethod.get(temp(t+1)).mkString
          val callee = IDtoMethod.get(temp(t+2)).mkString

          CallerToCallee = CallerToCallee :+ (caller,callee)

        case e if e.contains("ENTRYPOINT") =>
          EntryPoint = EntryPoint :+ IDtoMethod.get(temp(t+1)).mkString

        case _ =>

      }

    }

  }

}