import scala.io._
import ReadCSVData._
import AirportData._
import CountryData._
import RunwayData._
import MapData._
import scala.collection.breakOut

object Main extends App {

  println("Choose Options a or b")
  // println(countryByCode.keySet.toList.sorted)
  println(convertCountryToCode("India"))
  // println(getCountryName("AD"))
  // askUser
  // println(getCountryName("US"))
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

  if (userInput == "a") {
    println("Enter Country Code; Like: `US` or `AF` ")
    val country = StdIn.readLine()
    val airports = getListOfAirport(country)
    val countryName = getCountryName(country)
    val listOfAirportInCountry =
      airports.map(c => c.name.trim()).mkString("|")
    val totalAirportIntheCountry = airports.length
    println(
      s"Total number of Airport in $countryName is $totalAirportIntheCountry"
    )
    println(s"List of airports in $countryName \n $listOfAirportInCountry")
  }
  else {
    println("Report is coming soon ..... :-)")
  }
}
