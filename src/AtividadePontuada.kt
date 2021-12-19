fun main() {
    val horas : Int = 6
    var valor = 1F
    var totalPag = 0
    val taxa = 0.5F
    val taxa2 = 15

    if (horas <= 5) {
        valor = (horas * valor)
    }else if(horas in 6..23){
        totalPag = horas - 5
        valor = 5+(totalPag * taxa)
    }else if(horas >= 24){
        totalPag = horas - 24
        valor = taxa2+(totalPag * taxa)
    }
    println("O total a pagar é R$ $valor")
}
