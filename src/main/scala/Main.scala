import scala.io._
import ReadCSVData._
import AirportData._
import CountryData._
import RunwayData._
import MapData._
import ProcessedData._

object Main extends App {

  println("Choose Options a or b")
  askUser

}

object askUser {
  val options = Tuple2("Query", "Report")
  val (a, b) = options
  val userInput = StdIn.readLine()

  if (userInput == "a") {
    println("Enter Country Code; Like: `US` or `AF` ")

    val countryCode = StdIn.readLine()

    val listOfAirportInCountry = getAllAirportOfCountry(countryCode)

    val countryName = getCountryName(countryCode)

    val totalAirportIntheCountry = getListOfAirport(countryCode).length

    println(
      s"Total number of Airport in $countryName is $totalAirportIntheCountry"
    )

    println

    println(s"List of airports in $countryName \n\n $listOfAirportInCountry")
  }
  else {
    println("Report is coming soon ..... :-)")
  }
}
