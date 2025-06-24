## Atividade

1. Descreva o resultado esperado para um repositório com um arquivo
.ignore contendo:
```
!lib.a
/TODO
build/
doc/*.txt
doc/**/*.pdf
```
2. Inclua um arquivo hello.tmp no repositório criado na atividade
anterior.
3. Observe o "status" deste arquivo, sem incluí-lo no repositório.
4. Altere o repositório para que passe a ignorar este arquivo.

---
### Resultados
Pensando em um arquivo .ignore com essas características, o arquivo ou pasta `TODO` seria ignorado, a pasta `build` seria ignorada recursivamente, qualquer arquivo com extensão `.txt` na pasta `doc` seria ignorado, e qualquer arquivo `.pdf` que tenha `doc` como raiz, mas `lib.a` pode estar incluso.

### Criando o arquivo e verificando o git ignore
Logo após criar o arquivo, usando o comando `git status`, ele é mostrado na área de `untracked`, e quando o arquivo `.gitignore` é adicionado o arquivo `hello.tmp` nem é mostrado na área de `untracked`.
