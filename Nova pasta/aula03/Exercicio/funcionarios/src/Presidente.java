public final class Presidente extends Funcionario implements Autenticavel{
    private double valorDaContaDeAcoes;

    public Presidente(int codigo, String nome) {
        super(codigo, nome);
        
    }

    public double getValorDaContaDeAcoes() {
        return valorDaContaDeAcoes;
    }

    public void setValorDaContaDeAcoes(double valorDaContaDeAcoes) {
        this.valorDaContaDeAcoes = valorDaContaDeAcoes;
    }

    @Override
    public double calcularSalario() {
        return this.getSalario() + valorDaContaDeAcoes;
    }

    @Override
    public void fazerLogin() {
        System.out.println("Logando...");
    } 
}
