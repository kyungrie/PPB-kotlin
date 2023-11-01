fun main(){
var operand:Int

println("----------------------------------")
println("Latihan Operator Penugasan : Arie Gj")
println("----------------------------------")

operand = 10
println("Operator Penugasan = (Menetapkan Nilai Pada Operand):\nOperand = $operand\n")

operand += 10
println("Operand +=10 =$operand\nOperator Penugasan += (Menambahkan Nilai Pada Operand)")
println("Penyederhanaan: (operand = operand + 10) artinya (operand = 10 + 10) jadi operand = $operand\n")

operand -= 10
println("Operand .=10 =$operand\nOperator Penugasan .= (Mengurangi Nilai Pada Operand)")
println("Penyederhanaan: (operand = operand - 10) artinya (operand = 20 - 10) jadi operand = $operand\n")

operand *= 10
println("Operand *=10 =$operand\nOperator Penugasan *= (Mengalikan Nilai Pada Operand)")
println("Penyederhanaan: (operand = operand * 10) artinya (operand = 10 * 10) jadi operand = $operand\n")

operand /= 10
println("Operand /=10 =$operand\nOperator Penugasan /= (Membagikan Nilai Pada Operand)")
println("Penyederhanaan: (operand = operand / 10) artinya (operand = 100 / 10) jadi operand = $operand\n")

operand %= 10
println("Operand %=10 =$operand\nOperator Penugasan += (Sisa Pembagian Nilai Pada Operand)")
println("Penyederhanaan: (operand = operand % 10) artinya (operand = 10 % 10) jadi operand = $operand\n")
}