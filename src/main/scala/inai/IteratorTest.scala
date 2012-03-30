package inai

object Inairator {
  def main(args: String*) {
    val m = Map(4 -> 5, 5 -> 6)
    m.keySet.foreach { key =>
      println("%s -> %s".format(key, m(key)))
    }
    m.foreach {
      case (k, v) =>
        println("Another %s -> %s".format(k, v))
    }
  }
}