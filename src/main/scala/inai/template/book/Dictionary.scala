package inai.template.book

object DictionaryTester {
  val testA = new Dictionary(List(new Word("ab"), new Word("cd"), new Word("ef")))
  def tester(s: String) = testA.find(s)
}
class Dictionary(list: List[Word]) extends Book(list) {
  def nameOf(e: Word): String = e.key
}
class Word(val key: String)