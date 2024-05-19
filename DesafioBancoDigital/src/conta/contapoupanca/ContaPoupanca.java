package conta.contapoupanca;

import conta.Conta;

public class ContaPoupanca extends Conta {
    private String tipoConta = "Conta Poupança";

    public ContaPoupanca(int agencia, double saldoInicial) {
        super(agencia, saldoInicial);
    }

    @Override
    public String getTipoConta() {
        return tipoConta;
    }
}
