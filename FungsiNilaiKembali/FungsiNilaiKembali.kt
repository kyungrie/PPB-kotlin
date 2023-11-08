fun main(){
  val a = 10
  val b =20

  println("---------------------------------")
  println("Latihan FungsiNilaiKembali")
  println("---------------------------------")

  val result = sumTwo(a, b)
  println("nilai $a + $b: "+result)
}

fun sumTwo(a:Int, b:Int):Int{
  val x = a+b
  return x
}