public class Item implements Comparable<Item> {
    private int chave;
    private String valor;

    public Item(int chave, String valor) {
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public int compareTo(Item outro) {
        if (this.chave < outro.chave) {
            return -1;
        } else if (this.chave > outro.chave) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getChave() {
        return chave;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return chave + ": " + valor;
    }
}