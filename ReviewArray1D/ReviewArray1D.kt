fun main(){
  println("---------------------------------")
  println("Latihan ReviewArray1D")
  println("---------------------------------")

  val data1 = intArrayOf(1,2,3,4)
  val data2 = arrayOf("jeruk","pepaya","anggur","kelapa")
  val data3 = charArrayOf('l','p')
  val data4 = booleanArrayOf(5>2,false)

  val data5 = IntArray(2)
  val data6 = arrayOfNulls<String>(2)
  val data7 = CharArray(2)
  val data8 = BooleanArray(2)

  data5[0]=5
  data5[1]=6

  data6[0]="keju"
  data6[1]="kentang"

  data7[0]='l'
  data7[1]='p'

  data8[0]=true
  data8[1]= 5==5

  val data9: IntArray
  val data10: Array<String?>
  val data11: CharArray
  val data12: BooleanArray
  
  data9 = IntArray(2)
  data9[0] = 34
  data9[1] = 31

  data10 = arrayOfNulls(2)
  data10[0] = "leci"
  data10[1] = "rambutan"

  data11 = CharArray(2)
  data11[0] = 'A'
  data11[1] = 'O'

  data12 = BooleanArray(2)
  data12[0] = false
  data12[1] = true

  println("Tampilkan isi array data 1:")
  for (i in data1.indices) {
    println(data1[i])
  }

  println("\nTampilkan isi array data 2:")
  for (i in data2.indices) {
    println(data2[i])
  }

  println("\nTampilkan isi array data 3:")
  for (i in data3.indices) {
    println(data3[i])
  }

  println("\nTampilkan isi array data 4:")
  for (i in data4.indices) {
    println(data4[i])
  }

  println("\nTampilkan isi array data 5:")
  for (i in data5.indices) {
    println(data5[i])
  }

  println("\nTampilkan isi array data 6:")
  for (i in data6.indices) {
    println(data6[i])
  }

  println("\nTampilkan isi array data 7:")
  for (i in data7.indices) {
    println(data7[i])
  }

  println("\nTampilkan isi array data 8:")
  for (i in data8.indices) {
    println(data8[i])
  }

  println("\nTampilkan isi array data 9:")
  for (i in data9.indices) {
    println(data9[i])
  }

  println("\nTampilkan isi array data 10:")
  for (i in data10.indices) {
    println(data10[i])
  }

  println("\nTampilkan isi array data 11:")
  for (i in data11.indices) {
    println(data11[i])
  }

  println("\nTampilkan isi array data 12:")
  for (i in data12.indices) {
    println(data12[i])
  }
}