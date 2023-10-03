fun main(){
    var nama:String? = "Arie"
    val panjangKarakter:Int
    println("-------------------------------------------")
    println("Latihan Opertor not-null Asseration (Null Safety) : Arie Gj")
    println("-------------------------------------------")
    panjangKarakter = nama!!.length

    println("Panjang Karater dari Variabel Nama : $nama")
    println("Panjang Karater : $panjangKarakter")
    // nama = null
    // panjangKarakter = nama!!.length

    println("-------------------------------------------")
}