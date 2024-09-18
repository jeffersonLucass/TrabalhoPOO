package br.com.jefferson.estoque;

public class ProdutoPerecivel extends Produto {
	//CRIACAO DO ATRIBUTO VALIDADE
	private String validade;
	//CONSTRUTOR HERDADO DA CLASSE PAI COM O ACRESCIMO DO ATRIBUTO VALIDADE.
	public ProdutoPerecivel(String nome, double preco, int qtd,String validade) {
		super(nome, preco, qtd);
		this.validade = validade;
	}
	/*POLIMORFISMO,OU SEJA,ESTA SENDO PREENCHIDO O METODO 'exibirInformacoesEspecificas'
	 * DECLARADO NA CLASSE PAI SEM ATRIBUTOS PREDEFINIDOS
	 */
	@Override
	public void exibirInformacoesEspecificas() {
		System.out.println("validade: "+validade);
	}
	
	
	
	
	
}
