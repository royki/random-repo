import scala.io._
import ReadCSVData._
import AirportData._
import CountryData._
import RunwayData._

object Main extends App {

  // println("Choose Options a or b")

  // askUser

  for (a <- airportInfo) {
    println(s"Airport List: $a")
  }

  for (c <- countryInfo) {
    println(s"Country List: $c")
  }

  for (r <- runwayInfo) {
    println(s"Runway List: $r")
  }

}

object askUser {
  val options = Tuple2("Query", "Report")
  val (a, b) = options

  val userInput = StdIn.readLine()
  if (userInput == "a") println(a)
  else if (userInput == "b") println(b)
}
