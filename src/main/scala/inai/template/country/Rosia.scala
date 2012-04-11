package inai.template.country

class Rosia(string:Cathedral) extends Country(string){
  def wordOf(e:Cathedral): String = e.canon
}
class Cathedral {
  val canon = "Vanda"
}