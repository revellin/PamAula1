//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nota = 4
    when (nota){
        10,9 -> print("Fantástico")
        8,7 -> print("Parabéns")
        6,5,4 -> print ("Tem como recuperar")
        in 3 .. 0 -> print ("te vejo próximo semestre")
        else -> print ("Nota Inválida")
    }
}