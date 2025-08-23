## Atividade 

1. Crie um repositório remoto no GitHub chamado meu_remoto.
2. Clone o repositório localmente.
3. Liste o estado deste repositório criado
4. No GitHub, crie um arquivo "readme.md" com o texto "Como utilizar este repositório:"
5. Verifique a partir da linha de comando as alterações feitas no repositório.
6. Altere o nome da referência ao repositório para "r1".

--- 
### Criando um repositório chamado `meu_remoto` e o clonando

Com o repositório `meu_remoto` criado agora iremos cloná-lo. Utilizando o comando `git clone https://github.com/rafaelmelom-dev/meu_remoto` temos a seguinte saída:

```
Cloning into 'meu_remoto'...
warning: You appear to have cloned an empty repository.
```

E o seguinte estado: 

```
On branch main

No commits yet

nothing to commit (create/copy files and use "git add" to track)
```

### Arquivo `README.md` criado no GitHub

A partir disso vamos verificar as alterações feitas no repositório, utilizando o comando `git log --all` podemos ver os logs de todas as branchs, inclusive as branchs remotas: 

```
commit 346b7c472c3f645cfba82e934246ec045712b46a (origin/main, origin/HEAD)
Author: Rafael Moreira de Melo <132792028+rafaelmelom-dev@users.noreply.github.com>
Date:   Wed Jul 9 23:18:36 2025 -0300

    Create README.md
```

Onde podemos ver o commit que o GitHub gerou, e que a branch `main` atual não está sincronizado com essas mudanças.

### Renomeando o remote `origin`  para `r1`

Para realizarmos esta operação podemos utilizar o seguinte comando `git remote rename origin r1`, que vai mudar o nome do remote `origin` para `r1`. Como saída temos : 

```
Renaming remote references: 100% (3/3), done.
```

