package inai.iterator

class ShelfIterator[T](shelf:Shelf[T]) extends Iterator[T] {
  var index = 0
  
  def hasNext: Boolean = {
    if (index < shelf.length) {
      true
    } else {
      false
    }
  }
  def next: T = {
    val book = shelf.bookAt(index)
    index +=1
    book
  }
  
}
