## Atividade

1. Crie um arquivo reparo.md. Inclua nele as orientações sobre o uso do comando amend para atualizar um commit. Registre o arquivo no repositório indicando o que fez. Confirme que o commit foi realizado.
2. Lembrando-se que um arquivo extra referencias.md deveria fazer parte do commit anterior, crie o arquivo, inclua referências sobre o uso do comando ammend retiradas da ajuda do Git e associe ao commit realizado.
3. Edite o arquivo reparo.md apagando seu conteúdo e adicionando essa nova versão ao Stage. Confirme a inclusão das edições usando diff entre as diferentes versões do arquivo (Stage, Área de Trabalho e Repositório).
4. Edite novamente o arquivo reparo.md e inclua o texto `Prestes a perder meus dados...`. Novamente, observe a diferença entre os arquivos.
5. Remova o arquivo do Stage, repetindo as verificações.
6. Restaure o arquivo original registrado, descartando as edições mais recentes feitas na área de trabalho.

---
### Criando o arquivo `reparo.md` e registrando no commit

O comando `git log -p`, nos permite visualizar que o commit foi realizado com sucesso 

``` diff
commit 4258c9be2511c420aef5470ad9ae9d909f987828 (HEAD -> main)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Thu Jun 26 11:05:54 2025 -0300

    commit inicial

diff --git a/reparo.md b/reparo.md
new file mode 100644
index 0000000..048bded
--- /dev/null
+++ b/reparo.md
@@ -0,0 +1 @@
+A flag `--amend` do comando `git` permite que novas alterações sejam registrados junto com as alterações do commit anterior, basicamente o comando exclui o commit anterior, junta as alterações atuais e as do commit excluído e registra um novo commit
```

### Criando o arquivo `referencias.md` e adicionando ao commit anterior

A flag `--amend` do comando `commit` apenas funciona se o arquivo já tinha sido adicionado antes. Logo fiz um commit incial do arquivo `referencias.md`

```
commit 80412c37e5b3c08eae3d20328e5acefe59b16ccd (HEAD -> main)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Thu Jun 26 11:07:43 2025 -0300

    referencias adicionado

diff --git a/referencias.md b/referencias.md
new file mode 100644
index 0000000..e69de29
```

Mas nesse commit inicial, ele não possui o texto de referência, agora iremos colocar o texto no arquivo e registrá-lo nesse commit inicial usando o comando `git commit --amend --no-edit`, a flag `--no-edit` serve para não alterar a mensagem do  commit que será gerado.

```diff
commit 937ea457311f4f1637b5dd3408b9e2e190a5aeac
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Thu Jun 26 11:07:43 2025 -0300

    referencias adicionado

diff --git a/referencias.md b/referencias.md
new file mode 100644
index 0000000..1ec51ff
--- /dev/null
+++ b/referencias.md
@@ -0,0 +1,63 @@
+usage: git commit [-a | --interactive | --patch] [-s] [-v] [-u[<mode>]] [--amend]
+                  [--dry-run] [(-c | -C | --squash) <commit> | --fixup [(amend|reword):]<commit>]
+                  [-F <file> | -m <msg>] [--reset-author] [--allow-empty]
+                  [--allow-empty-message] [--no-verify] [-e] [--author=<author>]
+                  [--date=<date>] [--cleanup=<mode>] [--[no-]status]
+                  [-i | -o] [--pathspec-from-file=<file> [--pathspec-file-nul]]
+                  [(--trailer <token>[(=|:)<value>])...] [-S[<keyid>]]
+                  [--] [<pathspec>...]
+
+    -q, --[no-]quiet      suppress summary after successful commit
+    -v, --[no-]verbose    show diff in commit message template
+
+Commit message options
+    -F, --[no-]file <file>
+                          read message from file
+    --[no-]author <author>
+                          override author for commit
+    --[no-]date <date>    override date for commit
+    -m, --[no-]message <message>
+                          commit message
+    -c, --[no-]reedit-message <commit>
+                          reuse and edit message from specified commit
+    -C, --[no-]reuse-message <commit>
+                          reuse message from specified commit
+    --[no-]fixup [(amend|reword):]commit
+                          use autosquash formatted message to fixup or amend/reword specified commit
+    --[no-]squash <commit>
+                          use autosquash formatted message to squash specified commit
+    --[no-]reset-author   the commit is authored by me now (used with -C/-c/--amend)
+    --trailer <trailer>   add custom trailer(s)
+    -s, --[no-]signoff    add a Signed-off-by trailer
+    -t, --[no-]template <file>
+                          use specified template file
+    -e, --[no-]edit       force edit of commit
+    --[no-]cleanup <mode> how to strip spaces and #comments from message
+    --[no-]status         include status in commit message template
+    -S, --[no-]gpg-sign[=<key-id>]
+                          GPG sign commit
+
+Commit contents options
+    -a, --[no-]all        commit all changed files
+    -i, --[no-]include    add specified files to index for commit
+    --[no-]interactive    interactively add files
+    -p, --[no-]patch      interactively add changes
+    -o, --[no-]only       commit only specified files
+    -n, --no-verify       bypass pre-commit and commit-msg hooks
+    --verify              opposite of --no-verify
+    --[no-]dry-run        show what would be committed
+    --[no-]short          show status concisely
+    --[no-]branch         show branch information
+    --[no-]ahead-behind   compute full ahead/behind values
+    --[no-]porcelain      machine-readable output
+    --[no-]long           show status in long format (default)
+    -z, --[no-]null       terminate entries with NUL
+    --[no-]amend          amend previous commit
+    --no-post-rewrite     bypass post-rewrite hook
+    --post-rewrite        opposite of --no-post-rewrite
+    -u, --[no-]untracked-files[=<mode>]
+                          show untracked files, optional modes: all, normal, no. (Default: all)
+    --[no-]pathspec-from-file <file>
+                          read pathspec from file
+    --[no-]pathspec-file-nul
+                          with --pathspec-from-file, pathspec elements are separated with NUL character
```

### Apagando o conteúdo de `reparo.md`

Depois de apagado o conteúdo essa é a saída do comando `git diff`.

```diff
diff --git a/reparo.md b/reparo.md
index 048bded..8b13789 100644
--- a/reparo.md
+++ b/reparo.md
@@ -1 +1 @@
-A flag `--amend` do comando `git` permite que novas alterações sejam registrados junto com as alterações do commit anterior, basicamente o comando exclui o commit anterior, junta as alterações atuais e as do commit excluído e registra um novo commit
+
```

Adicionando o arquivo a área de staged, esse status foi para o comando `git diff --staged`, contendo exatamente a mesma mensagem, mas agora o arquivo está na área de staged.

E depois do commit, podemos visualizar as mudanças por meio do comando `git log -p`

```diff
commit 83527d9e2f077f6ac8a3eedbd8d452a2c8725d3c (HEAD -> main)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Thu Jun 26 11:19:08 2025 -0300

    reparo.md apagado

diff --git a/reparo.md b/reparo.md
index 048bded..8b13789 100644
--- a/reparo.md
+++ b/reparo.md
@@ -1 +1 @@
-A flag `--amend` do comando `git` permite que novas alterações sejam registrados junto com as alterações do commit anterior, basicamente o comando exclui o commit anterior, junta as alterações atuais e as do commit excluído e registra um novo commit
+
```

### Adicionando o texto `Prestes a perder meus dados...` ao arquivo `reparo.md` e observando novamente

Depois de adicionado o texto, podemos visualizar a diferença pelo comando `git diff`

```diff
diff --git a/reparo.md b/reparo.md
index 8b13789..d9e38c7 100644
--- a/reparo.md
+++ b/reparo.md
@@ -1 +1 @@
-
+Prestes a perder meus dados...
```

Novamente adicionando à área de stage, esses status se move para a área de staged também, pois o arquivo `reparo.md` agora está na área de stage. Essa igualdade, depois de adicionado, podemos ver pelo comando `git diff --staged`.

### Restaurando o texto que foi perdido

Utilizando o comando `git restore --worktree reparo.md`, o arquivo retorna as edições mais recentes salvadas. Mas o arquivo `reparo.md` ainda está vazio, pois o salvamos assim, agora temos que retornar ao commit em que apagamos o texto. 

Adicionalmente podemos voltar ao ponto em que `reparo.md` tinha o texto sobre a flag `--amend`, utilizando o comando `git reset <hash>`, utilizando o hash do commit anterior de onde o reparo foi apagado. Em seguida o arquivo `reparo.md` virá com um status de modificado, o último passo seria usar o comando `git restore reparo.md`, ele irá pegar a primeira mudança que fizemos em `restore.md`, que foi adicionar o texto sobre a flag `--amend`, assim nosso arquivo está restaurado.

Para fixar podemos visualizar novamente os logs com a flag `-p`, para visualizar as diferenças e ver que o commit com a mensagem `reparo.md apagado` foi excluído. E que agora o arquivo voltou ao seu normal.

```diff
commit 937ea457311f4f1637b5dd3408b9e2e190a5aeac
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Thu Jun 26 11:07:43 2025 -0300

    referencias adicionado

diff --git a/referencias.md b/referencias.md
new file mode 100644
index 0000000..1ec51ff
--- /dev/null
+++ b/referencias.md
@@ -0,0 +1,63 @@
+usage: git commit [-a | --interactive | --patch] [-s] [-v] [-u[<mode>]] [--amend]
+                  [--dry-run] [(-c | -C | --squash) <commit> | --fixup [(amend|reword):]<commit>]
+                  [-F <file> | -m <msg>] [--reset-author] [--allow-empty]
+                  [--allow-empty-message] [--no-verify] [-e] [--author=<author>]
+                  [--date=<date>] [--cleanup=<mode>] [--[no-]status]
+                  [-i | -o] [--pathspec-from-file=<file> [--pathspec-file-nul]]
+                  [(--trailer <token>[(=|:)<value>])...] [-S[<keyid>]]
+                  [--] [<pathspec>...]
+
+    -q, --[no-]quiet      suppress summary after successful commit
+    -v, --[no-]verbose    show diff in commit message template
+
+Commit message options
+    -F, --[no-]file <file>
+                          read message from file
+    --[no-]author <author>
+                          override author for commit
+    --[no-]date <date>    override date for commit
+    -m, --[no-]message <message>
+                          commit message
+    -c, --[no-]reedit-message <commit>
+                          reuse and edit message from specified commit
+    -C, --[no-]reuse-message <commit>
+                          reuse message from specified commit
+    --[no-]fixup [(amend|reword):]commit
+                          use autosquash formatted message to fixup or amend/reword specified commit
+    --[no-]squash <commit>
+                          use autosquash formatted message to squash specified commit
+    --[no-]reset-author   the commit is authored by me now (used with -C/-c/--amend)
+    --trailer <trailer>   add custom trailer(s)
+    -s, --[no-]signoff    add a Signed-off-by trailer
+    -t, --[no-]template <file>
+                          use specified template file
+    -e, --[no-]edit       force edit of commit
+    --[no-]cleanup <mode> how to strip spaces and #comments from message
+    --[no-]status         include status in commit message template
+    -S, --[no-]gpg-sign[=<key-id>]
+                          GPG sign commit
+
+Commit contents options
+    -a, --[no-]all        commit all changed files
+    -i, --[no-]include    add specified files to index for commit
+    --[no-]interactive    interactively add files
+    -p, --[no-]patch      interactively add changes
+    -o, --[no-]only       commit only specified files
+    -n, --no-verify       bypass pre-commit and commit-msg hooks
+    --verify              opposite of --no-verify
+    --[no-]dry-run        show what would be committed
+    --[no-]short          show status concisely
+    --[no-]branch         show branch information
+    --[no-]ahead-behind   compute full ahead/behind values
+    --[no-]porcelain      machine-readable output
+    --[no-]long           show status in long format (default)
+    -z, --[no-]null       terminate entries with NUL
+    --[no-]amend          amend previous commit
+    --no-post-rewrite     bypass post-rewrite hook
+    --post-rewrite        opposite of --no-post-rewrite
+    -u, --[no-]untracked-files[=<mode>]
+                          show untracked files, optional modes: all, normal, no. (Default: all)
+    --[no-]pathspec-from-file <file>
+                          read pathspec from file
+    --[no-]pathspec-file-nul
+                          with --pathspec-from-file, pathspec elements are separated with NUL character

commit 4258c9be2511c420aef5470ad9ae9d909f987828
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Thu Jun 26 11:05:54 2025 -0300

    commit inicial

diff --git a/reparo.md b/reparo.md
new file mode 100644
index 0000000..048bded
--- /dev/null
+++ b/reparo.md
@@ -0,0 +1 @@
+A flag `--amend` do comando `git` permite que novas alterações sejam registrados junto com as alterações do commit anterior, basicamente o comando exclui o commit anterior, junta as alterações atuais e as do commit excluído e registra um novo commit
```