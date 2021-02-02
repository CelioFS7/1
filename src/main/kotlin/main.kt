@file:Suppress("UNREACHABLE_CODE")

/*fun calculaBonus(a: Int, b: Int, c: Int): Unit {
   print("O bonus é: ${a + b + c}")

}*/

/*fun hello(nome: String): String{
    return " Olá, $nome"
}

//função de uma unica linha
fun hello2(nome: String) ="Olá, $nome"
fun calculaBonus2 (a: Int, b: Int, c: Int) = "O bonus é: ${a + b + c}"


fun main() {

    val a: Int= 10
    val b: Int= 20
    val c: Int= 30
    val nome: String = "Célio"

    //println(calculaBonus2(a, b, c ))

   println(hello2("Célio"))

}*/

//if - else
/*fun maiorIdade(idade: Int) {


    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }


}


fun main() {

    maiorIdade(18)
    maiorIdade(33)
    maiorIdade(12)
}*/

//if - else com retorno Boolean
/*fun maiorIdade(idade: Int): Boolean {
    return idade >= 18

}


fun main() {

    print(maiorIdade(18))
    print(maiorIdade(12))

}*/
//if dentro do else
/*
if (cargo == "Coordenador") {
    return salario * 0.2f
} else {
    if (cargo.contains("Gerente")) {
        if (cargo == "Gerente Senior"){
            return salario * 2
        }else {
            salario * 0.5f
        }
    }
}
return retorno*/

//if else
/*
fun calculaBonus(cargo: String, salario: Float): Float {

    val bonus: Float
    if (cargo == "Cooernador") {
        bonus = salario * 0.1f
    } else if (cargo == "Gerente Junior") {
        bonus = salario * 0.2f
    } else {
        bonus = salario * 2
    }

    return bonus
}

fun main() {

    println(calculaBonus("Coordenador", salario = 1000f))
    println(calculaBonus("Gerente Junior", salario = 2000f))
    println(calculaBonus("Gerente Senior", salario = 3000f))

}*/


//operador ternario não tem no kotlin usa if else

/*fun main() {
    val valor = 10
    val a = if (valor == 10) "Sim" else "Não"

}*/

//OPERADOR Elvis ?:
/*
fun main(){
//se existe valor em teste use, se não existir, ele for nulo use a outra expressão use 100
    val test: Int? = null
    val op: Int =  test ?: 100


}*/

//Operador when e range

/*fun operacao (a: Int, b: Int, c:String): Int{

    when (c){
        "soma" ->return a + b
        "Subtração"->{
            return a - b
        }
        else -> {
            println("Operação Incorreta")
            return 0
        }
    }

    //Range intervalo de valores coloca .. ex. 1..99 ele conta todos os numeros dentro desses valores
   /* when{
        a in 1..99 && b > 0 -> {
            println("Século")
        }
    }*/



}
fun main(){
    operacao(a = 10, b = 10, c = "soma")
    operacao(10,10,"Subtração")

}
*/

//operador for
/*função for em varios casos
fun main(){
    val nome = "Célio"

    for (a in nome){
        print("$a ")
    }

    for (i in 1..100 step 2){
        print("$i ")
    }

    for (c in 0..100 step 5){
        if (c !=80){
            print("$c ")
        }
    }

    for (j in 100 downTo 0){
        print("$j ")
    }


}*/

//while siguinifica enquanto, executa somente condição verdadeira


/*fun main() {
    //while tem que iniciar e terminar se nao fica em loop infinito

    var a: Int = 0
    while (a < 100) {
        println(a)
        a++

        if (a == 50) {
            break
        }
    }

 */

// do while executa mesmo se a condição for falsa
/*fun main() {
    var l: Int = 10
    do {

    println (l)
    l += 5


    }while (l <= 100)
    }
 */

// conversão de valores

/*fun teste(n1: Int){

}
fun main(){
    val b1: Byte= 100

    println(b1.toShort())
    println(b1.toLong())
    println(b1.toFloat())
    println(b1.toDouble())

    println("19".toInt())
    println("19".toFloat())
    println ("19".toDouble())


}*/

// exceções de conversão de valores, sempre as mais especificas primeiro depois as mais simples
/*fun main() {

    try {
        println("sdgv".toInt())
    } catch (e: NumberFormatException){
        println("Esse valor não é um numero")
    }
    catch (e: Exception) {
        println("Algo de errado ocorreu")

    }finally {
        println("")
    }


}*/

// Null Safe

/*fun main(){
    val str: String? = null
    println(str?.length)

    if (str != null)
        println(str.length)
    else{
        println()
    }
}*/

//Pacotes package

//Chamamento de parametros
/*fun endereco(Rua: String = "", Cidade: String, Estado: String, Cep: String, numero: Int = 0){
    println("Rua: $Rua")
    println("Cidade: $Cidade, $Estado, - $Cep")
}
//pode colocar em forma desordenada que consegue chamar a função mas o bom seria ordenar
fun main(){
        endereco(Cidade= "trindade", Estado = "Goias", Cep = "13")


}*/


//Parametros vararg
//sem vararg
//fun media(n1: Float, n2:Float, n3:Float =0f, n4:Float = 0f){}

/*fun media(vararg notas: Float){

    if (notas.isNotEmpty()){
        var soma = 0f
        for (nota in notas) {
            soma += nota
        }
        println("A média é: ${soma/notas.size}")
    }

}
fun main(){
    media(10f, 8f)
    media(1f,5f,2f,7f)

}*/

//outros parametros vararg

/*fun<T> media(vararg valores: T){
    for (valor in valores) {
        println(valor)
    }
}
fun main(){
    media(1,4f,"",false,'C')
}*/

//Algumas propriedades e funções

/*fun main(){
    val str="lorem ipsum"
    //deixa a primeira letra maiuscula
    str.capitalize()
    //Deixa a primeira letra minuscula
    str.decapitalize()
    //Verifica se minha string contem algo dentro
    str.contains("lorem")
    //Verifica se alguma função começa com alguma letra ou maiuscula ou minuscula
    str.startsWith("l")
    //declara uma lista e retorna um tamanho
    arrayListOf(1,2,3,4,5,6,7,8,9)



}*/

//ORIENTAÇÃO A OBJETOS / classes
/*
class Pessoa1 ()

class Pessoa2 (var nome: String, var anoNacimento: Int)

class Pessoa3 (var nome: String, var anoNacimento: Int){
    fun saudacao(){
        println("Ola, meu nome e $nome")
    }
}

fun main(){



    //assim estou istanciando uma classe
    val pessoa: Pessoa3 = Pessoa3("Celio", 1993)

    println(pessoa.nome)
    println(pessoa.anoNacimento)

    pessoa.saudacao()

}*/

//orientação a objeto / contrutor
/*class Pessoa1 ()

class Pessoa2 (var nome: String, var anoNacimento: Int)

class Pessoa3 (var nome: String) {

    var ano: Int? = null

    constructor(nome: String, ano: Int) : this(nome) {
        this.ano = ano
    }
    fun saudacao(){
        println("Ola, meu nome e $nome, e nasci no ano de $ano")
    }
}

fun main() {

    val p3: Pessoa3 = Pessoa3("Celio", 1993)
    val p1: Pessoa3 = Pessoa3("Gabriel", 1900)

    p1.saudacao()
    p3.saudacao()


}*/

//Getter e Setters
fun main(){

}



//Mais sobre Parametros
/*fun endereco(rua: String = "", cidade: String){
    println("Rua:$rua")
    println("Cidade:$cidade")

}
fun main(){
    //Se eu não colocar nada o codigo pega a sequencia a cima descrita na função
    //Se eu colocar cidade="nome da cidade" o codigo pula e pega direto a cidade
    endereco("Dom penso", "Trindade")
    endereco(cidade =  "trindade")
}*/

//PAREMETROS MEDIA DE ALUNO vararg

/*fun media(n1: Float, n2: Float, n3: Float = 0f, n4: Float = 0f){
    if (n4 != 0f){
        val media =n1 + n2 + n3 + n4 / 4
    }
}pode ser feito assim mais é mais complicado para simplificar usar vararg*/
/*fun media3(vararg notas: Float){

    if(notas.isNotEmpty()){
        var soma = 0f
        for (nota in notas){
            soma += nota
        }
        println("A média é: ${soma/notas.size}")
    }

    notas.size

}
//se eu colocar essa função posso ter int, bit, Float, Double, que nao da erro na função aceita qualquer parametro
fun<T> media(vararg valores: T){
    for (valor in valores){
        println(valor)
    }
}

fun main(){
    //vararg aceita um numero ilimitados
    media(8f,9f,8f,7f,)
    media (1,4f, "", 'C',)
}*/









