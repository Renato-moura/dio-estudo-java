package main;

import conta.contacorrente.ContaCorrente;
import conta.contapoupanca.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta corrente
        ContaCorrente contaCorrente = new ContaCorrente(123, 500.0);
        System.out.println("Tipo de conta: " + contaCorrente.getTipoConta());
        contaCorrente.depositar(200.0);
        contaCorrente.sacar(100.0);

        // Criando uma conta poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca(456, 1000.0);
        System.out.println("Tipo de conta: " + contaPoupanca.getTipoConta());
        contaPoupanca.depositar(300.0);
        contaPoupanca.sacar(150.0);

        // Transferência entre contas
        contaCorrente.transferir(contaPoupanca, 200.0);
    }
}
