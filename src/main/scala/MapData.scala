import ReadCSVData._
import AirportData._
import CountryData._
import RunwayData._

object MapData {

  // Get all the airport name using country-code from AirportData
  def getListOfAirport(countryCode: String): List[AirportData] = {
    val airportByCode = airportInfo.groupBy(_.iso_country.trim).get(countryCode)
    val airportName = airportByCode.get
    airportName
  }

  // Map Country with Code and Get country name using country-code from CountryData
  def getCountryName(countryCode: String): String = {
    val country = countryInfo.map(_.name)
    val code = countryInfo.map(_.code)
    val codeByCountry = (code zip country).toMap
    codeByCountry.get(s"${countryCode}").mkString(" ")
  }

  // Map Country with Code and Get code using country-name from CountryData
  def getCodeOfCountry(countryName: String): String = {
    val country = countryInfo.map(_.name)
    val code = countryInfo.map(_.code)
    val countryByCode = (country zip code).toMap
    countryByCode.get(s"${countryName}").mkString(" ")
  }
}
