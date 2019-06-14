import scala.io._
import ReadCSVData._
import AirportData._
import CountryData._
import RunwayData._
import MapData._
import ProcessedData._

object Main extends App {

  println("Choose Options a or b")
  println(getCodeOfCountry("Mexico"))
  println(getCountryName("MX"))

  // println(code)
  // println()
  // println(country)

  // askUser
}

object askUser {
  val options = Tuple2("Query", "Report")
  val (a, b) = options
  val userInput = StdIn.readLine()

  if (userInput == "a") {
    println("Enter Country Code; Like: `US` or `AF` ")
    println
    val country = StdIn.readLine()
    val airportListInCountry = getListOfAirport(country)
    val countryName = getCountryName(country)
    val listOfAirportInCountry =
      airportListInCountry.map(c => c.name.trim()).mkString("\n")

    val totalAirportIntheCountry = airportListInCountry.length
    println(
      s"Total number of Airport in $countryName is $totalAirportIntheCountry"
    )
    println
    println(s"List of airports in $countryName \n\n $listOfAirportInCountry")
  } else {
    println("Report is coming soon ..... :-)")
  }
}
