fun main(){
  val fruits = arrayOf("Apple","Mango","Banana","Orange")
  val data1 = arrayOf(
    arrayOf("One: ","Pepaya"),
    arrayOf("Two: ","Kelapa")
  )

  println("---------------------------------")
  println("Latihan Mengubah Elemen/Data Array")
  println("---------------------------------")

  println("Data Sebelum di ubah/diatur")
  println("Data Index [0] : "+fruits[0])
  println("Data Index [0][1] : "+data1[0][1])

  fruits[0]="Water Melon"

  data1[0][1]="Coconut"

  println("\nData Sesudah diubah/diatur")
  println("Data Index[0] : "+fruits[0])
  println("Data index [0][1] : "+data1[0][1])
}