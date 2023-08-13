package entities;

public class Eletronico {
    private int tamanho;

    public Eletronico(int tamanho) {
        this.tamanho = tamanho;
    }

    public Eletronico() {
        super();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Eletronico [tamanho=" + tamanho + "]";
    }


}
