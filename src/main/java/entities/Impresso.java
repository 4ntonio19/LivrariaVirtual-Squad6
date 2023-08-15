package entities;

public class Impresso extends Livro {
	private int frete;
	private int estoque;

	public Impresso(String titulo, String autores, String editora, float preco, int frete, int estoque) {
		super(titulo, autores, editora, preco);
		this.frete = frete;
		this.estoque = estoque;
	}

	public Impresso(int frete, int estoque) {
		this.frete = frete;
		this.estoque = estoque;
	}

	public Impresso() {
		super();
	}

	public float getFrete() {
		return frete;
	}

	public void setFrete(int frete) {
		this.frete = frete;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void atualizarEstoque() {
		estoque = -1;
	}

	@Override
    public String toString() {
        return String.format("%-20s %-20s %-15s %-10.2f %-10d %-10d", getTitulo(), getAutores(), getEditora(), getPreco(), frete, estoque);
    }

}
