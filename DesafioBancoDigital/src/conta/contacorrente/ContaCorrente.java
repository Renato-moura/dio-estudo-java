package conta.contacorrente;

import conta.Conta;

public class ContaCorrente extends Conta {
    private String tipoConta = "Conta Corrente";

    public ContaCorrente(int agencia, double saldoInicial) {
        super(agencia, saldoInicial);
    }

    @Override
    public String getTipoConta() {
        return tipoConta;
    }
}
