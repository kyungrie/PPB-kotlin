fun main() {
    val a: Byte = 127
    val b: Short = 32767
    val c: Int = 2147483647
    val d: Long = 9223372036854775807
    val e: Long = 1231235432L
    
    val f: Float = 200.000F
    val maxf: Float = 3.40282346638528869F
    val g: Double = 100.0
    val maxh: Double = 1.7976931348623157

    val i: Short = 32_767
    val j: Int =  2_147_483_647
    val k: Long = 9_223_372_036_854_775_807
    val l: Double = 1.797_693_134_862_215

    println("------------------------------------")
    print("Latihan Tipe Data Number : Arie Gj\n")

    print("Nilai : $a\nNilai : $b\nNilai : $c\nNilai : $d\nNilai : $d\n")
    print("Nilai : $e\nNilai : $f\nNilai : $maxf\nNilai : $g\nNilai : $maxh\n")
    println("\nNilai underscore : ")
    print("Nilai : $i\nNilai : $j\nNilai : $k\nNilai : $l\n")
    print("\n*Jika di cetak, niali yang memiliki \nunderscore akan tetap sama\n ")
    print("dengan nilai aslinya (tanpaunderscore)\n misal : 1_00 akan > 1000 \n")
    println("------------------------------------")
}