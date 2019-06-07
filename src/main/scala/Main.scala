import scala.io._
import ReadCSVData._

object Main extends App {

  println("Choose Options a or b")

  // askUser

}

object askUser {
  val options = Tuple2("Query", "Report")
  val (a, b) = options

  val userInput = StdIn.readLine()
  if (userInput == "a") println(a)
  else if (userInput == "b") println(b)
}
