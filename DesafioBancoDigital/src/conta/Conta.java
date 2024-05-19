package conta;

import conta.contacorrente.ContaCorrente;

public abstract class Conta {
    private int agencia;
    private double saldo;

    public Conta(int agencia, double saldoInicial) {
        this.agencia = agencia;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Saldo atual: " + saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado: " + valor);
        System.out.println("Saldo atual: " + saldo);
    }

    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência realizada: " + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Saldo atual: " + saldo);
    }

    public abstract String getTipoConta();
}