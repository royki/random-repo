import ReadCSVData._
import AirportData._
import CountryData._
import RunwayData._

object MapData {

  def getListOfAirport(countryCode: String): List[AirportData] = {
    val airportByCode = airportInfo.groupBy(_.iso_country.trim).get(countryCode)
    val airportName = airportByCode.get
    airportName
  }

  def getCountryName(countryCode: String): String = {
    val country = countryInfo.map(_.name)
    val code = countryInfo.map(_.code)
    val codeByCountry = (code zip country).toMap
    codeByCountry.get(s"${countryCode + "   "}").mkString(" ").trim()
  }

  def convertCountryToCode(country: String): String = {
    val country = countryInfo.map(_.name)
    val code = countryInfo.map(_.code)
    val countryByCode = (country zip code).toMap
    // countryByCode
    //   .get(s"${country + "                                        "}")
    //   .mkString(" ")
    //   .trim()
    countryByCode
      .get("Mexico                                       ")
      .mkString(" ")
      .trim()
  }

  val country = countryInfo.map(_.name)
  val code = countryInfo.map(_.code)
  val countryByCode = (country zip code).toMap
}
