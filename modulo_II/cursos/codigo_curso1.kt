// Primeiros passos com Kotlin
fun hello(){
    println("Hello, world!!!")
}
//declarando variável
const val CURRENT_AGE = 50
fun variavel(){
    var currentAge = 30
    println(currentAge)
    currentAge = 90
    val currentAgeMe = 25
	println(currentAge)
    println(currentAgeMe)
    println(CURRENT_AGE)
}
//Operadores Aritméticos
fun aritmeticos(){
    var a = 20 
    var b = 4 
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a.times(b)))
    println("a / b = " + (a / b))
    println("a % b = " + (a.rem(b)))
}
//Operadores comparativos
fun comparativos(){
	var c = 30
    var d = 40
    println("c > d = "+(c>d))
    println("c < d = "+(c.compareTo(d) < 0))
    println("c >= d = "+(c>=d))
    println("c <= d = "+(c.compareTo(d) <= 0))
    println("c == d = "+(c==d))
    println("c != d = "+(!(c.equals(d))))
}
//Outros operadores
const val MIN_AGE = 16
const val MAX_AGE = 68
fun outros(){
    val bingo = listOf(8,6,34,2,13)
    var number = (1..34).random()
    println(number)
    println(number in bingo)
    var age = (10..100).random()
    println(age)
    println(age in MIN_AGE..MAX_AGE)
    println(age >= MIN_AGE && age <= MAX_AGE)
}
//Manipulando strings
fun m_string(){
    val welcome = "Ola"
    var name = "thais"
    println("$welcome, ${name.capitalize()}")
}
/*
//funcoes
fun main(){
    val z:Int
    z = calculate(34, 90,::sum)
    /*z = calculate(34, 90){a,b -> 
    println("Calculando")  
        a*b
    }*/
    println(z)
}
fun sum(a1:Int,a2:Int) = a1.plus(a2)

fun calculate(n1:Int,n2:Int,operation:(Int,Int)->Int):Int{
    val result = operation(n1,n2)
    return result
}
*/
//Estrutura de controle
fun estrutura(){
val poltrona = 32

when(poltrona) {

  in 1..10 -> println("Fileira A")
  in 11..20 -> println("Fileira B")
  in 21..30 -> println("Fileira C")
  in 31..40 -> println("Fileira D")
}
}
//Estrutura de repetição
fun downTo(){
	for(i in 20 downTo 0) {
	print("$i ")
    }
}
fun until(){
	for (i in 1 until 20) {
	print("$i ")
    }
}
fun step(num: Int) {
	for(i in 0..
	20 step num) {
	print("$i ")
    }
}
fun letterrs(){
    val sArray = "Olha essa string!"
    //tamanho do array
    //cada posição do array
    for(l in sArray){
        //l[index]
        println(l.toUpperCase())
    }
}
//função principal
fun main() {
    hello()
    println("Declarando variável")
	variavel()
    println("Operadores Aritméticos")
    aritmeticos()
    println("Operadores comparativos")
    comparativos()
    println("Outros operadores")
    outros()
    println("Manipulando strings")
    m_string()
    println("Estrutura de controle")
    estrutura()
    println("Estrutura de repetição")
    /*for(i in 0..20) {
	print("$i ")
    }*/
    letterrs()
}


