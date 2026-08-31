# Trabalho - Árvore Binária de Busca
## Estrutura de Dados II

### Descrição
Implementação de uma Árvore Binária de Busca (ABB) não balanceada em Java, seguindo o TAD apresentado em aula.

### Estrutura do Projeto
```
TrabalhoArvoreBinaria_ED2/
├── src/
│   ├── Item.java                 # Classe que representa um item (chave-valor)
│   ├── ArvoreBinaria.java        # Classe principal da árvore binária
│   └── TesteArvoreBinaria.java   # Classe com os testes
└── README.md
```

### Arquivos

#### Item.java
Representa um item armazenado na árvore.
- Atributos: chave (int), valor (String)
- Métodos: `compareTo()`, `getChave()`, `getValor()`, `toString()`

#### ArvoreBinaria.java
Implementação da árvore binária de busca.
- Classe privada interna `No` (representa cada nó)
- Métodos públicos: `pesquisa(Item)`, `insere(Item)`, `imprime()`
- Métodos privados recursivos: `pesquisa(Item, No)`, `insere(Item, No)`, `central(No)`

#### TesteArvoreBinaria.java
Testa inserção, busca (com e sem sucesso), prevenção de duplicatas e impressão em ordem.

### Como Compilar e Executar

Pré-requisito: JDK 8 ou superior, com `javac` disponível no PATH.

1. Navegue até a pasta `src`:
   ```bash
   cd TrabalhoArvoreBinaria_ED2/src
   ```

2. Compile:
   ```bash
   javac Item.java ArvoreBinaria.java TesteArvoreBinaria.java
   ```

3. Execute:
   ```bash
   java TesteArvoreBinaria
   ```

### Exemplo de Saída

```
Busca por 1: 1: Um
Busca por 6: 6: Seis
Busca por 14: 14: Quatorze
Busca por 8: 8: Oito
Busca por 5: null
Busca por 100: null
Busca por -1: null
Busca por 50: null
Erro: Registro com chave 8 já existe na árvore!

========================================
Árvore em ordem (caminhamento central):
========================================
  1: Um
  3: Três
  4: Quatro
  6: Seis
  7: Sete
  8: Oito
  10: Dez
  14: Quatorze
========================================
```

### Observações

- Complexidade de inserção e busca: O(log n) em média, O(n) no pior caso (árvore degenerada).
- A comparação entre itens é feita pela interface `Comparable`, implementada em `Item`.
- A impressão usa caminhamento central (in-order), resultando em ordem crescente de chave.
- Remoção não foi implementada, conforme escopo do trabalho.
- Inserções em ordem sequencial (ex: 1, 2, 3, 4...) deixam a árvore desbalanceada, próxima de uma lista ligada.

---
**Data de Entrega**: 30/08/2026
**Disciplina**: Estrutura de Dados II
**Aluno**: Pedro Cesar Rocha