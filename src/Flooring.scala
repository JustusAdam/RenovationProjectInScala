/**
 * Created by justusadam on 19/06/14.
 */
class Flooring(name:String, price:Double, width:Double) extends Material(name, price) {
  val limit = 0.02

  def getWidth = width

  @Override
  def getMaterialReq(s:Surface):java.lang.Double = {
    val result:java.lang.Double = s.getArea / width
    if (result % 1 >= limit) scala.math.ceil(result) else scala.math.floor(result)
  }

  @Override
  def getPriceOfASurface(s:Surface):java.lang.Double = getMaterialReq(s) * price
}
