import scala.io._
import ReadCSVData._
import AirportData._
import CountryData._
import RunwayData._

object Main extends App {

  println("Choose Options a or b")
  askUser
  // for (a <- airportInfo) {
  //   println(s"Airport List: $a")
  // }

  // for (c <- countryInfo) {
  //   println(s"Country List: $c")
  // }

  // for (r <- runwayInfo) {
  //   println(s"Runway List: $r")
  // }

}

object askUser {
  val options = Tuple2("Query", "Report")
  val (a, b) = options
  val userInput = StdIn.readLine()

  def getListOfAirport(country: String): List[AirportData] = {
    val airportByCountry = airportInfo.groupBy(_.iso_country.trim).get(country)
    val airportName = airportByCountry.get
    airportName
  }

  if (userInput == "a") {
    println("Enter Country Code; Like: `US` or `AF` ")
    val country = StdIn.readLine()
    val airports = getListOfAirport(country)
    val airportInCountry =
      airports.map(c => c.name)
    val totalAirportIntheCountry = airports.length
    println(airportInCountry)
    println(s"Total number of Airport in $country is $totalAirportIntheCountry")
  } else {
    println("Report is coming soon ..... :-)")
  }
}
