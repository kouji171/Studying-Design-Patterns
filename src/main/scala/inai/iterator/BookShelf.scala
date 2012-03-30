package inai.iterator

import scala.collection.mutable._

trait Shelf[T] {
  def length: Int
  def bookAt(index: Int): T
}
class BookShelf(books: Array[Book]) extends Shelf[Book] with Aggregate[Book] {
  private var last = 0
  
  def this(maxsize: Int) = {
    this(new Array[Book](maxsize))
  }
  
  def bookAt(index: Int): Book = {
    books(index)
  }
  
  def appendBook(book: Book) {
    books(last) = book
    last += 1
  }
  
  def length():Int = {
    last
  }
}