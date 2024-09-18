package Capsula_18_09;

public class ObjetoEndereco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endereco Endereco1 = new Endereco();
		System.out.println(Endereco1.getId());
		System.out.println(Endereco1.getlogradouro());
		System.out.println(Endereco1.getnumero());
		System.out.println(Endereco1.getcomplemento());
		System.out.println(Endereco1.getbairro());
		System.out.println(Endereco1.getcidade());
		System.out.println(Endereco1.getcep());
		System.out.println(Endereco1.getuf());

		//***********Construtor sem argumento*********
		System.out.println ("/////SEGUNDO ENDEREÇO/////");
		Endereco Endereco2 = new Endereco();
		Endereco2.setid(10);
		Endereco2.setlogradouro("Aurora");
		Endereco2.setnumero(678987643);
		Endereco2.setcomplemento("Aurora");
		Endereco2.setbairro("Aurora");
		Endereco2.setcidade("Aurora");
		Endereco2.setcep("Aurora");
		Endereco2.setuf("Aurora");
		
		System.out.println(Endereco2.getId());
		System.out.println(Endereco2.getlogradouro());
		System.out.println(Endereco2.getnumero());
		System.out.println(Endereco2.getcomplemento());
		System.out.println(Endereco2.getbairro());
		System.out.println(Endereco2.getcidade());
		System.out.println(Endereco2.getcep());
		System.out.println(Endereco2.getuf());
		
	}

}
