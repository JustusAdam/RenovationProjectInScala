/**
 * Created by justusadam on 19/06/14.
 */
abstract class Material(name:String, price:Double) {
  def getName = name

  def getPricePerUnit = price

  def getMaterialReq(s:Surface):java.lang.Double

  def getPriceOfASurface(s:Surface):java.lang.Double
}
