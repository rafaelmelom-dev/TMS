# Atividade 

1. Estenda a classe de testes criada no exemplo de autenticação do usuário para que os diferentes valores para autenticação sejam fornecidos usando @ValueSource;
2. Crie uma sobrecarga do método de autenticação que permita informar o algoritmo a ser usado (ex: "SHA-256", "MD5", "SHA-1"), testando o lançamento de exceções caso o algoritmo seja desconhecido (o que também deve ser testado);
3. Crie os casos de teste para autenticação anterior, informando os algoritmos com duas versões alternativas: @ValueSource e @EnumSource;
4. Crie testes alternativos para que os valores informados sejam carregados usando @CsvSource e, depois, @CsvFileSource;
5. Compare as várias versões de testes criadas e analise as vantagens e desvantagens de cada uma.

--- 
## 