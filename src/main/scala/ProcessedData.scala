import ReadCSVData._
import AirportData._
import CountryData._
import RunwayData._
import MapData._

case class airport(name: String)
case class runway(name: String)

// Make a new Data having country-code, country-name, list of airports and list of runways
case class ProcessedData(
    code: String,
    country: String,
    airport: List[airport]
// runway: List[runway]
)

object ProcessedData {

  // Process all the code and make into a List
  def code: List[String] = {
    countryInfo.map(_.code.trim()).toList
    // val country = countryInfo.map(_.name)
    // val code = countryInfo.map(_.code)
    // val codeByCountry = (code zip country).toMap
    // codeByCountry.map(c => c._1).toList.sorted
  }

  // Process all the country and make into a List
  def country: List[String] = countryInfo.map(_.name.trim()).toList

}
