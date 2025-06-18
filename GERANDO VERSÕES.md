## Atividade 

1. Qual seria sua estratégia para identificar as versões? Justifique.
2. Como nomearia a primeira versão para o público?
3. Após liberado o projeto, uma nova funcionalidade foi requisitada e implementada. Como nomearia esta nova versão?
4. Considerando a sequência anterior com o esquema de versionamento SemVer. Como ficaria o histórico de versões?
5. A partir da versão indicada antes, uma série de 3 correções, seguida por duas funcionalidades compatíveis com a versão atual e mais outras 2 correcões foram publicadas em série. Qual seria a versão mais recente?
6. Uma versão nova exigiu mudanças críticas na API, foi lançada e na sequências houveram três novas versões: uma com adição de funcionalidades, seguidas de 2 com correçoes de bugs. Como fica o histórico?
7. Pesquise exemplos representativos de versões reais de software considerando cada um dos termos apontados.

---
### **Como identificar versões de softwares**

Talvez o camiho mais padrão a ser utilizado nesse tipo de tarefa é seguir um padrão estabelecido anteriormente como o **SemVer**, pois é um esquema de versões que permitem identificar modificações com mais facilidade, visto que se as versões não forem estruturadas as versões só poderam ser identificadas por números aleatórios e tornaria o seu uso muito complicado.

### **Como nomear a primeira versão**

Pensando em uma ordem natural, poderíamos ter a versão 1.0.0, pensando no um como o significado da primeira versão, e os outros dois zeros pela lógica do padrão **SemVer**

### **Mas, e se algo fosse adicionado a primeira versão**

Também seguindo o padrão **SemVer**, atualizaríamos para 1.1.0, pensando no um do meio como o próximo conjunto de incrementos.

Sendo o histórico de versões do projeto:

+ 1.0.0  > Projeto inicial 
+ 1.1.0  > Funcionalidade adicionada

Em resposta a questão cinco teríamos a versão 1.3.2, visto que foram corrigido trẽs bugs, a última verão era 1.1.0, logo foi para 1.1.3, e logo em seguida adicionado duas funcionalidades, logo foi de 1.1.3 para 1.3.0, e em seguida também foi corrigido outros dois bugs, logo foi de 1.3.0 para 1.3.2.

Agora em resposta a questão seis teríamos a versão 2.1.2, tendo o seguinte histórico.

+ 1.0.0  > Projeto inicial
+ 1.1.0  > Funcionalidade adicionada
+ 1.1.1  > Bug corrigido
+ 1.1.2  > Bug corrigido
+ 1.1.3  > Bug corrigido
+ 1.2.0  > Funcionalidade adicionada
+ 1.3.0  > Funcionalidade adicionada
+ 1.3.1  > Bug corrigido
+ 1.3.2  > Bug corrigido

>Estágio até a questão anterior

+ 2.0.0  > Atualização, mudando a API
+ 2.1.0  > Funcionalidade adicionada
+ 2.1.1  > Bug corrigido
+ 2.1.2  > Bug corrigido

### **Exemplos reais**

A linguagem de programação Python, que usa **SemVer** (Versionamento Semântico)
A linguagem de programação Java, que apesar do histórico diferente, usa o final do ano, sendo sua última versão 24, que foi lançada em 2024
A linguagem de programação C, também faz algumas referências ao ano, como o último C23, que foi lançado no começo do ano de 2024