package inai.template.country

class India(v:Temple) extends Country(v){
  def wordOf(e:Temple): String = e.greet
}
class Temple{
  val greet = "IIdia"
}