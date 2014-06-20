import scala.collection.mutable
import scala.collection.JavaConversions._

/**
 * Created by justusadam on 19/06/14.
 */
abstract class RenovationObject {
  def getPrice:Double

  def addMaterialReq(materials:mutable.Map[String,java.lang.Double]):mutable.Map[String,java.lang.Double]

  def addMaterialReq(materials:java.util.Map[java.lang.String,java.lang.Double]):java.util.Map[java.lang.String,java.lang.Double] = {
    val scalaMap:mutable.Map[String,java.lang.Double] = mapAsScalaMap(materials)
    val resultingMap = addMaterialReq(scalaMap)
    mapAsJavaMap(resultingMap)
  }
}
