---

<aside>
⚠️ Programa:

</aside>

- E um conjunto de instrucoes que descrevem tarefas;
- Codigo-fonte ou executavel (resultado final) - pode se referir a;
- Compilado (processo de criacao de um executavel) ou interpretacao - pode se referir a.

> Programas Compilados: + compilador
> 
- O compilador consegue nos dar algumas validacoes e garantias - ele consegue verificar possiveis erros quando e suportado pelo compilador;
- Faz a verificacao da existencia de funcoes, e se os valores foram passados corretamente a elas como parametro;
- Verifica possiveis erros quando suportado;
- Quando passamos o nosso codigo-fonte e “traduzido” para codigo de maquina;
- Pode ser redistribuido facilmente.
    - Em c, por exemplo o compilador consegue descobrir se existe algum erro de memoria ;;
    - Em c, precisamos nos preocupar com a memoria do computador;

> Programas Interpretados:
> 
- Sao interpretados no momentos de execucao;
- Verifica e valida no momento de execucao;
- Necessita de um programa interpretador;
- Redistribui ligereiramente mais complicado
- Execucao mais lenta
- Compilacao “Just in Time”
    - Pega o programa e traduz para uma linguagem intermediaria que o interpretador entende.
    - Se houver uma mudanca no programa, o interpretador recompila a mudanca
    

> Como os programas sao interpretados:
> 
- Carregados em memorio pelo SO (Sistemas Operacionais)
- Segmentos / Secoes
- Execucao top-down
- Execucao ate o fim ou quando ocorre algum erro

---

<aside>
🔥 Linguagem de Maquina x Linguagem de Programacao:

</aside>

![Screenshot from 2022-04-22 10-25-59.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/57d03097-f38f-4162-aef4-9ce02f564284/Screenshot_from_2022-04-22_10-25-59.png)

- ASM (Assembly) - pseudo-linguagem de maquina
    - Sequencias de Bytes
    - Sequencia pode ser instrucao ou valor
    - Praticamente ilegiveis

![Screenshot from 2022-04-22 10-28-20.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/73c1d003-3cb5-415d-9f78-1985702ae5e4/Screenshot_from_2022-04-22_10-28-20.png)

- Linguagem de Programacao C
    - Abstrai as linguagens de maquina
    - Ainda baixo nivel (Prox. de nivel de maquina)
    - Mais proxima da linguagem humana
    - C: mae das linguagens modernas
    - Obs: vai passar depois por um compilador transformando isso, em um tipo codigo de ASM

---

<aside>
🔥 Estruturas de Sistemas:

</aside>

> Estrtutura de um Programa:
> 

Dados <—> se comunicam <—> Execucao

- O programa usad dados: ints, floats, bools...
- O programa executa: expressoes, comandos, estruturas;
- Programas sao como orquestras: musicos e instrumentos sao dados; e o executor e o maestro;

> Sistemas Web x Sistemas Desktop - Semelhancas
> 
- Interfaces graficas, botoes, menus e tabelas
- Armazenam e carregam dados
- Fluxo de negocio e consistencia

> Sistema Web x Sistemas Desktop - Diferencas
> 

|                                      Sistemas Web  |                                 Sistemas Desktop |
| --- | --- |
| Instalacao apenas nas maquinas necessarias  | Instlacao em todas as maquinas que o usam |
| Redistribuicao e atualizacoes mais simplificadas  | Redistribuicao e atualizacoes mais complicadas  |
| Multi-plataforma por padrao  | Plataformas especificas |
| Generalizado | Especializado |
|  |  |
