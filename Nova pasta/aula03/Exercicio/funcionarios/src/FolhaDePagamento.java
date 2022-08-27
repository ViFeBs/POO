public class FolhaDePagamento {

    private double salarioTotal = 0;

    public void registrar(Funcionario func){
        salarioTotal += func.calcularSalario();
    } 
    
    public void logar(Autenticavel aut){
        aut.fazerLogin();
    }
    
    public double getSalarioTotal() {
        return salarioTotal;
    }
}
