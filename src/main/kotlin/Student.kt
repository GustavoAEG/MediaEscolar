class Student {

    var firstName = " "
    var lastName = " "
    var registration = 0
    var nota = 0
    var ano = 0


    fun mostrarNome() {
        println("$firstName + $lastName")
    }

    //TODO implement: should return true if grade >= 60

fun avalNota(): Int {

val aprovado = nota
    if (nota >= 60) {

        println("A note geral é de $nota")
        return 1
    } else {
        println("voce foi reprovado")
        return 0
    }
}

    fun AvancarAno_Aprovado(): Int {
        //TODO implement: the student should advance to the next year if he/she grade is >= 60
        // Make year = year + 1, and print "Congragulations" if the student has been approved
        if (nota>=60) {

            ano = ano + 1

        }
        return 0
    }


    data class Estudantes(var primeiroNome: String, var nota:Double) {
        constructor(primeiroNome: String, nota: Double, ano: Int) :

                this(primeiroNome, nota)
        this.ano = ano
    }
}

