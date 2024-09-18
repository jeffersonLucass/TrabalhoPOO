package br.com.jefferson.estoque;

abstract class Produto {
	private double preco;
	private String nome;
	private int qtd;
	//USANDO O METODO GET E SET PARA ARMAZENAMENTO E ALTERACAO DOS VALORES DE FORMA SEGURA
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
    // CONSTRUTOR PARA REFERENCIAR OS ATRIBUTOS GENERICOS 
	public Produto(String nome,double preco, int qtd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	//METODO CRIADO PARA MOSTRAS AS INFORMACOES SOBRE O PRODUTO
	public void ExibirInformacoes() {
		System.out.println("nome:" +getNome());
		System.out.println("preco:" +getPreco());
		System.out.println("quantidade:" +getQtd());
		exibirInformacoesEspecificas();
	}
	//CRIAÇAO DE UM METODO 'VAZIO' QUE SERA PREENCHIDO NAS CLASSES FILHOS.
	protected abstract void exibirInformacoesEspecificas();
	
	
	
	
	
	
}
