fun main(){
 var n1:Int; var n2:Int; var hasil:Int;

 println("-----------------------------")
 println("Latihan Membuat Kalkulator")
 println("-----------------------------")

 print("Nilai Pertama: "); val inputN1 = readLine();
 n1 = inputN1?.toInt()?:0

 print("Nilai Kedua: "); val inputN2 = readLine();
 n2 = inputN2?.toInt()?:0

 hasil = (n1 + n2)
 println("\nHasil Pertambahan :\n$n1 + $n2 = $hasil\n")

 hasil = (n1 - n2)
 println("\nHasil Pengurangan :\n$n1 - $n2 = $hasil\n")

 hasil = (n1 * n2)
 println("\nHasil Perkalian :\n$n1 * $n2 = $hasil\n")

 hasil = (n1 / n2)
 println("\nHasil Pembagian :\n$n1 / $n2 = $hasil\n")
}