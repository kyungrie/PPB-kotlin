fun main(){
    val escapedString: String = "Ini adalah escaped String!\n"
    var rawString: String
    
    rawString ="""Ini akan menjadi string lebih dari satu baris dan tidak boleh
                    memiliki karakter escaped didalamnya."""

    var nama = "Arie Gj"
    var nilaiString1 = "2"
    var nilaiString2 = "2"

    println("-------------------------------------")
    println("Latihan Tipe Data String : $nama \n")

    print(escapedString)
    print(rawString+"\n\n")
    println("Ketika nilai strimg ditambah dengan nilai string")
    println("maka akan menjadi gabungan String")
    println(nilaiString1+nilaiString2)
    println("-------------------------------------")
}