## Atividade

1. Observe o estado das referências nos repositórios local e remoto.
2. Atualize o repositório local com as mudanças do repositório remoto.
3. Edite o arquivo "readme.md" incluindo ao final "1. Leia o Livro Pro Git para revisar  os comandos".
4. Faça o "commit" localmente.
5. Novamente, observe as diferenças entre os repositórios local e remoto.
6. Visualize as divergências entre os ramos retornando aos comandos vistos nas aulas anteriores.

---
### Verificando o estado das referências nos repositórios local e remoto

A partir do comando `git log --all` podemos ver todas as referências dos commits anteriores, como não foi proposto nenhum commit local, temos commit apenas no remote `r1`, que foi renomeado anteriormente.

Saída de `git log --all`:

```
commit 346b7c472c3f645cfba82e934246ec045712b46a (r1/main, r1/HEAD)
Author: Rafael Moreira de Melo <132792028+rafaelmelom-dev@users.noreply.github.com>
Date:   Wed Jul 9 23:18:36 2025 -0300

    Create README.md
```

### Sincronizando o repositório local com o repositório remote 

Como já temos as informações do remote, podemos utilizar o comando `git merge` para podemos mesclar as mudanças do remote para a linha local.

Log depois do comando `git merge r1/main`:

```
commit 346b7c472c3f645cfba82e934246ec045712b46a (HEAD -> main, r1/main, r1/HEAD)
Author: Rafael Moreira de Melo <132792028+rafaelmelom-dev@users.noreply.github.com>
Date:   Wed Jul 9 23:18:36 2025 -0300

    Create README.md
```

Como podemos ver em `HEAD -> main`, isso evidencia que agora o repositório local está alinhado com o remote.

### Modificando o arquivo `README.md` e salvando essa mudança

Já com a alteração feita localmente iremos salvar utilizando o comando `git -a -m "update readme.md"`, tendo o seguinte log depois da operação: 

```
commit 929c4aa26628e6e23380c5ab658a9e1bb0b0a444 (HEAD -> main)
Author: Rafael Melo <rafaelmelom.dev@gmail.com>
Date:   Wed Jul 9 23:32:24 2025 -0300

    update readme.md

commit 346b7c472c3f645cfba82e934246ec045712b46a (r1/main, r1/HEAD)
Author: Rafael Moreira de Melo <132792028+rafaelmelom-dev@users.noreply.github.com>
Date:   Wed Jul 9 23:18:36 2025 -0300

    Create README.md
```

Assim podemos ver que agora a linha local está à frente da linha remota.