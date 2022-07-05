__Professor: Jether Rodrigues__


# Aplicando conceitos de Coleções, Arrays e Listas

## Coleções

- ### Arrays

    - IntArray

        ```kotlin
        fun main() {
            val values = IntArray( 5)

            values[0] = 1
            values[1] = 7
            values[2] = 5
            values[3] = 9
            values[4] = 2

            for (valor in values) {
                println(valor)
            }

            println("----------")
            values.forEach {
                println(it)
            }
            values.forEach { valor ->
                println(valor)
            }

            println("----------")
            for (index in values.indices) {
                println(values[index])
            }

            println("----------")
            values.sort()
            for (valor in values) {
                println(valor)
            }
        }
        ```

    - IntArrayOf

        ```kotlin
        fun main() {
            val values = intArrayOf(2, 3, 4, 10, 13, 5)

            values.forEach {
                println(it)
            }

            println("----------")
            values.sort()
            values.forEach {
                println(it)
            }
        }
        ```

    - ArrayString

        ```kotlin
        fun main() {
            val nomes = Array(3) {""}
            nomes[0] = "Thais"
            nomes[1] = "Carlos"
            nomes[2] = "Ana"

            for (nome in nomes) {
                println(nome)
            }
            println("----------")
            nomes.sort()
            nomes.forEach {println(it)}

            val nomes2 = arrayOf("Luis", "Pedro", "Carlos")

            println("----------")
            nomes2.sort()
            nomes2.forEach {println(it)}
        }
        ```

    - DoubleArray

        ```kotlin
        fun main() {
            val salarios = DoubleArray(3)
            salarios[0] = 1000.0
            salarios[1] = 7000.0
            salarios[2] = 800.0

            salarios.forEach { println(it) }

            println("--------")
            salarios.forEachIndexed { index, salario ->
                salarios[index] = salario * 1.1
            }
            salarios.forEach { println(it) }

            println("--------")
            val salarios2 = doubleArrayOf(1400.0, 1350.0, 3000.0)
            salarios2.sort()
            salarios2.forEach { println(it) }
        }
        ```

- ### Operações

    ```kotlin
    fun main() {
        val salarios = doubleArrayOf(1200.0, 2250.0, 5000.0)

        for (salario in salarios) {
            println(salario)
        }

        println("-------------")
        println("Maior salário: ${salarios.maxOrNull()}")
        println("Menor salário: ${salarios.minOrNull()}")
        println("Média salarial: ${salarios.average()}")

        val salariosMaiorQue2000 = salarios.filter { it > 2000.0 }
        println("-------------")
        salariosMaiorQue2000.forEach { println(it) }


        println("-------------")
        println(salarios.count { it in 2000.0..5500.0 })

        println("-------------")
        println(salarios.find { it == 2250.0})
        println(salarios.find { it == 250.0})

        println("-------------")
        println(salarios.any { it == 1200.0})
        println(salarios.any { it == 200.0})

    }
    ```

- ### Listas

    ```kotlin
    fun main() {
        val carlos = Funcionario(nome = "Carlos", salario = 3000.00, tipoContratacao = "CLT")
        val ana = Funcionario(nome = "Ana", salario = 5000.00, tipoContratacao = "PJ")
        val thais = Funcionario(nome = "Thais", salario = 1500.00, tipoContratacao = "CLT")

        val funcionarios = listOf(carlos, ana, thais)

        funcionarios.forEach { println(it) }

        println("---------")
        println(funcionarios.find { it.nome == "Thais" })

        println("---------")
        funcionarios
            .sortedBy { it.salario }
            .forEach { println(it) }

        println("---------")
        funcionarios
            .groupBy { it.tipoContratacao }
            .forEach { println(it) }
    }
    ```

- ### Set

    ```kotlin
    fun main() {
        val carlos = Funcionario(nome = "Carlos", salario = 3000.00, tipoContratacao = "CLT")
        val ana = Funcionario(nome = "Ana", salario = 5000.00, tipoContratacao = "PJ")
        val thais = Funcionario(nome = "Thais", salario = 1500.00, tipoContratacao = "CLT")

        val funcionarios1 = setOf(carlos, ana)
        val funcionarios2 = setOf(thais)

        val resultUnion = funcionarios1.union(funcionarios2)
        resultUnion.forEach { println(it) }

        println("---------")
        val funcionarios3 = setOf(carlos, ana, thais)
        val resultSubtract = funcionarios3.subtract(funcionarios2)
        resultSubtract.forEach { println(it) }

        println("---------")
        val resultIntersect = funcionarios3.intersect(funcionarios2)
        resultIntersect.forEach { println(it) }
    }
    ```

- ### Map
    ```kotlin
    fun main() {
        val pair: Pair<String, Double> = Pair("Carlos", 1000.0)
        val map1 = mapOf(pair)

        map1.forEach { (k, v) ->  println("Chave: $k - Valor: $v") }

        val map2 = mapOf(
            "Thais" to  2500.0,
            "Ana" to 3000.0
        )
        map2.forEach { (k, v) ->  println("Chave: $k - Valor: $v") }
    }
    ```

## Coleções Mutáveis 

- List e Set
```kotlin
fun main() {
    val carlos = Funcionario(nome = "Carlos", salario = 3000.00, tipoContratacao = "CLT")
    val ana = Funcionario(nome = "Ana", salario = 5000.00, tipoContratacao = "PJ")
    val thais = Funcionario(nome = "Thais", salario = 1500.00, tipoContratacao = "CLT")

    println("------------List------------")
    val funcionarios = mutableListOf(carlos, thais)
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.add(ana)
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.remove(carlos)
    funcionarios.forEach { println(it) }

    println("------------Set------------")
    val funcionarioSet = mutableSetOf(carlos)
    funcionarioSet.forEach { println(it) }

    println("------------")
    funcionarioSet.add(ana)
    funcionarioSet.add(thais)
    funcionarioSet.forEach { println(it) }

    println("------------")
    funcionarioSet.remove(ana)
    funcionarioSet.forEach { println(it) }
}
```
- Map
```kotlin
class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        map[id] = value
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map[id]

    fun fundAll() = map.values
}

```

## Funções Estendidas

```kotlin

fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()


```

<br></br>
## [**Projeto** 📚 ✅](https://github.com/thaisperlho/digitalinnovaton-project)