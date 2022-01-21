package dio_bank;

public abstract class Conta implements IConta {

	public int agencia;
	public int conta;
	public double saldo;
	
	@Override
	public void sacar(double valor) {

	}

	@Override
	public void depositar(double valor) {

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {

	}

	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return conta;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
