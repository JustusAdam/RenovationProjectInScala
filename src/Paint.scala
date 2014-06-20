import scala.math

/**
 * Created by justusadam on 19/06/14.
 */
class Paint(name:String, price:Double, noOfCoats:Int, noOfSqMPerLiter:Double) extends Material(name, price) {
  val limit = 0.02

  @Override
  def getMaterialReq(s:Surface):java.lang.Double = {
    val result:java.lang.Double = 2 * noOfCoats * s.getArea / noOfSqMPerLiter
    if (result % 1 >= limit) math.ceil(result) / 2 else math.floor(result) / 2
  }

  @Override
  def getPriceOfASurface(s:Surface) = getMaterialReq(s) * price

  def getNoOfCoats = noOfCoats

  def getNoOfSqMPerLiter = noOfSqMPerLiter
}
