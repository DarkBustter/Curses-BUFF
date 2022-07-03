<aside>
🔥 Estruturas de Repetição:

</aside>

![Screenshot 2022-05-15 190230.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d1026686-ef50-4f8a-9f02-1ef01731bee0/Screenshot_2022-05-15_190230.png)

- A cafeteira pode ser usada como exemplo, ou analogia para explicar as estruturas de repetição;

> Enquanto houver água, a cafeteira deve usar essa água até ela estar indisponível.
> 

- Comando while;
- Comando do..while;

<aside>
🔥 Comando while:

</aside>

- Repetição enquanto uma condição for verdadeira;
- Em javascript: while(condição){ }

```jsx
let nivelAgua = 10; 

while(nivelAgua > 10){ 
	console.log("nível de água restante: " + nivelAgua); 
	nivelAgua -= 1 
}
//Nivel de água restante: 0 
//Nível de água restante: 1 
//Nível de água restante: 2
//...

//Se o parâmetro dentro de while for false -> Nao vai acontecer a impressão do conteúdo
```

<aside>
🔥 Comando do..while:

</aside>

- Como o while; pelo menos uma vez;
- Em javascript: do { } while (condição);

```jsx
do{ 
	console.log("nível de água restante: " + nivelAgua); 
	nivelAgua -= 1 
}while(nivelAgua < 10);
//nível de água restante: 0; 
//-1 

//Ao contrário do while, usando do..while, nós temos que ao menos uma vez o bloco da estrutura
//acabará sendo executado. 
```

```jsx
let numero = 324; 

while (numero % 3 == 0){ 
	numero /= 3; 
	console.log(numero);
} 
//vai imprimir até undefined 
```

---

<aside>
🔥 Comando for:

</aside>

- Repetição por um número de vezes;
- Normalmente de um valor para outro;
- Inicialização, condição, expressão final
- Em Javascript: for(inic; cond; expr) {}

```jsx
for(let nivelAgua = 10; nivelAgua > 0; nivelAgua -= 1){
	console.log("nível restante de água: " + nivelAgua); 

}

//Ao executar, vai aparecer a mesma da nossa estrutura do loop while.
//Onde começa, Onde termina e Onde incrementa; 
```

---

<aside>
🔥 Controle de Fluxo:

</aside>

- Interrupção e continuação de loops;
- Break;
- Continue;

```jsx
let n = 0;

while(true){

	n += 3; 
	
	if(n % 2 !== 0){ 
		console.log(n); 
	}
	if( n % 11 == 0){ 
	break;

	}
}
```

```jsx
let n = 0;

while(true){

	n += 3; 
	
	if(n % 2 !== 0){ 
		console.log("par é ignorado");
		continue;  
	}
	//Continue serve para executar a proxima linha de comando, por que sem ele
	//Só iria executar o console.log(n); 

	console.log(n);

	if( n % 11 == 0){ 
	break;

	}
}
```
