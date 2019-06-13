import scala.io._
import ReadCSVData._

// Airport CSV Data
case class AirportData(
    ident: String,
    `type`: String,
    name: String,
    iso_country: String,
    iso_region: String
)

// Country CSV Data
case class CountryData( /*id: Int,*/ code: String, name: String)

// Runway CSV Data
case class RunwayData( /*id: Int,*/ airport_ident: String)

object AirportData {

  val airportInfo = airports.map { a =>
    val airport = a.split(",")
    AirportData(
      airport(1).toString,
      airport(2).toString,
      airport(3).toString,
      airport(8).toString,
      airport(9).toString
    )
  }.toList
  // .take(100)
  // .groupBy(_.iso_country)

}

object CountryData {

  val countryInfo = countries.map { c =>
    val country = c.split(",")
    CountryData(
      /*country(0).toInt,*/ country(1).toString,
                            country(2).toString
    )
  }.toList
  // .take(100)
}

object RunwayData {

  // val runwayData = readData("src/main/resources/countries.csv")

  val runwayInfo = runways
    .map { r =>
      val runway = r.split(",")
      RunwayData( /*runway(0).toInt,*/ runway(2).toString)
    }
    .toList
    .take(10)
}
