fun main() {
  val fruits = arrayOf<String>("Apple","Mango","Banana","Orange","Apple")
  val distinct = fruits.distinct()

  println("---------------------------------")
  println("Latihan MengambilNilaiBerbedaPadaNilai")
  println("---------------------------------")

  for (item in distinct) {
    println(item)
  }
}
