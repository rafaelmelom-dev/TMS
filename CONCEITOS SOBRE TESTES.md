## Atividade 

1. Recapitule seus projetos anteriores e enumere os testes que realizou.
2. Tente descrever os testes que realizou nos termos (ou conceitos) apresentados anteriormente. Descreva de forma breve, mas clara e com exemplos práticos.
3. Procure referências na literatura acadêmica envolvendo os termos: erro, falha, defeito e bug. Aponte o título de pelo menos um artigo relevante envolvendo cada termo. Resuma brevemente do que se trata o trabalho e qual a relação com o termo.

---
### Projetos anteriormente

Refletindo os projetos anteriormente realizados ao longo do curso, tive vários projetos com testes implícitos (sem consciência de como realmente eu faria), muitas vezes utilizando o debugger ou impressões ao longo do programa, como porque uma função não funciona.

Descrevendo um pouco mais e pensando nisso, os testes estáticos, em minha experiência foram os mais trabalhosos, foram problemas associados à lógica do programa, e não aos erros de sintaxe. Já os testes dinâmicos, muitas vezes poderia ser consertados utilizando o debugger para procurar o erro.

### Termos no livro de Delamaro

Delamaro indroduz os seguintes conceitos com seus devidos significados.

**Defeito**, como um conjunto de passos, processos e/ou definição de dados incorretos.
**Erro**, estado do programa inconsistente ou inesperado (basicamente, o que não foi planejado). 

Obs.: Entenda por estado do programa, o ponto atual do programa, considerando os dados no exato momento da execução e também a instruções a ser realizada.

**Falha**, decorrente de um erro, basicamente a partir de um erro, o resultado será algo não esperado.

Como Delamaro não definiu **bug**, podemos ver sua definição na Wikipedia.
Onde **bug** é apresentado como uma falha de design do software, ou seja, praticamente um **defeito**, por mais que o bug possa ser inesperado como um erro, o bug é decorrente de uma falha no processo, ou conjunto de passos necessários para realizar uma ação.