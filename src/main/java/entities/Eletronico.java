package entities;

public class Eletronico extends Livro {

    private double tamanho;

    public Eletronico(String titulo, String autores, String editora, float preco, double tamanho) {
        super(titulo, autores, editora, preco);
        this.tamanho = tamanho;
    }

    public Eletronico(double tamanho) {
        this.tamanho = tamanho;
    }

    public Eletronico() {
        super();
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + "Tamanho: " + tamanho + "kbytes. \n";
    }


}
