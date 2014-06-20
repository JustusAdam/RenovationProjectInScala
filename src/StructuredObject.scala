import scala.collection.mutable

/**
 * Created by justusadam on 19/06/14.
 */
class StructuredObject extends RenovationObject{
  var parts = mutable.MutableList[RenovationObject]()

  def add(element:RenovationObject) = parts += element

  @Override
  def getPrice:Double = {
    var count:Double = 0
    parts.foreach(count += _.getPrice)
    count
  }

  @Override
  def addMaterialReq(materials:mutable.Map[String,java.lang.Double]) = {
    parts.foreach(_.addMaterialReq(materials))
    materials
  }

}
