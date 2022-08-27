import model.Conta;
import model.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        var contaCorrente = new Conta(1234);
        var contaPoupanca = new ContaPoupanca(1568);

        System.out.println(contaCorrente.getNumero());
        System.out.println(contaPoupanca.getNumero());
    }
}
