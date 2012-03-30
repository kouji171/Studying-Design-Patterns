package inai.iterator

trait Aggregate[T] {
  def iterator: Iterator[T] = new ShelfIterator(this.asInstanceOf[Shelf[T]])
}