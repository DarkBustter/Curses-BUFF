---

<aside>
🔥 Introdução a funções:

</aside>

- Blocos de código reutilizáveis e parametrizáveis;
- Generalização de código;

<aside>
🔥 Declaração e chamda de funções:

</aside>

- Funções tem nome parâmetros e bloco de código;
- Para declarar em JavaScript: function () {}
- Parâmetros vs .argumentos;

```jsx
function divisivelPor(a, b){
 
	if(a % b === 0){ 
		console.log(a + "é divisível por" + b); 
	}
	else{
		console.log(a + " não é divisível por" + b); 
	}
}

divisivelPor(10, 2);
```

---

<aside>
🔥 Funções sem parâmetro:

</aside>

- Não necessitam de valores externos;
- Funcionam com o que têm;

```jsx
function mostrarMenu(){ 
	let entradas = ["Entrar", "Cadastrar", "Fechar"]; 
	for(let i = 0, o = 1; i < entradas.lenght; i++, o++){ 
		console.log(o + " - " + entradas[i]);

	}

} 

mostrarMenu();
//1 - Entrar
//2 - Cadastrar
//3 - Fechar

prompt("Escolha uma opção"); 
```

<aside>
🔥 Funções com parâmetro:

</aside>

- Necessitam de valores externos;
- Adaptáveis a esses valores;
- Generalização e reutilização de código;

x

```jsx
function mostrarMenu2(entradas){ 
	for(let i = 0, o = 1; i < entradas.lenght; i++, o++){ 
		console.log(o + " - " + entradas[i]);

	}
} 

mostrarMenu2(["Entrar", "Cadastrar", "Fechar"]);
```

---

<aside>
🔥 Funções:

</aside>

- Retorno;
- Escopo da função;

<aside>
🔥 Retorno:

</aside>

- Entrada e saída;
- Funções devolvem valores;

```jsx
function somar(a, b){ 
	let soma = a + b; 
	return soma; 
}

somar(2, 3) 
//5 -> o javascript retorna o valor. 
```

```jsx
let soma = somar(10, 5); 
soma 
```

<aside>
🔥 Escopo da função:

</aside>

- Criação de variáveis;
- Execução de instruções;

```jsx
function multiplicar(a, b){ 
	
	let resultado = a * b; 
	return resultado;
}

multiplicar(3, 11)

resultado 
//vai da erro a linha "resultado", porque esssa variável só existe dentro da função
//ela nao existe fora, por isso podemos utilizar um mesmo nome dentro e fora 
//isso, sem ocorrer nenhum problema
```
