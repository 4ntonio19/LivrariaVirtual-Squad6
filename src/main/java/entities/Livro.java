package entities;

public abstract class Livro {
    private String titulo;
    private String autores;
    private String editora;
    private float preco;

    public Livro(String titulo, String autores, String editora, float preco) {
        super();
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.preco = preco;
    }

    public Livro() {
        super();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + titulo + "\nAutores: " + autores + "\nEditora: " + editora + "\nPreco: R$" + preco + "\n";
    }


}
