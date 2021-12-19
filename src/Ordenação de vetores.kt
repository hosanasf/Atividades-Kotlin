var nomes : Array<String> = emptyArray()
var idade : Array<Int> = emptyArray()
var alt : Array<Float> = emptyArray()

fun main(){
    var i = 1

    while (true){

        print("Digite o nome da ${i} pessoa ou S pra sair: ")
        val nome  = readLine()!!.toString()
        nomes += if (nome != "S") nome else break
        print("Digite a idade ${i}: ")
        idade += readLine()!!.toInt()
        print("Digite a altura ${i}: ")
        alt  += readLine()!!.toFloat()
        i++

    }
    ordenaNome()
    ordenaIdade()
    ordenaAlt()
}

fun ordenaNome(){
    println("Ordenados por Nome")
    val nom2 = nomes.copyOf()
    nom2.sort()
    for (i in 0..nomes.size-1){
        val y = nomes.indexOf(nom2[i])
        println("0 ${i+1} listado é ${nom2[i]} tem ${idade[y]} anos e mede ${alt[y]}")
    }
}

fun ordenaIdade(){
    println("Ordenados por Idade")
    val idade2 = idade.copyOf()
    idade2.sort()
    for (i in 0..idade.size-1){
        val y = idade.indexOf(idade2[i])
        println("0 ${i+1} listado é ${nomes[y]} tem ${idade2[i]} anos e mede ${alt[y]}")
    }
}

fun ordenaAlt(){
    println("Ordenados por Altura")
    val alt2 = alt.copyOf()
    alt2.sort()
    for (i in 0..alt.size-1){
        val y = alt.indexOf(alt2[i])
        println("0 ${i+1} listado é ${nomes[y]} tem ${idade[y]} anos e mede ${alt2[i]}")
    }
}



