package inai.adapter

class Main {
  def main(args: List[String]) {
    
    val pastBanner = new past.OldBanner("Hello")
    val succBanner = new succ.Banner("Hello")
    
    val p1 = past.PrintOldBanner.printer("Hello")
    val p1_2 = past.PrintOldBanner.printer(<order msg="Hello"></order>)
    val p2 = new succ.PrintBanner(succBanner)
    
    show(p1)
    show(p2)
  }
  
  def show(printer: Print) = {
    printer.printStrong()
    printer.printWeak()
  }
}