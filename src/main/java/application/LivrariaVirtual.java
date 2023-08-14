package application;

import entities.Eletronico;
import entities.Impresso;
import entities.Livro;
import entities.Venda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class LivrariaVirtual {
    private int MAX_IMPRESSOS = 10;
    private int MAX_ELETRONICOS = 20;
    private int MAX_VENDAS = 50;
    private List<Impresso> impressos;
    private List<Eletronico> eletronicos;
    private List<Venda> vendas;
    private int numImpressos;
    private int numEletronicos;
    private int numVendas;

    public LivrariaVirtual() {
        impressos = new ArrayList<>();
        eletronicos = new ArrayList<>();
        vendas = new ArrayList<>();
        numImpressos = 0;
        numEletronicos = 0;
        numVendas = 0;
    }

    public List<Impresso> getImpressos() {
        return impressos;
    }

    public List<Eletronico> getEletronicos() {
        return eletronicos;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void cadastrarLivro(Livro livro) {
        if (livro instanceof Impresso) {
            if (numImpressos < MAX_IMPRESSOS) {
                impressos.add((Impresso) livro);
                numImpressos++;
            } else {
                System.out.println("Número máximo de livros impressos atingido!");
            }
        } else if (livro instanceof Eletronico) {
            if (numEletronicos < MAX_ELETRONICOS) {
                eletronicos.add((Eletronico) livro);
                numEletronicos++;
            } else {
                System.out.println("Número máximo de livros eletrônicos atingido!");
            }
        }
    }

    public void realizarVenda(Venda venda) {
        if (numVendas < MAX_VENDAS) {
            vendas.add(venda);
            numVendas++;
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
        } else {
            System.out.println("Número máximo de vendas atingido!");
        }
    }

    public void listarLivros() {
        listarLivrosEletronicos();
        listarLivrosImpressos();
    }

    public void listarVendas() {
        System.out.println("Vendas realizadas: ");
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda realizada!");
        } else {
            for (Venda venda : vendas) {
                System.out.println(venda);
            }
        }
    }

    public void listarLivrosImpressos() {
        System.out.println("Livros impressos: ");
        if (impressos.isEmpty()) {
            System.out.println("Nenhum livro impresso cadastrado!");
        } else {
            for (Impresso impresso : impressos) {
                if (impresso.getEstoque() >= 1) {
                    System.out.println(impresso);
                }
            }
        }
    }

    public void listarLivrosEletronicos() {
        System.out.println("Livros eletrônicos: ");
        if (eletronicos.isEmpty()) {
            System.out.println("Nenhum livro eletrônico cadastrado!");
        } else {
            for (Eletronico eletronico : eletronicos) {
                System.out.println(eletronico);
            }
        }
    }

    public static void main(String[] args) {
        var livrariaVirtual = new LivrariaVirtual();

        while (true) {
            try {

                var opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada:" +
                        "\n1 - Cadastrar livro" + "\n2 - Realizar uma venda" + "\n3 - Listar livros" + "\n4 - Listar vendas" + "\n5 - Sair"));

                if (opcao == 1) {
                    var titulo = JOptionPane.showInputDialog("Qual o título do livro?");
                    var autor = JOptionPane.showInputDialog("Qual o autor do livro?");
                    var editora = JOptionPane.showInputDialog("Qual a editora do livro?");
                    var preco = Float.parseFloat(JOptionPane.showInputDialog("Qual o preço do livro?"));
                    var tipoLivro = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo do livro?\n 1 - Impresso\n 2 - Eletrônico"));

                    if (tipoLivro == 1) {
                        var frete = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do frete?"));
                        var estoque = Integer.parseInt(JOptionPane.showInputDialog("Qual o estoque do livro?"));
                        var livro = new Impresso(titulo, autor, editora, preco, frete, estoque);
                        livrariaVirtual.cadastrarLivro(livro);
                    } else if (tipoLivro == 2) {
                        var kbytes = Double.parseDouble(JOptionPane.showInputDialog("Qual o tamanho do livro em kbytes?"));
                        var livro = new Eletronico(titulo, autor, editora, preco, kbytes);
                        livrariaVirtual.cadastrarLivro(livro);
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                    }
                } else if (opcao == 2) {

                    var venda = new Venda();

                    if (!livrariaVirtual.getEletronicos().isEmpty() || !livrariaVirtual.getImpressos().isEmpty()) {

                        var nome = JOptionPane.showInputDialog("Qual o seu nome?");
                        var quantidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de livros que você deseja comprar?"));

                        for (int i = 0; i < quantidade; i++) {
                            var tipoLivro = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo do livro?\n 1 - Impresso\n 2 - Eletrônico"));
                            if (tipoLivro == 1) {
                                if (!livrariaVirtual.getImpressos().isEmpty()) {
                                    livrariaVirtual.listarLivrosImpressos();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não há livros impressos!");
                                }
                            } else if (tipoLivro == 2) {
                                if (!livrariaVirtual.getEletronicos().isEmpty()) {
                                    livrariaVirtual.listarLivrosEletronicos();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não há livros eletrônicos!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Opção inválida!");
                            }
                            var nomeLivro = JOptionPane.showInputDialog("Qual o nome do livro que você deseja comprar?");
                            var livros = livrariaVirtual.getImpressos();
                            for (var livro : livros) {
                                if (livro.getTitulo().equals(nomeLivro)) {
                                    if (livro.getEstoque() > 0) {
                                        venda.setCliente(nome);
                                        venda.addLivro(livro);
                                        livro.atualizarEstoque();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Não há estoque desse livro!");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Livro não encontrado!");
                                }
                            }
                        }
                        livrariaVirtual.realizarVenda(venda);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há livros cadastrados!");
                    }
                } else if (opcao == 3) {
                    livrariaVirtual.listarLivros();
                } else if (opcao == 4) {
                    livrariaVirtual.listarVendas();
                } else if (opcao == 5) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                }


            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
