# Atividade

1. Para cada tipo de teste visto, pesquise por técnicas e ferramentas para sua realização. Indique as referências.
2. Dê exemplos de artefatos produzidos por tais técnicas e/ou ferramentas.
3. Procure exemplos de relatórios de execução feitos para pelo menos três tipos de teste

---
## Relembrando os tipos de testes

Os testes podem ser dos seguintes tipos: 
* Exploratório.
* Unidade, Integração, API e Sistema.
* Aceitação e Usabilidade.
* Desempenho, Estresse e Carga.
* Segurança e Confiabilidade.
* Regressão, Recuperação e Configuração.

## Ferramentas 

Temos plataformas famosas e versáteis como o Selenium, e CyPress, que combinadas podem cobrir boa parte dos testes, visto que o Selenium é usado para testes de API, de Sistema e de Aceitação. E o CyPress o completa com testes Unitários, de Integração, API, Sistema e de Usabilidade. Mas não existem apenas essas, para o mesmo fim, também podemos citar o JUnit, Jenkins. Fazendo uma ressalva, esses são frameworks semelhantes que tem uma linha parecida, mais focada no aspecto funcional do software.

Completando, existem algumas ferramentas para medir o estado do software, como testes de Desempenho, Confiabilidade, Carga, Configuração e Segurança, como o JMeter, utilizando o ambiente Java, para teste de desempenho, principalmente. Também o já citado Selenium, para testes de Configuração, e outros não tão convencionais como o SoapUI para testes de Segurança.

Os testes exploratórios são mais contemplados por testes manuais, não contando com ferramentas. Além dos testes de regressão, que são mais um conceito, que pode ser realizado por qualquer ferramenta, dado que o teste de regressão é a execução de testes anteriores.

Esse foi um breve resumo de algumas opções de ferramentas apresentadas no curso.

## Relatórios de testes

Em sites que apresentam a ferramenta podemos visualizar os relatórios produzidos, como parte do "tutorial" da ferramenta. Ainda podendo desfrutar de um pouco de conhecimento gerado nesse aprendizado.

Alguns sites pesquisados foram os seguintes:
https://medium.com/@fabiobsilva96/cypress-exemplos-pr%C3%A1ticos-dessa-fant%C3%A1stica-ferramenta-b8b5f0796d38
https://www.guru99.com/pt/testng-report.html2
https://www.devmedia.com.br/junit-tutorial/1432
https://br.jmeter.net/usermanual/generating-dashboard.html

Um ponto interessante é que as ferramentas de testes mais focadas no aspecto funcional do software, como o primeiro parágrafo da seção **Ferramentas** diz, apesar de algumas diferenças, apresentam um relatório parecido, com conceitos iguais, como quantidade de testes que passaram, que foram pulados, que executaram, dentre outros.