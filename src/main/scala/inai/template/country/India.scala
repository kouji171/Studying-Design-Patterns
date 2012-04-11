package inai.template.country

class India(string:Temple) extends Country(string){
  def wordOf(e:Temple): String = e.greet
}
class Temple{
  val greet = "IIdia"
}