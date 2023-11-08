fun main(){
  val fruits = arrayOf<String>("Apple","Mango","Banana","Orange")
  val data2D = arrayOf(
    arrayOf("1."," Apel"),
    arrayOf("2."," Jeruk")
  )

  println("---------------------------------")
  println("Latihan PanjangElemenOrData ")
  println("---------------------------------")
  println("Ukuran array buah-buahan "+fruits.size)
  println()
  println("Ukuran BARIS data array 2D : "+data2D.size)
  println("Ukuran KOLOM data array 2D : "+data2D[0].size)
}