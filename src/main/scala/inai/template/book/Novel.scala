package inai.template.book

class Novel(list: List[Actor]) extends Book(list) {
  def nameOf(e: Actor): String = e.name
}
class Actor(val name: String)