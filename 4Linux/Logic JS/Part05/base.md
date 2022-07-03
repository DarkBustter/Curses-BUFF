<aside>
💡 Estruturas de Decisão:

</aside>

→ Tomadas de decisão no software;

→ Se / senão; 

![ccc.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8f749095-1413-4f3e-8e7b-27b22822ea69/ccc.png)

<aside>
💡 Se / senão:

</aside>

→ Forma de tomar decisões;

→ Executa um bloco de código caso aa condição seja verdadeira; 

Opcionalemtne executa outro bloco caso contrário; 

→ Em Javascript: if - else 

```jsx
let resposta = confirm("Você gosta de aprender ?");
resposta 
-> Vai aparecer um "true" - se apertar e cancel 

if(resposta){
	console.log("Então está no lugar certo") 
}

-> Undefined

	resposta = confirm("Você gosta de aprender ?")

//Para casos de usarmos o valor booleano contrário, usamos o else - sabendo que o else
//Se trata de um negação e if (tipo isso) 

if(resposta){
	console.log("Então está no lugar certo");
}else{ 
			console.log("Então vamos mudar isso! Venha para a 4Linux");
}

//Se você fizer isso...
let praia = confirm("Você gosta de ir `a praia ?") 
//Atribuindo o valor false - o mesmo será válido, quando você chamar a estrutura condicional 

if(praia){ 
	alert("Então bora para estrada") 
}else{
	alert("Talvez você prefira o interior :) "); 
}

```

<aside>
⚠️ Estruturas de Decisão:

</aside>

- Se encadeado;
- Operadores Lógicos;
- Operadores de comparação.

> Se encadeado:
> 
- Forma de checar várias condições, uma após a outra;
- Executa apenas o bloco da verdadeira, se presente;
- Em javacsript: else if.

```jsx
if(praia){ 
	console.log("Bora tomar um banho de sol");
}else if(interior){ 
	console.log("Hora de um churrasco e uma piscina"); 
} 

	//Obs: executa apenas o bloco da verdadeira, no caso executa o primeiro bloco verdadeiro  

```

<aside>
🔥 Operadores Logicos:

</aside>

- Conjuncoes, disjuncoes e negacoes;
- Condicionais mais elaboradas;

![Screenshot 2022-05-15 184749.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/00ed2515-d4dd-40aa-b9b8-919362574bb4/Screenshot_2022-05-15_184749.png)

![Screenshot 2022-05-15 184950.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6797478d-d7e8-4f2f-a8a5-688ee3cd2ae1/Screenshot_2022-05-15_184950.png)

---

<aside>
🔥 Operador Ternário de Decisão:

</aside>

- Expressão Condicional;
- Útil para atribuição de valores;
- Operador “Elvis”: **?:**

```jsx
let idade = 29; 
let maioridaeLegal = 21; 
let mensagem = idade >= maioridadeLegal ? "maior de idade" : "menor de idade"; 
//se for uma coisa, logo, será a outra coisa... 
//A condição verdadeira vem logo após o ? 
//Já a condição falsa vem logo após o : 

alerta(mensagem) 
//A condição imprimida, como em uma estrutura condicional qualquer... vai ser a verdadeira.

```

```jsx
alert((idade < maioridadeLegal) ? "maior" : "menor") + "de idade"); 
```
