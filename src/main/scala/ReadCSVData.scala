import scala.io.{ Source, Codec }

object ReadCSVData extends App {

  def toDoubleOrNeg(s: String): Double = {
    try {
      s.toDouble
    }
    catch {
      case _: NumberFormatException => -1
    }
  }

  val source =
    scala.io.Source.fromFile("src/main/resources/airports.csv")(Codec("utf-8"))
  val lines = source.getLines().filter(_.nonEmpty).map(_.split(",")(0)).toSet
  source.close
  println(lines)

}
