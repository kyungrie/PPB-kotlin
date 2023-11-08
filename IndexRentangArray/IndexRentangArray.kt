fun main(){
  val fruits = arrayOf("Apple","Mango","Banana","Orange")
  val dataBuah= arrayOf(
    arrayOf("1.","Apel"),
    arrayOf("2.","Jeruk"),
    arrayOf("3.","Mangga")
  )

  println("---------------------------------")
  println("Latihan IndexRentangArray")
  println("---------------------------------")

  println("Index Rentang dari data Array Fruits : "+(fruits.indices))
  println("Index Rentang BARIS dari data Array dataBuah : "+(dataBuah.indices))
  println("Index Rentang KOLOM dari data Array dataBuah : "+(dataBuah[0].indices))
}