package br.com.jefferson.estoque;
//IMPORTANDO BIBLIOTECA PARA CRIAR UMA LISTA DINAMICA DE OBJETOS
import java.util.ArrayList;
//IMPORTANDO BIBLIOTECA PARA TRABALHAR COM LISTAS DE ARRAY NESSE CASO EM ESPECIFICO
import java.util.List;


public class Estoque {
	private List<Produto> produtos ; //LISTA QUE ARMAZENA OBJETOS DO TIPO PRODUTO
	//CONSTRUTOR QUE INICIALIZA A LISTA DE ARRAY GARANTINDO QUE COMECE VAZIO
	public Estoque() {
		produtos = new ArrayList<>();
	}
	//RECEBE O OBJETO E O ADICIONA A LISTA
	public void AdcProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void ExibirEstoque() {
		//O FOR IRA PERCORRER A LISTA E EXIBIR OS DETALHES DOS PRODUTOS
		for (Produto produto : produtos) {
			produto.ExibirInformacoes();
			System.out.println("==============");
		}
	}
}
