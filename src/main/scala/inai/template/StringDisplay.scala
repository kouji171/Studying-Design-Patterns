package inai.template

class StringDisplay(string: String) extends AbstractDisplay {
  val width = string.getBytes().length
  def open = {
    printLine
  }
  def body = {
    println("|" + string + "|")
  }
  def close = {
    printLine
  }
  def printLine = {
    print("+")
    (1 to width).foreach { i =>
      print("-")
    }
    println("+")
  }
}