__Professor: Jether Rodrigues__


# Orientacão de Objetos em Kotlin

Orientação a objetos é um paradigma aplicado na programação que consiste na interação entre diversas unidades chamadas de objetos.

## Classe pública e privada

Nos representamos as abstrações do paradgma de POO com classes.

A classe e como representamos o mundo real dentro da aplicação.

- Criando primeira class em Kotlin

Entrada:
```kotlin
class Pessoa {
    var nome: String  = "Thais"
    var cpf: String = "123.123.123-10"
}

//Execultando

fun main() {
     val thais = Pessoa()

    println(thais.nome)
    println(thais.cpf)
}
```

Saída:
```
Thais
123.123.123-10

```

- Inner class

```kotlin
class Pessoa {
    var nome: String  = "Thais"
    var cpf: String = "123.123.123-10"

    inner class Endereco {
        var rua: String =  "Rua teste"
    }
}
```
- Membros de class

```kotlin
class Pessoa {
    //membro
    var nome: String  = "Thais"
    var cpf: String = "123.123.123-10"
    private set
    //membro
    constructor()
    //membro
    fun pessoaInfo() = "$nome e $cpf"
}
```
- Data Class

Armazenar um estado naquele objeto e não mais modifica-lo ele fique imutável.

Ela não pode ser abstrada.

```kotlin
data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() = "$nome - $numero"
}
```

- Enum

É um representção própria de um objeto.

```kotlin
enum class ClienteTipo(val descricao: String) {
    PF("Pessoa Fisica"),
    PJ("Pessoa Juridica");
}
```
- Abstrações e Herança

```kotlin
 abstract class Pessoa(
    val nome: String,
    val cpf: String
)

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract  fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}
```

- Polimorfismo

```kotlin
class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {
    override fun calculoAuxilio(): Double = salario * 0.4
    override fun login(): Boolean  = "senha123" == senha
}
fun main() {
    val thais = Gerente( nome = "Thais", cpf = "123.123.123-40", salario = 5000.00, senha = "senha123")
    ImprimeRelatorioFuncionario.imprime(thais)

    TesteAutenticacao().autentica(thais)
}
```
<br></br>
## [**Projeto** 📚 ✅](https://github.com/thaisperlho/digitalinnovaton-project)

