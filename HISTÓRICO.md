## Atividade  

1. Considerando o repositório clonado do git, teste cada um dos comandos apresentados antes para visualizar o histórico interpretando as saídas;
2. Teste a consulta a seguir no repositório com o código do próprio Git: `git log --pretty="%h - %s" --author=gitster --since="2008-10-01" --before="2008-11-01" --no-merges -- t/`
3. Analise e interprete os resultados apresentados pela consulta.

---
### Testando os comandos

`git log` - usado para visualizar o histórico de commits realizados no repositório. Temos um exemplo de alguns commits com esse repositório usado para registrar as atividades da disciplina 

```
commit 6f225d12632a903288172eb3b53a08747dd5ee93
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Wed Jun 25 13:56:40 2025 -0300

    UPDATE: novas atividades

commit 151707e43aa4c2a08d9921013abf1fce78ba335d
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Wed Jun 25 13:40:20 2025 -0300

    OBSIDIAN UPDATE

commit a2de9363900d3939199c4cb4ddc277920b558e99
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Tue Jun 24 00:02:09 2025 -0300

    UPDATE: novas atividades realizadas

commit 47cae1a4ff79aded3497f0763b8616f2e44cd8da
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Tue Jun 24 00:01:39 2025 -0300

    UPDATE: novas atividades realizadas
```

`git log -p` - usado para, além de visualizar o histórico de commits, visualizar as diferenças que foram registradas em cada arquivo. Temos um exemplo de commit de uma das atividades realizadas na disciplina, como podemos ver, o `git log -p`, junta os logs de commits com suas diferenças

```diff
commit a2de9363900d3939199c4cb4ddc277920b558e99
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Tue Jun 24 00:02:09 2025 -0300

    UPDATE: novas atividades realizadas

diff --git "a/ESTADOS E DIFEREN\303\207AS.md" "b/ESTADOS E DIFEREN\303\207AS.md"
new file mode 100644
index 0000000..56ce3a5
--- /dev/null
+++ "b/ESTADOS E DIFEREN\303\207AS.md"
@@ -0,0 +1,51 @@
+## Atividade
+1. Altere o arquivo hello.java para que gere dez saídas "Hello Git!";
+2. Observe o "status" e diferenças, a seguir registre a versão atualizada
+no repositório;
+3. Observe a diferença entre os arquivos. Repita o processo fazendo
+novas modificações;
+4. Crie um arquivo "hello.txt", inclua um texto com algumas
+orientações sobre o Git e adicione ao repositório;
+5. Renomeie o arquivo para "hello.md";
+6. Remova o arquivo do repositório.
+
+---
+### Modificando o arquivo e visualizando as diferenças
+Com as devidas modificações no arquivo `hello.java`, agora ele faz o que é pedido, e visualizando a diferença temos:
+
+```diff
+ class Hello {
+     public static void main (String[] args) {
+-        System.out.println("Hello, world!");
++        for (int i = 0; i < 10; i ++) {
++            System.out.println("Hello Git!");
++        }
+     }
+ }
+```
+
+### Criando o arquivo hello.txt
+Foi criado um arquivo nomeado `hello.txt`, com o seguinte conteúdo `O git é uma ferramenta de versionamento de código, e seus principais comandos a serem aprendidos são o git add, git status e git commit.`, uma breve apresentação do git e seus principais comandos.
+
+### Renomeando o arquivo hello.txt
+Após renomear o arquivo `hello.txt`, e consultá-lo através do `git status`, obtemos a seguinte saída:
+
+```zsh
+On branch main
+Changes to be committed:
+  (use "git restore --staged <file>..." to unstage)
+        renamed:    hello.txt -> hello.md
+```
+
+### Removendo o arquivo hello.md
+Agora após remover o arquivo `hello.md`, e consultando novamente o `git status` temos a seguinte saída:
+
+```zsh
+On branch main
+Changes to be committed:
+  (use "git restore --staged <file>..." to unstage)
+        deleted:    hello.md
+```
+
+
+
```

`git log --stat` - usado para visualizar as estatísticas de cada commit, uma alternativa seria a flag `--shortstat`, para menos informações. Temos um exemplo a seguir 

```
commit 6f225d12632a903288172eb3b53a08747dd5ee93 (HEAD -> main, origin/main, origin/HEAD)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Wed Jun 25 13:56:40 2025 -0300

    UPDATE: novas atividades

 .obsidian/workspace.json        | 15 ++++++++-------
 "Controle de Vers\303\265es.md" |  3 ++-
 "HIST\303\223RICO.md"           |  8 ++++++++
 3 files changed, 18 insertions(+), 8 deletions(-)
```

`git log --pretty=<opcao>` - usado para formatos de saída customizados, já existem alguns formatos pré-configurados, e também podemos customizar com a opção `format:"<string_formato>"`. Podemos ver um exemplo de saída do seguinte comando `git log --pretty=oneline`, fazendo que os commits sejam mostrados em apenas uma linha.

```
6f225d12632a903288172eb3b53a08747dd5ee93 (HEAD -> main, origin/main, origin/HEAD) UPDATE: novas atividades
151707e43aa4c2a08d9921013abf1fce78ba335d OBSIDIAN UPDATE
a2de9363900d3939199c4cb4ddc277920b558e99 UPDATE: novas atividades realizadas
47cae1a4ff79aded3497f0763b8616f2e44cd8da UPDATE: novas atividades realizadas
27d0c36959842223b8f670fcb753e71d1eaa803e UPDATE: atividade nova
```

Testando um comando customizado, `git log --pretty="%h - %s" --author=gitster --since="2008-10-01" --before="2008-11-01" --no-merges -- t/`, mas o comando não mostra nada, pois ele está procurando de um autor chamado `gitster`, que não tenho registros, do dia 1 de outubro a 1 de novembro de 2008, onde também não tenho registros. 

`git log --graph` - usado para visualizar o fluxo dos commits, por enquanto não temos uma situação prática no nosso repositório. Mas tenho um exemplo de um repositório pessoal que dá para visualizar

```
* commit 58ee5c480e8f6ba965b000209dd163446e95e990
| Author: rafaelmelom-dev <rafaelmelom.dev@gmail.com>
| Date:   Fri Jun 20 00:05:16 2025 -0300
|
|     Last Sync: 2025-06-20 03:05:16 (Mobile)
|
*   commit 9d3e469c75b985ca8d036132cd4200a72f839342
|\  Merge: 44f4789 a83a1e7
| | Author: Rafael Melo <rafaelmelom.dev@gmail.com>
| | Date:   Fri Jun 20 00:04:31 2025 -0300
| |
| |     Merge branch 'master' of https://github.com/rafaelmelom-dev/notes.git
| |
| * commit a83a1e71afc34f51a11b438d4a0acfcb8f6b7580
| | Author: Rafael Melo <rafaelmelom.dev@gmail.com>
| | Date:   Fri Jun 20 00:03:18 2025 -0300
| |
| |     SYNC PC
| |
* | commit 44f4789c17485930a3c27cf78d91bf7ba19ffdf2
|/  Author: rafaelmelom-dev <rafaelmelom.dev@gmail.com>
|   Date:   Fri Jun 20 00:01:07 2025 -0300
|
|       Last Sync: 2025-06-20 03:01:07 (Mobile)
|
* commit c3fd58c43efb2fc78d2a9aab8944816bbac5e0cf
| Author: Rafael Melo <rafaelmelom.dev@gmail.com>
| Date:   Fri Jun 20 00:00:00 2025 -0300
|
|     SYNC PC
```

Além dessas, a ferramenta `git log` tem várias outras opções, mas alguns destaques aqui ao final vão para o `git log --<since|until>=<data|n.unidade>` para visualizar commits relativos a tempos, `git log --grep=<termo>` para pesquisar em mensagens de commits e `git log -S <code>`, para pesquisar em diferenças registradas nos commits. Colocarei um exemplo de cada para melhor visualização.

`git log --since=2.days`, tendo apenas os commits dos últimos dois dias, mas pode ser usado data absoluta no lugar de `2.days`. `since` mostra os commits feitos a partir de dois dias atrás, e `until` mostra os commits feitos antes de dois dias atrás.

```
commit 6f225d12632a903288172eb3b53a08747dd5ee93 (HEAD -> main, origin/main, origin/HEAD)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Wed Jun 25 13:56:40 2025 -0300

    UPDATE: novas atividades

commit 151707e43aa4c2a08d9921013abf1fce78ba335d
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Wed Jun 25 13:40:20 2025 -0300

    OBSIDIAN UPDATE
```

`git log --grep=atividades`, mostrando os commits que tem atividades na mensagem do commit, no exemplo mostrarei apenas algumas delas.

```
commit 6f225d12632a903288172eb3b53a08747dd5ee93
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Wed Jun 25 13:56:40 2025 -0300

    UPDATE: novas atividades

commit a2de9363900d3939199c4cb4ddc277920b558e99
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Tue Jun 24 00:02:09 2025 -0300

    UPDATE: novas atividades realizadas

commit 47cae1a4ff79aded3497f0763b8616f2e44cd8da
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Tue Jun 24 00:01:39 2025 -0300

    UPDATE: novas atividades realizadas
```

`git log -S normas`, mostrando as atividades realizadas referentes a normas. Então ele mostra os commits que foram realizados e que contem a palavra `normas` em suas diferenças

```
commit f3ad12fa86a49b599264862f8a6c580af8ba6a17
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Wed Jun 18 01:29:50 2025 -0300

    UPDATE: tópicos separados, e algumas atividades respondidas

commit cf5b7261a9f14110cc8cbc47d5cbd26dab834376
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Wed Jun 11 23:16:29 2025 -0300

    FIRST COMMIT
```
``

