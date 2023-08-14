package entities;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Livro> livros;
    private static int numVendas = 0;
    private static int numero = 0;
    private String cliente;
    private float valor;

    public Venda(String cliente) {
        this.cliente = cliente;
        numVendas++;
        this.livros = new ArrayList<>();
        numero++;
    }

    public Venda() {
        numVendas++;
        this.livros = new ArrayList<>();
        numero++;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public Venda setLivros(List<Livro> livros) {
        this.livros = livros;
        return this;
    }

    public static int getNumVendas() {
        return numVendas;
    }

    public static void setNumVendas(int numVendas) {
        Venda.numVendas = numVendas;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Venda.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public Venda setCliente(String cliente) {
        this.cliente = cliente;
        return this;
    }

    public float getValor() {
        return valor;
    }

    public Venda setValor(float valor) {
        this.valor = valor;
        return this;
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            if (livro != null) {
                System.out.println(livro);
            }
        }
    }
}
