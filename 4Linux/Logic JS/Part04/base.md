<aside>
💡 O que é uma variável ?

</aside>

→ Identificador, nome; 

→ Nomes derivados do contexto;

→ Bloco de memória;

→ Blocos dimensionados - cada variável ocupa um tamanho específico na memória;

<aside>
💡 Nomes válidos:

</aside>

→ Palavras reservadas 

→ Significados especiais 

→ Exemplo: “int”

```jsx
nome  = prompt("Qual é o seu nome ?"); 
console.log(nome) ;

nome.lenght;
//Vai dar o numero de caractertes usados para construir a palavra (ou o seu nome).

nome.toUpperCase();
//Vai dar deixar todo o seu nome em caixa alta.
```

<aside>
💡 Tipos Primitivos - Números inteiros com sinal:

</aside>

![Captura de tela 2022-05-11 100516.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f1b28446-53ec-4766-8853-a9085d031052/Captura_de_tela_2022-05-11_100516.png)

> Cada bit = 0 ou bit = 1
> 

```jsx
ob10 -> 2

obs100 -> 4

//Usando ob + parte binária, o console entende que você deseja saber este valor 
//em decimal

//Obs: javascript é uma das poucas linguagens que conseguem suportar toda a capacidade 
//de memória, ou seja, fazer uso dos 64 bits.

//64bits = 64 números 1;
```

<aside>
💡 Variáveis:

</aside>

→ Tipos nativos do JavaScript

→ Operadores Aritméticos

![Captur336.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8a21243f-82d3-45e3-a11e-011f4281ffba/Captur336.png)

—> Se atente ao modo como um objeto e feito ou construido no javacsript 

```jsx
let pi = 3.14; 
console.log(pi); 
-> Vai aparecer 3.14

let nan = NaN
console.log(nan); 
-> Vai aparever "undefined"

nan + 1 
--> Se mantém o valor com "undefined"
```

```jsx
//Exemplo básico de Array...

let funcionarios = ["Fabricio", "Guilherme", "Hector", "André"]
console.log(funcionarios); 
-> Vai aparecer o número de elementos + nomes dentro do array 
-> Obs: em programação sempre começamos a indexar pelo "0"
```

```jsx
//Exemplo básico de Objeto...

let professor = {nome: "Fabricio", idade: 29, curso: "Lógica de Programação"};
professor.nome 
-> "Fabricio" - Vai aparecer isso. 

professor.idade
-> 29 - Vai aparecer isso 

professor[0]
-> "Fabricio"

professor[1] 
-> 29 

professor[2] 
-> "Lógica de Programação"
```

<aside>
💡 Operadores Aritméticos:

</aside>

![bbbbbbbbbb.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4c21d971-8b97-46e4-96b0-e341fa00cc41/bbbbbbbbbb.png)

→ Módulo - pega o resto de uma divisão e torna-a inteira.

```jsx
let a = 3; 
let b = 7; 
let c = a + b; 

console.log(c);
-> 10 - Vai aparecer o número 10 

etc.......

let horas = 2.5;
horas = Math.floor() 
-> Vai arredondar o seu número para baixo, no caso ficando 2.0 e não 2.5
```

> Questões - Reflexoes:
> 

→ Selecione tipos de dados presentes no Javascript 

- number
- string
- object
- array

→ Uma variável é: 

- Um bloco de memória física
- Um nome ou identificador
