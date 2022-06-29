__Professora: Ana Luísa Dias__  

## Primeiro vamos entender o que é Android ?
![android](/img/android.png)

É um sistema operacional para dispositivos moveis com mais de 2.5 bilhoes de usuários ativos.

O desenvolvimento Android pode se Hibrido ou Nativo
<br></br>

# O que é [Kotlin](https://kotlinlang.org/) ?
![android](/img/kotlin.png)

É uma linguagem multiplataforama, orientada a objeto e funcional, 🆓 e de codigo aberto.

Conhecendo um pouco mais [aqui!](https://developer.android.com/kotlin/learn?hl=pt-br)

<br></br>

# Qual vantagem dessa relação ?
![android](/img/k%26A.png)

- Segura, estruturada, menos verbosa;
- Grande relevancia no mercado;
- Interoperabilidade com Java;
- É a linguagem oficial de desenvolvimento Android;
<br></br>
# <center>kotlin first 😉</center>


## Sintaxe básica

```kotlin
fun main() {
    println("Hello, world!!!")
}
```

## Tipos de dados
- Int 
- Long
- Float
- Double
- Array
- Boolean
- Char
- Byte
- Short
- Null!

Como verifcar o valor máximo que um tipo de dados pode receber
```kotlin
fun main() {
    println(Int.MAX_VALUE)
    println(Float.MAX_VALUE)
    println(Long.MAX_VALUE)
    println(Byte.MAX_VALUE)
    println(Short.MAX_VALUE)
}
```

Como fazer a conversão de dados

```kotlin
toByte()
toShort()
toInt()
toLong()
toFloat()
toChar()
toDouble()
```

Como declarar uma variárel
- var (valor mutável, camelCase)
```kotlin
var currentAge = 30
```
- val (valor imutável, camelCase)
```kotlin
val currentAgeMe = 25
```
- const val (valor imutável, SNAKE_CASE)
```kotlin
const val CURRENT_AGE = 50
```

## Operadores Aritméticos

| Funçāo |Expressāo |Comando|Atribuição|
| ------ | ------ | ------- | -------|
|  Soma | a + b | a.plus(b) | a += b |
|  Subtração | a - b |  a.minus(b) | a -= b |
| Multiplicação | a * b | a.times(b) | a *= b |
| Divisão | a / b | a.div(b) | a /= b |
| Resto | a % b | a.mod(b) | a %= b |

Entrada:
```kotlin
fun main(){
    var a = 20 
    var b = 4 
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a.times(b)))
    println("a / b = " + (a / b))
    println("a % b = " + (a.rem(b)))
}
```
Saída:
```kotlin
a + b = 24
a - b = 16
a * b = 80
a / b = 5
a % b = 0
```

## Operadores comparativos

| Funçāo |Expressāo |Comando|
| ------ | ------ | ------- |
| maior| a > b| a.compareTo (b)> 0|
| menor| a < b| a.compareTo (b) <0|
| maior igual| a> = b| a.compareTo (b)> = 0|
| menor igual| a <= b| a.compareTo (b) <= 0|
| igual| a == b| a.equals(b)|
| diferente| a! = b| !(a.equals(b))|

Entrada:
```kotlin
fun main(){
	var c = 30
    var d = 40
    println("c > d = "+(c>d))
    println("c < d = "+(c.compareTo(d) < 0))
    println("c >= d = "+(c>=d))
    println("c <= d = "+(c.compareTo(d) <= 0))
    println("c == d = "+(c==d))
    println("c != d = "+(!(c.equals(d))))
}
```

Saída:
```kotlin
c > d = false
c < d = true
c >= d = false
c <= d = true
c == d = false
c != d = true
```

## Operadores lógicos

| Funçāo e Expressāo |Comando|
| ------------ | ------- |
| E (&&)| (expressao1) and (expressao2)|
|  Ou (\|\|)|(expressao1) or (expressao2)|

## Operadores In e range

| Funçāo | Expressāo |
| ------ | ------- |
|contém| (In)|
|não contém| (!In)|
|range/Faixa de valores| (Int..Int)|

## Manipulação de Strings

Para concatenar podemos usar `puls/+`.
Para concatenar uma varial a uma String usamos `${}`

|Nome|  Funçāo | Métodos |
| ------ | ------- | ------- |
| Capitalização de strings| Alterar a formatação entre letras minúsculas e maiúscula|capitalize(),toUpperCase(), toLowerCase() e decapitalize()|
|Remoção de espaços|Remove espaços vazios e caracteres inadequados para impressão|trimEnd(), trimStart (), trim ()|
|Substituição de caracteres|Substituir caracteres poroutros|replace(x,y)|
|formatação|Formatar outros valores para um padrão de string|"padrão ${valor}"'.format(valor)|

## Diferença entre Empty e Blank 

Ambos sao métodos de comparação, Empty é uma string que tem tamanho zero e esta vazia e Blank tem um tamanho maior que zero e todo seu conteudo e preenchido com espaços em branco, são utilizados geralmente para validar campos de input dos usuários.

## Funções

Temos funções anônimas, single-line, inline, estensões, Lambdas, ordem superior.
Podemos simplificar funções no Kotlin.

Exemplo:

```kotlin

fun sum(a1:Int,a2:Int) = a1.plus(a2)

fun calculate(n1:Int,n2:Int,operation:(Int,Int)->Int):Int{
    val result = operation(n1,n2)
    return result
}
fun main(){
var z = calculate(34, 90,::sum)
}
```

## Estrutura de controle

Temos if/else, when, elvis operator, utilizados tanto para controle quanto para
atribuição.

Exemplo:
```kotlin
fun main(){
val poltrona = 32

    when(poltrona) {
        in 1..10 -> println("Fileira A")
        in 11..20 -> println("Fileira B")
        in 21..30 -> println("Fileira C")
        in 31..40 -> println("Fileira D")
    }
}
```

## Estrutura de repetição

- for/varivellndexadora in/until/downTo faixa de valores/condicional step intervalo)
- In: conta do valor inicial até o valor final estabelecido
- Until: conta do valor atual até o valor estabelecido menos 1:
- DownTo: conta de maneira decrescente:
- Step: determina o intervalo da contagem;


[__Meus primeiro passos no kotlin__](codigo_curso1.kt)
