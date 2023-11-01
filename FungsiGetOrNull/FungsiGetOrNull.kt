fun main(){
  var name = "Arie Gj"
  
  println("---------------------------------")
  println("Latihan FungsiGetOrNull")
  println("---------------------------------")

  println(name)
  println("Ambil karakter pada index 0 pada variable name : "+name.getOrNull(0))
  println("Ambil karakter pada index 2 pada variable name : "+name.getOrNull(2))
  println("Ambil karakter pada index 100 pada variable name : "+name.getOrNull(100))
}