package inai.template

class CharDisplay(ch:Char) extends AbstractDisplay{
    def open = {
      print("<<")
    }
    def body = {
      print(ch)
    }
    def close = {
      print(">>")
    }
}