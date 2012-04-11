package inai.template.country

abstract class Country[E](val word: E) {
  def wordOf(e: E): String
  def hello = {
    "Say '" + wordOf(word) + "'"
  }
}