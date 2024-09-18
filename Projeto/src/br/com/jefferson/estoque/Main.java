package br.com.jefferson.estoque;

public class Main {

	public static void main(String[] args) {
		//CRIA UM NOVO ESTOQUE
		Estoque estoque = new Estoque();
		//CRIA NOVOS PRODUTOS
		Produto produto1 = new ProdutoPerecivel("leite",3.50,20,"2023-10-10");
		Produto produto2 = new ProdutoNaoPerecivel("Arroz",19.99,50,"graos");
		Produto produto3 = new ProdutoPerecivel("Iogurte",2.50,15,"2023-09-25");
		Produto produto4 = new ProdutoNaoPerecivel("Feijao",7.99,30,"graos");
		Produto produto5 = new ProdutoNaoPerecivel("Azeite",29.99,10,"condimentos");
		
		//ADICIONANDO O PRODUTO AO ESTOQUE
		estoque.AdcProduto(produto1);
		estoque.AdcProduto(produto2);
		estoque.AdcProduto(produto3);
		estoque.AdcProduto(produto4);
		estoque.AdcProduto(produto5);
		
		//EXIBINDO A LISTA DE PRODUTOS DENTRO DO ESTOQUE
		estoque.ExibirEstoque();
	}

}
