//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nota = 9
    //Usando operador range
    if (nota in 9 .. 10){
        println("Fantásico")
    }else if (nota in 7 .. 8){
        println("Parabén")
    }else if (nota in 4 .. 6){
        println("Tem como recuperar")
    }else if (nota in 0 .. 3) {
        println("Te vejo no pr[oximo ano")
    }else{
        println("Nota inválida")
    }

}