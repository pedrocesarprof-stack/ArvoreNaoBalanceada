public class TesteArvoreBinaria {

    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserção de elementos
        int[] chaves = {8, 3, 10, 1, 6, 14, 4, 7};
        String[] valores = {
                "Oito", "Três", "Dez", "Um", "Seis", "Quatorze", "Quatro", "Sete"
        };

        for (int i = 0; i < chaves.length; i++) {
            arvore.insere(new Item(chaves[i], valores[i]));
        }

        // Busca de elementos existentes
        int[] chavesParaBuscar = {1, 6, 14, 8};
        for (int chave : chavesParaBuscar) {
            Item resultado = arvore.pesquisa(new Item(chave, ""));
            System.out.println("Busca por " + chave + ": " + resultado);
        }

        // Busca de elementos que não existem
        int[] chavesNaoExistentes = {5, 100, -1, 50};
        for (int chave : chavesNaoExistentes) {
            Item resultado = arvore.pesquisa(new Item(chave, ""));
            System.out.println("Busca por " + chave + ": " + resultado);
        }

        // Tentativa de inserção duplicada
        arvore.insere(new Item(8, "Oito - Duplicado"));

        // Impressão da árvore
        arvore.imprime();
    }
}