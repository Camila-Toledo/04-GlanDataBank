package br.com.glandata.main;

import br.com.glandata.model.Conta;
import br.com.glandata.model.Titular;

public class Main {

	public static void main(String[] args) {

		Titular titularA = new Titular();
		titularA.nome = "Camila";
		titularA.endereco = "Rua dos bobos, 0";
		titularA.telefone = "(11)96565-5656";

		Titular titularB = new Titular();
		titularB.nome = "Pedro";
		titularB.endereco = "Rua dos bobos, 2";
		titularB.telefone = "(11)97070-0707";
		
		Conta conta = new Conta();
		conta.agencia = 1234;
		conta.numero = 005;
		conta.saldo = 457.00;
		conta.titular = titularA;

		Conta conta2 = new Conta();
		conta2.agencia = 54321;
		conta2.numero = 123;
		conta2.saldo = 1000.00;
		conta2.titular = titularB;

		System.out.println("Titular da conta: " + conta.titular.nome);
		System.out.println("Saldo da conta: " + conta.saldo);

		System.out.println("\n");

		System.out.println("Titular da conta 2: " + conta2.titular.nome);
		System.out.println("Saldo da conta 2: " + conta2.saldo);

		System.out.println("\n");

		System.out.println("Saldo das duas contas: " + (conta.saldo + conta2.saldo));
	}

}
