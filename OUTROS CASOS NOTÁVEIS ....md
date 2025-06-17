## Atividade  

Pesquise sobre outros casos de grande repercussão:
+ Bug do Milênio
+ Queda do sistema de informática da British Airways
+ Interrupção do serviço AWS S3 da Amazon
+ CrowdStrike e Microsoft: entenda a interrupção cibernética que deu 'tela azul' em vários países

Responda as questões no slide anterior considerando estes casos

--- 
### Perguntas do slide anterior

+ Quais são os principais vilões nessas histórias?
+ O que poderia ser feito para evitar tais problemas?
+ Como você avalia a qualidade desses softwares?
+ Qual é a relação entre os casos anteriores?
+  Quais foram os impactos?

---
## Primeiramente, o que são falhas ?

Falhas são erros, ou defeitos, sejam eles na parte de hardware ou software de um sistema, embora seja comum ocorrer erros dos dois lados, os erros de hardware são erros que podem ser aleatórios atribuídos a disversos fatores, ou sistemáticos. Mas os erros de software por sua vez são sempre sistemáticos.

#### Logo, se problemas de software são sistemáticos eles podem ser evitáveis ?

Em geral, sim, pois falhas sistemáticas são muitas vezes atribuídas a falha de planejamento, seja direto ou indireto, sendo um erro não cogitado como o Bug do Milênio, uma falha evitável mas que não foi planejada para ser evitada. Podemos mencionar também o problema do ano de 2038, o tempo padrão POSIX/IEEE 1003 prevê o tempo calculado entre a diferença de segundos do tempo atual e 1 de Janeiro de 1970, o problema principal é que atualmente o tempo calculado em C, manipulado pelo `time_t` pode ser considerado um inteiro de 32 bits com o bit de sinal, quando atingirmos 19 e Janeiro de 2038 esse tempo pode ser mal calculado, sendo os 32 bits atualmente usados insuficientes. Esse bug comentado em detalhes é um exemplo de que uma falha é detectável, e que podem ser difíceis de contornar, visto que no exemplo muitos sistemas dependem desse cálculo.

#### Afinal, quais foram os erros cometidos ?

Podemos concluir que muitos desses erros podem ter sido por conta de planejamento ou testes, visto que um complementa o outro, onde eu não consigo testar totalmente um software e constatar que ele não tem bug, e também é muito improvável um software ter sido pensado nos mínimos detalhes de forma que não irá acarretar em agum bug eventualmente. Como o erro de cálculo do Patriot em 1991, um erro difícil de ser previsto, dadas exatas condições.

#### A qualidade desses softwares

Esses softwares, geralmente, foram pensados e contruídos por pessoas qualificadas, dadas que a maioria dos problemas que foram repercutidos são de sistemas críticos, então a qualidade desses software tendem a ser boas, mas nem sempre a qualidade mede a quantidade de bugs. Lembrando que eu não posso constatar que um sistema está livre de bugs se eu não fizer o teste do software para todo o seu domínio e condições, logo é improvável, sendo uma ruim comparação entre qualidade e esses raros problemas.

#### Impactos dessas falhas sistemáticas

Essas falhas, em sua maioria como são históricas, causaram muito transtorno, e algumas até a morte de várias pessoas

### Referência 

[Falha no sistema Patriot](https://www-users.cse.umn.edu/~arnold/disasters/patriot.html)