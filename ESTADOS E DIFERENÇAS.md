## Atividade
1. Altere o arquivo hello.java para que gere dez saídas "Hello Git!";
2. Observe o "status" e diferenças, a seguir registre a versão atualizada
no repositório;
3. Observe a diferença entre os arquivos. Repita o processo fazendo
novas modificações;
4. Crie um arquivo "hello.txt", inclua um texto com algumas
orientações sobre o Git e adicione ao repositório;
5. Renomeie o arquivo para "hello.md";
6. Remova o arquivo do repositório.

---
### Modificando o arquivo e visualizando as diferenças
Com as devidas modificações no arquivo `hello.java`, agora ele faz o que é pedido, e visualizando a diferença temos: 

```diff
 class Hello {
     public static void main (String[] args) {
-        System.out.println("Hello, world!");
+        for (int i = 0; i < 10; i ++) {
+            System.out.println("Hello Git!");
+        }
     }
 }
```

### Criando o arquivo hello.txt
Foi criado um arquivo nomeado `hello.txt`, com o seguinte conteúdo `O git é uma ferramenta de versionamento de código, e seus principais comandos a serem aprendidos são o git add, git status e git commit.`, uma breve apresentação do git e seus principais comandos.

### Renomeando o arquivo hello.txt
Após renomear o arquivo `hello.txt`, e consultá-lo através do `git status`, obtemos a seguinte saída: 

```zsh
On branch main
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        renamed:    hello.txt -> hello.md
```

### Removendo o arquivo hello.md
Agora após remover o arquivo `hello.md`, e consultando novamente o `git status` temos a seguinte saída: 

```zsh
On branch main
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        deleted:    hello.md
```



