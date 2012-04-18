package inai.framework

trait Factory[E] {
  final def create(owner:String) = {
    def p = createProduct(owner)
    registerProduct(p)
  }
  protected def createProduct(owner:String) : E
  protected def registerProduct(product:E) 
}