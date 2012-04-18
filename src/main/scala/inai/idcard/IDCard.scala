package inai.idcard

import inai.framework.Product

class IDCard(owner: String) extends Product {
  val strOwner= owner
  //println(owner + "のカードを作ります")
  def IDCard(owner:String) = {
    println(owner + "のカードを作ります")
  }
  def use = {
    println(strOwner + "のカードを使います。")
  }
  def getOwner = {
    strOwner
  }
}