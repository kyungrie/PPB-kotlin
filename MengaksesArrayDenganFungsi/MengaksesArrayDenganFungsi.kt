fun main(){
  val fruits = arrayOf<String>("Apple","Mango","Banana","Orange")

  println("---------------------------------")
  println("Latihan MengaksesArrayDenganFungsi")
  println("---------------------------------")

  println(fruits.get(0))
  println(fruits.get(3))

  fruits.set((3), "Guava")
  println(fruits.get(3))
}