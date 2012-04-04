package inai.adapter.succ

class Banner(string:String) {
    def showWithParen = {
      println("(" + string + ")");
    }
    def showWithAster = {
      println("*" + string + "*");
    }
}