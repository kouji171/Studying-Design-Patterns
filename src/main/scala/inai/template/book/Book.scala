package inai.template.book

abstract class Book[E](val elements: List[E]) {
  def nameOf(e: E): String
  def find(start: String): List[Any] = {
    elements.filter { e =>
      nameOf(e).startsWith(start)
    }
  }
}
