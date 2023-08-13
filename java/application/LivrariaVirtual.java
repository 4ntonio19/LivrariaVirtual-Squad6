package application;

import entities.Eletronico;
import entities.Impresso;
import entities.Venda;

public class LivrariaVirtual {
	private int MAX_IMPRESSOS = 10;
	private int MAX_ELETRONICOS = 20;
	private int MAX_VENDAS = 50;
	private Impresso[] impressos;
	private Eletronico[] eletronicos;
	private Venda[] vendas;
	private int numImpressos;
	private int numEletronicos;
	private int numVendas;
	public LivrariaVirtual(int mAX_IMPRESSOS, int mAX_ELETRONICOS, int mAX_VENDAS, Impresso[] impressos,
			Eletronico[] eletronicos, Venda[] vendas, int numImpressos, int numEletronicos, int numVendas) {
		MAX_IMPRESSOS = mAX_IMPRESSOS;
		MAX_ELETRONICOS = mAX_ELETRONICOS;
		MAX_VENDAS = mAX_VENDAS;
		this.impressos = impressos;
		this.eletronicos = eletronicos;
		this.vendas = vendas;
		this.numImpressos = numImpressos;
		this.numEletronicos = numEletronicos;
		this.numVendas = numVendas;
	}
	public LivrariaVirtual() {
		super();
	}
	public int getMAX_IMPRESSOS() {
		return MAX_IMPRESSOS;
	}
	public void setMAX_IMPRESSOS(int mAX_IMPRESSOS) {
		MAX_IMPRESSOS = mAX_IMPRESSOS;
	}
	public int getMAX_ELETRONICOS() {
		return MAX_ELETRONICOS;
	}
	public void setMAX_ELETRONICOS(int mAX_ELETRONICOS) {
		MAX_ELETRONICOS = mAX_ELETRONICOS;
	}
	public int getMAX_VENDAS() {
		return MAX_VENDAS;
	}
	public void setMAX_VENDAS(int mAX_VENDAS) {
		MAX_VENDAS = mAX_VENDAS;
	}
	public Impresso[] getImpressos() {
		return impressos;
	}
	public void setImpressos(Impresso[] impressos) {
		this.impressos = impressos;
	}
	public Eletronico[] getEletronicos() {
		return eletronicos;
	}
	public void setEletronicos(Eletronico[] eletronicos) {
		this.eletronicos = eletronicos;
	}
	public Venda[] getVendas() {
		return vendas;
	}
	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}
	public int getNumImpressos() {
		return numImpressos;
	}
	public void setNumImpressos(int numImpressos) {
		this.numImpressos = numImpressos;
	}
	public int getNumEletronicos() {
		return numEletronicos;
	}
	public void setNumEletronicos(int numEletronicos) {
		this.numEletronicos = numEletronicos;
	}
	public int getNumVendas() {
		return numVendas;
	}
	public void setNumVendas(int numVendas) {
		this.numVendas = numVendas;
	}
	
	
	
}
