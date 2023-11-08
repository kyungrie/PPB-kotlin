fun main(){
  val fruits = arrayOf<String>("Apple","Mango","Banana","Orange")
  val gender = charArrayOf('l','p')
  val data2 = arrayOf(
    arrayOf("One : ","Pepaya"),
    arrayOf("Two : ","Kelapa")
  )

  println("---------------------------------")
  println("Latihan Akses Elemen / Data Array")
  println("---------------------------------")

  println("Buah: "+fruits[0])
  println("Buah: "+fruits[3])
  println("Gender: "+gender[0])
  println()

  print(data2 [0][0])
  println(data2[0][1])
  print(data2 [1][0])
  println(data2[1][1])
}