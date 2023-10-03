fun main(){
    var nama: String?=null
    var usia: String?=null
    println("--------------------------------------------")
    println("Latihan Operator Safe Calls (Null Safety): Arie Gj")
    println("--------------------------------------------")
    
    println("Mengambil panjang karakter String dengan fungsi Length:")
    print("Panjang karakter nama:")
    println(nama?.length)

    nama ="Arie Gj"
    val jumlahKarakter:Int? = nama?.length
    println("Panjang Karakter pada Variable Nama:\'$nama\'adalah: $jumlahKarakter")

    usia="80"
    val umur:Int?= usia?.toInt()
    println("Usia : $umur")
    println("--------------------------------------------")
} 