import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome e pressione enter.");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu numero da conta e pressione enter.");
        String numeroConta = scanner.next();

        System.out.println("Por favor, digite seu numero da agencia e pressione enter.");
        String numeroAgencia = scanner.next();

        Double saldoConta = 100.0;

       System.out.println("Olá"+nomeCliente+
                          ", obrigado por criar uma conta em nosso banco, sua agência é"+numeroAgencia+
                          ", conta "+numeroConta+
                          " e seu saldo "+saldoConta+" já está disponível para saque");
        //
        
    }
}
