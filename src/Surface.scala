import scala.collection.mutable

/**
 * Created by justusadam on 19/06/14.
 */
class Surface(length:Double, width:Double) extends RenovationObject{
  var selectedMaterial:Material = null

  def setMaterial(material:Material) = selectedMaterial = material

  def getArea = length * width

  def getLength = length

  def getWidth = width

  @Override
  def getPrice = selectedMaterial.getPriceOfASurface(this)

  @Override
  def addMaterialReq(material:mutable.Map[String,java.lang.Double]) = {
    if (!material.contains(selectedMaterial.getName))
      material += ((selectedMaterial.getName, selectedMaterial.getMaterialReq(this)))
    else
      material += ((selectedMaterial.getName,
        selectedMaterial.getMaterialReq(this) + material.apply(selectedMaterial.getName)))
  }

}
