public class ArvoreBinaria {

    // Nó interno da árvore
    private static class No {
        Item reg;
        No esq;
        No dir;
    }

    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // Busca um item pela chave
    public Item pesquisa(Item reg) {
        return this.pesquisa(reg, this.raiz);
    }

    private Item pesquisa(Item reg, No p) {
        if (p == null) {
            return null;
        } else if (reg.compareTo(p.reg) < 0) {
            return pesquisa(reg, p.esq);
        } else if (reg.compareTo(p.reg) > 0) {
            return pesquisa(reg, p.dir);
        } else {
            return p.reg;
        }
    }

    // Insere um novo item na árvore
    public void insere(Item reg) {
        this.raiz = this.insere(reg, this.raiz);
    }

    private No insere(Item reg, No p) {
        if (p == null) {
            p = new No();
            p.reg = reg;
            p.esq = null;
            p.dir = null;
        } else if (reg.compareTo(p.reg) < 0) {
            p.esq = insere(reg, p.esq);
        } else if (reg.compareTo(p.reg) > 0) {
            p.dir = insere(reg, p.dir);
        } else {
            System.out.println("Erro: Registro com chave " + reg.getChave() + " já existe na árvore!");
        }
        return p;
    }

    // Imprime a árvore em ordem crescente
    public void imprime() {
        System.out.println("\n========================================");
        System.out.println("Árvore em ordem (caminhamento central):");
        System.out.println("========================================");
        if (this.raiz == null) {
            System.out.println("[Árvore vazia]");
        } else {
            this.central(this.raiz);
        }
        System.out.println("========================================\n");
    }

    private void central(No p) {
        if (p != null) {
            central(p.esq);
            System.out.println("  " + p.reg);
            central(p.dir);
        }
    }
}