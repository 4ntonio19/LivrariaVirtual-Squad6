package entities;

public class Impresso {
	private float frete;
	private int estoque;

	public Impresso(float frete, int estoque) {
		this.frete = frete;
		this.estoque = estoque;
	}

	public Impresso() {
		super();
	}

	public float getFrete() {
		return frete;
	}

	public void setFrete(float frete) {
		this.frete = frete;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public static void atualizarEstoque(int estoque) {
		estoque -= 1;
	}

	@Override
	public String toString() {
		return "Impresso [frete=" + frete + ", estoque=" + estoque + "]";
	}

}
