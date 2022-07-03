<aside>
🔥 Vetores:

</aside>

> Introudução a vetores:
> 
- Estrutura de dados;
- Valores sequenciais;
- Indexação a partir de zero;

<aside>
🔥 Criação de vetores:

</aside>

- Em javacsript: [], [”string”]...

```jsx
let numeros = [10, 20, 30, 40, 50];
numeros

numeros.lenght
//Vai aparecer o número de elementos

numeros[0]
//Vai me dar o numero da posicao 0 - 10 

```

<aside>
🔥 Manipulação de Vetores:

</aside>

- Métodos de Array disponíveis;
- Adição: push, unshift;
- Remoção: pop, shift, splice;
- Concatenação: concat

```jsx
numeros 

numeros.push(60); 
//Vai adicionar 60 ao array numeros, mas no final.

numeros.unshift(0); 
//Vai adicionar 0 ao array numeros, mas no início.

numeros.shift() 
//Vai remover o primeiro elemento da sequencia.

numeros.pop()
//Vai remover o último elemento da sequencia. 

numeros.splice(1, 3) //.splice(start, end) 
//é um parâmetro para delimitar a sequencia de elementos 
//neste caso vai imprimir o seguinte: 
//[20, 30, 40]
```

```jsx
let funcionarios = ["Fabricio", "Hector"]; 
let funcionarios2 = ["Guilherme", "Yago"];

let todosOsFuncionarios = funcionarios.concat(funcionarios2); 

```

---

<aside>
🔥 Criação de vetores a partir de existentes:

</aside>

- Usando um loop for;
- Usando o método map;

```jsx
let numeros = [10, 20, 30, 40, 50]; 

let numeros2 = [];

for(let i = 0; i < numeros.lenght; i += 1){
	numeros2.push(numeros[i] / 10); 
}
//Pegou o último número e dividil por 10; 
```

```jsx
function multiplicarPor10(n){
	return n * 10;
}

let numeros3 = numeros.map(multiplicarPor10) 
//Esse parâmetro vai pegar cada elemeto do array e multiplicar por 10 
//sendo a multiplicacao fatos justificavel atraves da funcao 
```

---

<aside>
🔥 Filtragem de vetores:

</aside>

- Usando o método filter

```jsx
numeros2 = [1, 2, 3, 4, 5]; 

function ePar(n){
	return n % 2 === 0; 

}

let numeros4 = numeros2.filter(ePar); 
numeros4;
//O parâmetro .filter -> vai filtrar o array e pegar somente os valores que receberao 
//o true, no caso os valores pares; 
```

```jsx
let numeros5 = []; 

for(let i = 0; i < numeros2.lenght; i += 1){ 
	if(numeros2[i] % 2 === 0){
		numeros5.push(numeros2[i])
	
	}
}
```

![Screenshot 2022-05-15 211402.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/194ef9ff-cb6b-40e2-991f-49a23c8e6118/Screenshot_2022-05-15_211402.png)

É possível percorrer os índices de um vetor com **for...in** e os valores com **for...of**
