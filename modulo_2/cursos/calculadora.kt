fun main() { 
	var n1 = 10
	var n2 = 2
	val operacao = "+"
	
    println("Temos as operações (+, -, *, /): ")
    println("A operação escolhida foi $operacao")
	if(operacao.equals("+")) {
		println("O resultado da soma é: " + (n1 + n2))			
	}
	else if(operacao.equals("-")) {
		println("O resultado da subtração é: " + (n1 - n2))		
	}
	else if(operacao.equals("*")) {
		println("O resultado da multiplicação é: " + (n1 * n2))
	}
	else if(operacao.equals("/")) {
        println("O resultado da divisão é: " + (n1 / n2))	
	}
	else{
		println("Oopração inválida, Tente novamente!")				
	}
}