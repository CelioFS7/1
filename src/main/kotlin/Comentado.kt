
    //Variável é um mecanismo das linguagens de programação que facilita colocar, remover, acessar e modificar um ou
    // mais dados na memória do computador.

    /*val

      Essa é a forma mais utilizada e recomenda para declarar uma variável. Com val a variável recebe valor uma única vez,
    podendo ser utilizada somente para a leitura de valores.Toda variável declarada com val deve ser iniciada com um valor,
    que não poderá ser modificado. Caso se tente alterar o valor de uma variável declarada com val, um erro de compilação
    será emitido.Ex.
    val preco: Float = 2.99f
    preco = 3.99f
    Ao tentar modificar o valor de uma variável declarada com val receberemos um erro de compilação com a mensagem Val cannot be reassigned.
     */

    /* var

    Caso uma variável deva mudar de valor, usamos var em sua declaração,
    var preco: Float = 2.99f Declaração com var
    Ao contrário de val, var não requer que a variável seja iniciada com um valor.
    var preco: Float .Contém um exemplo dessa sintaxe.
    Embora possamos omitir o valor quando usamos var, o tipo da variável ainda é obrigatório nesse caso.
    Um erro de compilação é emitido caso tipo e valor estejam ausentes na declaração de uma variável
    var preco A omissão de tipo e valor gera um erro de compilação.
    O primeiro erro possui a mensagem This variable must either have a type annotation or be initialized, que diz
    respeito a ausência de valor e tipo de valor. A segunda mensagem de erro é Variable 'preco' must be initialized,
    que se refere a ausência de um valor especificamente, porque se um valor está presente o compilador consegue inferir
    o tipo de uma variável.

     */
    /*
    Type              Bit

    : Double          64
    : Float             32 para usar esse coloca a letra f na frente do numero
    -------------------------- As de cima números quebrados ou com pontos
    -------------------------- As de baixo são representados para representar números inteiros
    : Long             64 inteiros

    : Int                 32 inteiros

    : Short            16 inteiros

    : Byte              8- até 256 valores        Maximo:127   menor: -128


    : Boolean - E true ou false -não tem minimo e maximo - 1 ou 8 não tem minimo e maximo


    : String  - Uma cadeia de caracteres, usa aspas duplas “ ”, ela pode crescer normalmente sem limitação de bit-não tem minimo e maximo


    :Char =      Usa aspas simples ‘ ’ -não tem minimo e maximo




    var = Variável mutável
    val = Variável imutável



    ${ .length} = Para saber o tamanho da variável


     fun = palavra reservada que define uma função em kotlin

     A função é algo que posso extrair uma lógica que aparece no meu código, podendo colocar alguma função específica para algo.

    EX: fun calculabonus parametros que ela recebe →(a: int)define o retorno : int ou : Short :Boolean etc {}

    fun calculabonus(a: Int, b: Int, c:Int){
        println(“O Bonus é: {a + b * c}”)
        depois chamo o calculaBonus(a, b, c)
    }

    Para que não seja preciso percorrer todo o codigo procurando essa logica basta alterar a função que ela altera toda logica do codigo.
*/

    /*
    println("2 + 2 = ${2 + 2 }")
    println("2 - 2 = ${2 - 2 }")
    println("2 /2 = ${2 / 2 }")
    println("2 * 2 = ${2 * 2 }")
    println("10 % 4 = ${10 % 4 }")
    println("2 % 2 = ${2 % 2 }")

    var numero = 10

    numero++ acrescenta +1 no numero
    println("numero++ = ${numero++}")
    println("numero-- = ${numero--}")

    ++numero acrecenta +1 antes
    println("++numero = ${++numero}")
    println("--numero = ${--numero}")


    numero +=2

    para nao precisar colocar numero = numero +2 coloca o +antes do =

    println("numero+= 2 = $numero")

    numero -=2
    println("numero-= 2 = $numero")

     numero /=2
    println("numero/= 2 = $numero")

     numero *=2
    println("numero*= 2 = $numero")

     numero %=3
    println("numero%= 3 = $numero")

     */


    /*
    Conjunção && o codigo só é executado quandos as 2 expreções são executadas EX:
    if(expre1 && expre2){
    codigo aqui
    } se as 2 for verdade vai executar esse codigo
     */

    /* Disjunção || o codigo só é executado quando 1 das expreções for executada, somente nao executa quando as 2 forem falsas EX:
    if(expre1 || expre2){
    codigo aqui
    }
     */

    /* Negação - ! eu nego a expreção se for true vira false se for false vira true
    if(!expre1){
    codigo aqui
    }
     */

    /*Controle de fluxo if else, operador Elvis, when, for, while, do while,
    */


    /* Tipos compostos
    if((expre1 && expre2) || expre3 || expre4 ){
    codigo aqui
    }

     */


    /*OPERADOR Elvis ?:
//se existe valor em teste use, se não existir, ele for nulo use a outra expressão use 100
    val test: Int? = null
    val op: Int =  test ?: 100


     */

    /* when
    Siguinifica quando alguma coisa estiver um valor especifico usamos determinado treicho de codigo
     */


    /*Range intervalo de valores coloca .. ex. 1..99 ele conta todos os numeros dentro desses valores
    * */

    /* For - loop executa varias vezes ate que algo diga que tem que parar, pois e um loop infinito sem parada,

     */


    /*while siguinifica enquanto, enquanto algum valor for verdade voce vai executar um trecho de codigo indicado


 */

    /* conversão de dados, sempre ocorre do menor para o maior, pois os maiores nao podem ser convertido para um menor
    por causa do tamanho deles, ou seja o Byte pode ser convertido para todos os outros mais um double nao pode ser para
    Byte por ser maior.

    Double 64
    Float 32
    long 64
    Int 32
    Short 16
    Byte 8
     */




    /*Exceções de conversão de dados,
NumberFormatException é mais completa com valores mais especificos
Exception é mais simples
finally

 */

    /* Null Safe


 */

    /*pacote cria na pasta src cria como package ele consegue ter responsabilidade arquivos classes dentro dele
    ele separa para os codigos ficarem com as responsabilidades em pacotes, dividindo entre os pacotes, por que ai
    fica mais divido e facil de averiguar.

    colocando *  import basic.* importa todos os pacotes da pasta basic


     */

    /*ORIENTAÇÃO A OBJETOS
    / os objetos tem atributos e comportamentos
    os Atributos na verdade são caracteristicas que marcam o objeto, cor, tamanho, marca, peso, altura, ligado desligado.
    os comportamentos são oque aquele objeto pode fazer, ex mouse, se for sem fio pode ser desligado ou com fio pode
    ligar com usb, pode carregar, pode clicar com botao direito, botao esquerdo.

    Os atributos na programação vão virar VARIAVEIS
    Os comportamentos vão virar     METODOS

    MODULARIDADE Eu posso trabalhar com um objeto independente dos outros objetos

    ENCAPSULAMENTO Detalhes internos de como funciona nao sao conhecidos por outros objetos

    REUSO DE CODIGO um objeto pode ser usado em varias partes do nosso sistema


    */

    /*Parametros vararg, posso usar esse parametro para que a funlção aceite varios numeros sem dar erro
    sendo assim posso fazer por exemplo somar notas sem precisar colocar ordenado n1 n2 n3 n4 posso colocar o parametro
    e ele entende e soma por ordem

    A função fun<T> media(vararg valores: T){}
    se eu colocar essa função posso ter int, bit, Float, Double, que nao da erro na função aceita qualquer parametro

     */

    /* ALGUMAS FUNÇÕES
    item.capitalize() deixa a primeira letra maiuscula
    item.decapitalize()diminuir a primeira letra
    item.contains - Verificar se contem uma string ex  ("bla") se tiver a String bla
    item.startWith() Verifica se uma função começa com determinada letra ("l") ignoreCase: false assim ele ignora se for maiusculo ou nao

    arrayof() declara uma lista de caracteres de varios valores

     */


