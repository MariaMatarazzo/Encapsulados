package Capsula_18_09;

public class ObjetoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto prod = new Produto ("-------Queijo Prato e seu Valor Inicial: ", 50.00);

		// Mostra Valores iniciais
		System.out.println(prod.getNome() + prod.getPreco());

		prod.setPreco (53);
		System.out.println("Preço Ajustado: "+prod.getPreco());

		prod.setPreco (56);
		System.out.println("Preço Ajustado: "+prod.getPreco());


		prod.setNome ("----------Produto: Queijo Parmesão-----------");
		prod.setPreco (80);
		System.out.println(prod.getNome());
		System.out.println("Preço inicial-: "+prod.getPreco());

	}

}
