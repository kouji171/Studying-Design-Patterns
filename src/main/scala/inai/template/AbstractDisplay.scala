package inai.template

trait AbstractDisplay {
    def open
    def body
    def close
    
    def display = {
      open
      (1 to 5).foreach { i =>
        body
      }
      close
    }
}
