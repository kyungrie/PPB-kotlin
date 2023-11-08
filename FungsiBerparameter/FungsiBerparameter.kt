fun main(){
  val a = 10
  val b = 20

  println("---------------------------------")
  println("Latihan FungsiBerparameter")
  println("---------------------------------")

  printJumlahKan(a, b)
  printJumlahKan(5, 5)

}

fun printJumlahKan(a:Int, b:Int){
  println("\nHasil Penjumlahan $a + $b: "+(a+b))
}