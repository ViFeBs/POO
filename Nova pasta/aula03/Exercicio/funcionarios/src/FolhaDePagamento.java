public class FolhaDePagamento {

    private double salarioTotal = 0;

    public void registrar(Engenheiro func){
        salarioTotal += func.calcularSalario();
    }

    public void registrar(Gerente func){
        salarioTotal += func.calcularSalario();
    }

    public void registrar(Presidente func){
        salarioTotal += func.calcularSalario();
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
}
