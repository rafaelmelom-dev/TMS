## Atividade 

1. Solicite a seu colega que faça uma sequência de edições no arquivo readme.md
2. Registre as mudanças no repositório remoto.
3. Receba as mudanças realizadas usando o comando pull
4. Crie um ramo fixes, atualize o arquivo readme.md e registre no git.
5. Envie as mudanças ao repositório remoto.
6. Faça a fusão de fixes ao ramo principal, removendo o ramo de correções a seguir.

---
### Editando o arquivo `readme.md`

Na branch `dev2`, realizaremos uma sequência de edições no arquivo `readme.md`. E em seguida já jogamos para o remoto utilizando o comando `git push origin dev2`.

Agora com as mudanças realizadas no remoto, iremos importá-las para o nosso repositório local. Utilizando o comando `git pull`, já recebemos as últimas mudanças do ramo `dev2`.

### Atualizando o arquivo `readme.md`, e registrando no Git

As devidas correções foram aplicadas e atualizadas no git, e assim podemos visualizá-la por meio do log: 

```
commit c072ae44cced0b56562f98b32969940a3b86065f (HEAD -> fixes)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Sat Jul 19 12:02:29 2025 -0300

    fix readme.md

commit 0f84ee56f321974ef341eedee3eb3601ca40cd7f (r1/dev2, dev2)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:58:54 2025 +0000

    update 6 readme.md
```

Levando as mudanças locais ao remoto `fixes` por meio do comando `git push r1 fixes`. Agora o remoto `fixes` já têm as correções da branch `dev2`.

### Fundindo tudo à branch `main`, para aplicarmos tudo que foi atualizado e corrigido

Arquivo `README.md` na branch `main`:

```
Como utilizar este repositório

1. Leia o Livro Pro Git para revisar os comandos
2. Pratique os comandos com as atividades propostas

Boa Sorte!
```

Arquivo `README.md` na branch `fixes`:

```
Como utilizar este repositório

1. Leia o Livro Pro Git para revisar os comandos
2. Pratique os comandos com as atividades propostas
3. Pratique os exercícios no git-katas

Boa Sorte em sua jornada aprendendo Git!
```

Utilizando o comando `git merge fixes` a partir da branch `main`, temos a fusão.

Assim agora o arquivo `README.md` contém:

```
Como utilizar este repositório

1. Leia o Livro Pro Git para revisar os comandos
2. Pratique os comandos com as atividades propostas
3. Pratique os exercícios no git-katas

Boa Sorte em sua jornada aprendendo Git!
```

E não aconteceu nenhum conflito. E para alguma informação mais completa o log é o seguinte: 

```
commit c072ae44cced0b56562f98b32969940a3b86065f (HEAD -> main, r1/fixes, fixes)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Sat Jul 19 12:02:29 2025 -0300

    fix readme.md

commit 0f84ee56f321974ef341eedee3eb3601ca40cd7f (r1/dev2, dev2)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:58:54 2025 +0000

    update 6 readme.md

commit 2c4bc6ba20c425145d72d9d187f8211e16c1bf34
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:53:52 2025 +0000

    update 5 readme.md

commit 93a565b5ac780d439117558ce014a8552763d8be (r1/dev1, dev1)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Sat Jul 19 11:25:45 2025 -0300

    update 4 readme.md

commit 3d43174bcd085398829c3a1493cce7f1f6868cc1 (r1/main, r1/HEAD)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:00:00 2025 +0000

    update 3 readme.md
```

Agora falta apenas remover os ramos de desenvolvimento e correções, visto que eles não são mais necessários. Temos os comandos e suas saídas:

```
> git branch -D fixes
Deleted branch fixes (was c072ae4).
> git branch -D dev1
Deleted branch dev1 (was 93a565b).
> git branch -D dev2
Deleted branch dev2 (was 0f84ee5).
```

Com os ramos removidos no local, e posteriormente no remoto. Os logs agora nem mostram as branchs locais exceto a `main`.
