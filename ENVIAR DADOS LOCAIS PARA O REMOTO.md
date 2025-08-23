## Atividade

1. Antes de cada passo verifique o estado do repositório e acompanhe e aponte as diferenças observadas após cada comando executado.
2. Certifique-se que as últimas mudanças foram registradas por "commit" localmente e envie as mudanças ao repositório remoto.
3. Solicite ao seu colega que atualize o repositório dele com as alterações.
4. Solicite que seu colega realize mudanças no arquivo "readme.md", faça o commit e envie ao repositório remoto.
5. Atualize seu repositório local com as mudanças.
6. Observe as diferenças entre os repositórios local, remoto e o de seu colega.

---
### Enviando as alterações ao remoto

Dado o último log da atividade anterior, temos um commit local que não foi enviado ao remoto, e todas as alterações atuais já estão registradas em commit.

Último log para relembrarmos:

```diff
commit 3f55d5e2dad33f62f691f5a13c6cc028a8a23e35
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Thu Jul 10 16:26:47 2025 -0300

    update 2 readme.md

diff --git a/README.md b/README.md
index 87f6711..a19c9bc 100644
--- a/README.md
+++ b/README.md
@@ -1,3 +1,4 @@
 Como utilizar este repositório
 
 1. Leia o Livro Pro Git para revisar os comandos
+2. Pratique os comandos com as atividades propostas

commit 929c4aa26628e6e23380c5ab658a9e1bb0b0a444
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Wed Jul 9 23:32:24 2025 -0300

    update readme.md

diff --git a/README.md b/README.md
index ce71c6a..87f6711 100644
--- a/README.md
+++ b/README.md
@@ -1 +1,3 @@
 Como utilizar este repositório
+
+1. Leia o Livro Pro Git para revisar os comandos

commit 346b7c472c3f645cfba82e934246ec045712b46a
Author: Rafael Moreira de Melo <132792028+rafaelmelom-dev@users.noreply.github.com>
Date:   Wed Jul 9 23:18:36 2025 -0300

    Create README.md

diff --git a/README.md b/README.md
new file mode 100644
index 0000000..ce71c6a
--- /dev/null
+++ b/README.md
@@ -0,0 +1 @@
+Como utilizar este repositório
```

Utilizando o comando `git push r1 main`, iremos jogar o último commit ao repositório remoto. Com a saída do comando `git log --all`, vemos no último commit que agora o repositório remoto está alinhado ao repositório local (remoto nomeado como r1, conforme atividade anterior): 

```
commit 3f55d5e2dad33f62f691f5a13c6cc028a8a23e35 (HEAD -> main, r1/main, r1/HEAD)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Thu Jul 10 16:26:47 2025 -0300

    update 2 readme.md
```

### Atualizando o repositório local do 'colega', conforme repositório remoto atualizado anteriormente

Com o comando `git pull`, no repositório local do colega, agora temos o repositório do colega atualizado, podemos visualizar isso por meio da saída do comando `git pull` :

```
📦[rafaelmelom@test]~/Repos/meu_remoto% git pull
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 0), reused 3 (delta 0), pack-reused 0 (from 0)
Unpacking objects: 100% (3/3), 335 bytes | 335.00 KiB/s, done.
From https://github.com/rafaelmelom-dev/meu_remoto
   929c4aa..3f55d5e  main       -> origin/main
Updating 346b7c4..3f55d5e
Fast-forward
 README.md | 3 +++
 1 file changed, 3 insertions(+)
```

E também por meio do comando `git log --all`, em que podemos ver o local alinhado com o remoto também: 

```
commit 3f55d5e2dad33f62f691f5a13c6cc028a8a23e35 (HEAD -> main, origin/main, origin/HEAD)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Thu Jul 10 16:26:47 2025 -0300

    update 2 readme.md
```

### Adicionando texto ao README.md

Arquivo `README.md` atualizado pelo colega, adicionando o texto `Boa Sorte!`, e registrando o commit. Conforme últimos dois logs, podemos visualizar o ponto atual do repositório do colega: 

```
commit 3d43174bcd085398829c3a1493cce7f1f6868cc1 (HEAD -> main)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:00:00 2025 +0000

    update 3 readme.md

commit 3f55d5e2dad33f62f691f5a13c6cc028a8a23e35 (origin/main, origin/HEAD)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Thu Jul 10 16:26:47 2025 -0300

    update 2 readme.md
```

### Enviando ao repositório remoto

Para enviar ao repositório remoto, temos que dar acesso ao colega, para ele poder atualizar o nosso repositório remoto. Após autorizarmos o colega, ele terá de levar as atualizações locais ao remoto, utilizando o comando `git push origin main`, e assim podemos confirmar por meio do comando `git log --all`, tendo como saída: 

```
commit 3d43174bcd085398829c3a1493cce7f1f6868cc1 (HEAD -> main, origin/main, origin/HEAD)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:00:00 2025 +0000

    update 3 readme.md
```


### Atualizando  o meu repositório local, de acordo com as mudanças já realizadas no remoto

Utilizando o comando `git fetch`, no meu repositório, agora podemos visualizar as mudanças por meio do comando `git log --all`:

```
commit 3d43174bcd085398829c3a1493cce7f1f6868cc1 (r1/main, r1/HEAD)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:00:00 2025 +0000

    update 3 readme.md

commit 3f55d5e2dad33f62f691f5a13c6cc028a8a23e35 (HEAD -> main)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Thu Jul 10 16:26:47 2025 -0300

    update 2 readme.md
```

Agora que as mudanças estão no repositório local, podemos misturar a nossa pasta de trabalho, para realmente podermos visualizar as mudanças. Nesse exato momento, o repositório local ainda não está atualizado.

Utilizando o comando  `git merge r1/main`, iremos mesclar as mudanças do remoto ao repositório local: 

```
> git merge r1/main
Updating 3f55d5e..3d43174
Fast-forward
 README.md | 2 ++
 1 file changed, 2 insertions(+)
```

E assim vemos por meio do comando `git log --all`, que as mudanças já podem ser visualizadas e editadas no repositório local, e assim tudo já está alinhado: 

```
commit 3d43174bcd085398829c3a1493cce7f1f6868cc1 (HEAD -> main, r1/main, r1/HEAD)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:00:00 2025 +0000

    update 3 readme.md
```

### Todos os repositórios foram atualizados

Agora que todos os repositórios foram atualizados, os logs são os mesmos, e não tem grande necessidade do destaque de cada um, podemos visualizar a saída de `git log --all` no meu repositório local:

Obs.: Únicas diferenças que teremos será o nome do remoto.

```
commit 3d43174bcd085398829c3a1493cce7f1f6868cc1 (HEAD -> main, r1/main, r1/HEAD)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:00:00 2025 +0000

    update 3 readme.md

commit 3f55d5e2dad33f62f691f5a13c6cc028a8a23e35
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Thu Jul 10 16:26:47 2025 -0300

    update 2 readme.md

commit 929c4aa26628e6e23380c5ab658a9e1bb0b0a444
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Wed Jul 9 23:32:24 2025 -0300

    update readme.md

commit 346b7c472c3f645cfba82e934246ec045712b46a
Author: Rafael Moreira de Melo <132792028+rafaelmelom-dev@users.noreply.github.com>
Date:   Wed Jul 9 23:18:36 2025 -0300

    Create README.md
```