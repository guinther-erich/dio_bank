package dio_bank.Main;

import dio_bank.classes.Cliente;
import dio_bank.classes.Conta;
import dio_bank.classes.ContaCorrente;
import dio_bank.classes.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Guinther Erich");
        
		Conta cc = new ContaCorrente(novoCliente);
		Conta cp = new ContaPoupanca(novoCliente);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
