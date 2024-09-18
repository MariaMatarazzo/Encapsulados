package Capsula_18_09;

public class ContaBancaria {
	//Atributo privado
	private double saldo;

	//Construtor para iniciar o saldo
	public ContaBancaria(double saldoInicial) {
		if (saldoInicial >= 0) {
			this.saldo = saldoInicial;
		}else {
			this.saldo = 0;
		}
	}
	//getter para saldo
	public double getSaldo() {
		return saldo;

	}
	//Metodo para depositar dinheiro(só aceita valores positivos)
	public void depositar (double valor) {
		if (valor>0) {
			saldo+= valor;
		}else {
		System.out.println("Valor de deposito invalido!");
		}
	}

	//Metodo para sacar dinheiro (nao pode sacar mais do que o saldo)
	public void sacar (double valor) {
		if (valor>0 && valor <= saldo) {
			saldo-=valor;
		}else {
			System.out.println("Saque Invalido!Verifique o valor");
		}
	}
}