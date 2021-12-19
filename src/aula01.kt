fun main(){
    var limSup= 100
    var limInt = 0
    var vlr = 0

    vlr = kotlin.random.Random.nextInt(limInt, limSup)

    var resp = 0

    while (resp != vlr){
        resp = kotlin.random.Random.nextInt(limInt, limSup)
        println(resp)
        if(resp > vlr){
           limSup = resp
        }
        else if(resp < vlr){
            limInt= resp
        }
        else println(" Acertô $vlr")
    }
}
