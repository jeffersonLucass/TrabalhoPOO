package br.com.jefferson.estoque;

public class ProdutoNaoPerecivel extends Produto {
	//CRIACAO DO ATRIBUTO CATEGORIA
	private String categoria;
	//CONSTRUTOR HERDADO DA CLASSE PAI COM O ACRESCIMO DO ATRIBUTO CATEGORIA.
	public ProdutoNaoPerecivel(String nome, double preco, int qtd,String categoria) {
		super(nome, preco, qtd);
		this.categoria = categoria;
	}
	
	
	/*POLIMORFISMO,OU SEJA,ESTA SENDO PREENCHIDO O METODO 'exibirInformacoesEspecificas'
	 * DECLARADO NA CLASSE PAI SEM ATRIBUTOS PREDEFINIDOS
	 */
	
	@Override
	public void exibirInformacoesEspecificas() {
		System.out.println("Categoria: "+categoria);
	}
	
	
}
