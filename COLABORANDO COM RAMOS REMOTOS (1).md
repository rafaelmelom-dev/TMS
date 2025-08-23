## Atividade 

1. Crie um ramo local dev1
2. Edite o arquivo readme.md usando este ramo e registre o commit.
3. Crie um ramo de rastreamento para dev1 para o repositório remoto.
4. Solicite que seu colega atualize o repositório dele com o dev1 e receba as mudanças que realizou.
5. Peça seu amigo repita todo o processo de outra máquina, dessa vez, criando um ramo dev2.

---
### Criando um ramo `dev1`

Utilizando o comando `git branch dev1`, o ramo `dev1` agora está criado e então iremos editar o arquivo `readme.md` no ramo `dev1`.

### Editando o arquivo `README.md` no ramo `dev1`

Utilizando o comando `git switch dev1`, agora iremos atualizar o arquivo na devida branch. E depois do commit podemos visualizar as mudanças por meio do `git log --all`:

```
commit 93a565b5ac780d439117558ce014a8552763d8be (HEAD -> dev1)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Sat Jul 19 11:25:45 2025 -0300

    update 4 readme.md

commit 3d43174bcd085398829c3a1493cce7f1f6868cc1 (r1/main, r1/HEAD, main)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:00:00 2025 +0000

    update 3 readme.md
```

### Criando um ramo para rastreamento no repositório remoto, GitHub, para podermos levar as atualizações do local ao remoto

Com o ramo já criado e atualizado, podemos ver pelo comando `git log --all`, o ponto atual da branch `dev1`, no repositório local e remoto:

```
commit 93a565b5ac780d439117558ce014a8552763d8be (HEAD -> dev1, r1/dev1)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Sat Jul 19 11:25:45 2025 -0300

    update 4 readme.md

commit 3d43174bcd085398829c3a1493cce7f1f6868cc1 (r1/main, r1/HEAD, main)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:00:00 2025 +0000

    update 3 readme.md
```

### Atualizando o repositório local do colega 

Utilizando o comando `git fetch` as mudanças já estão no repositório local do colega, e assim visualizamos com o comando `git log --all`:

```
commit 93a565b5ac780d439117558ce014a8552763d8be (origin/dev1)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Sat Jul 19 11:25:45 2025 -0300

    update 4 readme.md

commit 3d43174bcd085398829c3a1493cce7f1f6868cc1 (HEAD -> main, origin/main, origin/HEAD)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:00:00 2025 +0000

    update 3 readme.md
```

### Agora realizando o mesmo processo, mas agora do repositório do colega

Criamos o ramo `dev2`, a partir do ramo `dev1`. E assim realizamos algumas alterações no arquivo `README.md`. 

Criamos um ramo para o remoto, alinhado ao ramo `dev2`.

E assim levamos as mudanças ao remoto utilizando o comando `git push origin dev2`.

Com as mudanças já no remoto, vamos levá-la ao nosso repositório local.

Recebemos as atualizações no repositório local:

```
commit 2c4bc6ba20c425145d72d9d187f8211e16c1bf34 (HEAD -> dev2, r1/dev2)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:53:52 2025 +0000

    update 5 readme.md

commit 93a565b5ac780d439117558ce014a8552763d8be (r1/dev1, dev1)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Sat Jul 19 11:25:45 2025 -0300

    update 4 readme.md

commit 3d43174bcd085398829c3a1493cce7f1f6868cc1 (r1/main, r1/HEAD, main)
Author: Rafael Melo (Alt) <rafaelmelom1205@gmail.com>
Date:   Sat Jul 19 14:00:00 2025 +0000

    update 3 readme.md
```

