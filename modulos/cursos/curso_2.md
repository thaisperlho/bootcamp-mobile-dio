__Professor: Otávio Reis__

Anotações:

## **Git e GitHub**

### O que é Git ?

É um Sistema de Controle de versões distribuído, ele nos permite criar um reporitório local para rastrearas mudanças de um único usuárioo qual criou o servidor git local.

### O que é GitHub ?

É uma plataforma de hospedagem de código-fonte e arquivos com controle de versão usando o Git. 

### **Comando e observações**

- Comandos para criar um repositório no git, entrar na pasta e
    ```
    git init
    ``` 


- Comando para verificar status do  nosso repositório 
    ```
    git status
    ```

- Podemos configurar o dado do autor  do repositorio para que ele armazene corretamente comandos
    ```
    git config --local user.name "Seu nome aqui" 
    git config --local user.email "seu@email"
    ``` 

- Como salvar um arquivo no git fazer com que ele monitori as mudanças comando
    ```
    git add .  ou  git add nome do arquivo
    ``` 

- Criando commit  
    ```
    git commit – m "Criando arquivo"
    ``` 

- Verificando se as alterações foram realizadas comando
    ```
    git log 
    ```

- Podemos mostrar os commits em uma única linha com comando
    ```
    git log –oneline
    ``` 

- Para vê mais informações podemos usar
    ```
    git log –p
    ``` 

- Visualizar log com comando persoalizado
    ```
    git log --pretty="parametros de formatação"
    ``` 


__Obs: Para sair de linha de comando q__  

__Obs:  Nunca commit um codigo que não esta funcionando ainda__
