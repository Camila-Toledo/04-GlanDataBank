package br.com.glandata.main;

import br.com.glandata.model.Conta;
import br.com.glandata.model.Titular;

public class AtribuicaoValoresObjetos {

	public static void main(String[] args) {

		// ###### Cadastro dos titulares
		Titular titularA = new Titular();
		titularA.nome = "Camila";
		titularA.endereco = "Rua dos bobos, 0";
		titularA.telefone = "(11)96565-5656";

		Titular titularB = new Titular();
		titularB.nome = "Pedro";
		titularB.endereco = "Rua dos bobos, 2";
		titularB.telefone = "(11)97070-0707";

		// ###### Cadastro das contas
		Conta contaA = new Conta();
		contaA.agencia = 123;
		contaA.numero = 456;
		contaA.saldo = 127.00;
		contaA.titular = titularA;

		Conta contaB = new Conta();
		contaB.agencia = contaA.agencia;
		contaB.numero = contaA.numero;
		contaB.saldo = contaA.saldo + 1000;
		contaB.titular = titularB;

		// Exibição
		System.out.println(contaA.agencia);
		System.out.println(contaA.numero);
		System.out.println(contaA.titular.nome);
		System.out.println(contaA.saldo);

		System.out.println("\n");

		contaB.titular.nome = "Pedro Pessoa";

		System.out.println(contaB.agencia);
		System.out.println(contaB.numero);
		System.out.println(contaB.titular.nome);
		System.out.println(contaB.saldo);
	}
}
