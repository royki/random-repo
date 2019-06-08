import scala.io.{ Source, Codec }

object ReadCSVData {

  def readData(file: String): List[String] = {
    val source =
      scala.io.Source.fromFile(file)(Codec("utf-8"))
    val lines = source.getLines().filter(_.nonEmpty).toList
    source.close
    lines
  }

  val airports = readData("src/main/resources/airports.csv")
  val countries = readData("src/main/resources/countries.csv")
  val runways = readData("src/main/resources/runways.csv")

}
