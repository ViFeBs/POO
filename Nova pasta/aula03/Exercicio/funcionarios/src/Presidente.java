public final class Presidente extends Funcionario{
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
}
