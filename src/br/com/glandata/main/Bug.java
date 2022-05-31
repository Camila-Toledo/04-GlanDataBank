package br.com.glandata.main;

import br.com.glandata.model.Conta;
import br.com.glandata.model.Titular;

public class Bug {

	public static void main(String[] args) {
		
		Titular titularA = new Titular();
		titularA.nome = "Camila";
		titularA.endereco = "Rua dos bobos, 0";
		titularA.telefone = "(11)96565-5656";

		Titular titularB = new Titular();
		titularB.nome = "Pedro";
		titularB.endereco = "Rua dos bobos, 2";
		titularB.telefone = "(11)97070-0707";
		
		/**
		 * Objetos não podem ser sobrescritos, eles apontam para uma mesma referência em memória
		 */

		Conta contaA = new Conta();
		contaA.titular = titularA;
		System.out.println("Titular Conta A: " + contaA.titular.nome);

		Conta contaB = new Conta();
		contaB = contaA;
		System.out.println("Titular Conta B: " + contaB.titular.nome);

		System.out.println("\n");

		contaB.titular = titularB;
		System.out.println("Titular Conta B: " + contaB.titular.nome);
		System.out.println("Titular Conta A: " + contaA.titular.nome);

	}
}
