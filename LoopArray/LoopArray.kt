fun main(){
  val fruits = arrayOf<String>("Apple","Mango","Banana","Orange")
  val dataBuah = arrayOf(
    arrayOf("1."," Apel"),
    arrayOf("2."," Jeruk")
  )

  println("---------------------------------")
  println("Latihan LoopArray")
  println("---------------------------------")

  for (item in fruits) {
    println(item)
  }
  println()
  for (baris in dataBuah.indices) {
    for (kolom in dataBuah[0].indices) {
      print(dataBuah[baris][kolom]); print(" ")
    }
    println()
  }
}