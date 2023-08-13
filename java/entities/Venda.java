package entities;

public class Venda {
	private Livro[] livros;
	private static int numVendas = 0;
	private int numero;
	private String cliente;
	private float valor;
	public Venda(Livro[] livros, int numero, String cliente, float valor) {
		this.livros = livros;
		this.numero = numero;
		this.cliente = cliente;
		this.valor = valor;
	}
	public Venda() {
		super();
	}
	public Livro[] getLivros() {
		return livros;
	}
	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}
	public static int getNumVendas() {
		return numVendas;
	}
	public static void setNumVendas(int numVendas) {
		Venda.numVendas = numVendas;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void addLivro(Livro l, int index) {
		if(index >= 0 && index < livros.length) {
			livros[index] = l;
		}else {
			System.out.println("Índice inválido.");
		}
	}
	public void listarLivros() {
		for (Livro livro : livros) {
			if(livro != null){
				System.out.println(livro);	
			}
		}
	}
}
