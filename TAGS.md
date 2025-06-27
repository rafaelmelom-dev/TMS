## Atividade

1. Para os projetos pesquisados anteriormente, examine como (e se) foi feito o uso de tags. Verifique se há versões do projeto marcadas como tags e qual esquema de versionamento foi usado;
2. Pesquise outros projetos conhecidos e veja como é feito o uso das tags, por exemplo: como são nomeadas, quais commits foram marcados, quais informações foram registradas, de quanto em quanto tempo as tags foram criadas?
3. Tendo encontrado um repositório que faz uso de tags para versões, teste as opções de filtragem das tags, por exemplo, listando todos os commits associados a versão "1.1.*" do projeto (se existir).
4. Para o repositório criado como exemplo experimente criar tags e associá-las ao commit mais recente e também aos anteriores.
5. Teste a criação de tags "anotadas" e "leves". Observe as diferenças.

---
### Visualizando as tags

Por meio do comando `git tag`, podemos visualizar as tags já salvas no repositório, no repositório `git-katas` temos a seguinte saída. 

```
0.1.1
0.2.0
0.3.0
```

Aparentemente utilizando o esquema de versões do SemVer, versionamento semântico. Mencionando também o tempo, da versão `0.1.1` para a versão `0.2.0`, foram 2 meses de diferenças, mas já da versão `0.2.0`, para a versão `0.3.0` foram quase 1 ano de diferença.

### Visualizando os commits relacionados a tag

Utilizando o comando `git show <nome_tag>`, podemos visualizar os commits relacionados àquela tag especificada.

Como por exemplo no repositório anterior, do `git-katas`, utilizando `git show "0.3.0"`, temos:

```
tag 0.3.0
Tagger: Jan Krag <jan.krag@eficode.com>
Date:   Fri Oct 29 22:26:22 2021 +0200

Change katas to use git switch where relevant

commit 02d104345060b37565550f77c2bce06ce5738ef5 (tag: 0.3.0)
Author: Jan Krag <jan.krag@eficode.com>
Date:   Tue Oct 26 16:09:57 2021 +0200

...
```

Onde podemos ver quem criou a tag, e os commits relacionados a ela, no exemplo acima, para minimizar coloquei apenas o commit, mas abaixo viria sua mensagem, e depois as diferenças.

### Criando minhas próprias tags

Como base utilizarei da pasta `pratica/hellogit`, uma das primeiras atividades práticas da disciplina.

O primeiro comando utilizado foi `git tag -a "0.1.0" 8fcbe8e -m "Hello, World\!"`, onde essa hash é do commit inicial, onde o programa para imprimir `Hello, World!` já estava pronto, e ainda foi deixado uma mensagem para entender qual parte foi essa. Agora no log ela já aparece marcada: 

```
commit 8fcbe8e5db763498162895ca42174fe220cdc768 (tag: 0.1.0)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Mon Jun 23 14:35:15 2025 -0300

    commit inicial
```

E utilizando o `git show "0.1.0"`, visualizamos os dados da tag e do commit.

```diff
tag 0.1.0
Tagger: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Fri Jun 27 09:50:18 2025 -0300

Hello, World!

commit 8fcbe8e5db763498162895ca42174fe220cdc768 (tag: 0.1.0)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Mon Jun 23 14:35:15 2025 -0300

    commit inicial

diff --git a/hello.java b/hello.java
new file mode 100644
index 0000000..36c440a
--- /dev/null
+++ b/hello.java
@@ -0,0 +1,5 @@
+class Hello {
+    public static void main (String[] args) {
+        System.out.println("Hello, world!");
+    }
+}
```

Mas os arquivos foram alterados para imprimir `Hello Git!` dez vezes, supondo que isso seja uma funcionalidade nova, agora marcaremos a versão "0.2.0", mas sem nenhuma informação extra, utilizando `git tag "0.2.0"`. Podemos observar também que agora não especificamos o commit, logo a tag irá para o commit mais recente. Agora com o comando `git tag`, visualizamos as tags criadas.

```
0.1.0
0.2.0
```

E utilizando o `git show`, apenas para observar a diferença entre uma tag anotada, a tag anterior, e uma tag leve, a tag criada agora.

```diff
commit 8ca7d6162c7fad41bca5a97b48fc34ba8cc28ac4 (HEAD -> main, tag: 0.2.0)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Tue Jun 24 00:01:17 2025 -0300

    UPDATE

diff --git a/hello.md b/hello.md
deleted file mode 100644
index 878deeb..0000000
--- a/hello.md
+++ /dev/null
@@ -1 +0,0 @@
-O git é uma ferramenta de versionamento de código, e seus principais comandos a serem aprendidos são o git add, git status e git commit.
```