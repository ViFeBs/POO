public class Engenheiro extends Funcionario{
    private String departamento;
    private int crea;
    
    public Engenheiro(int codigo, String nome) {
        super(codigo, nome);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCrea() {
        return crea;
    }

    public void setCrea(int crea) {
        this.crea = crea;
    }

    @Override
    public double calcularSalario() {
        return this.getSalario() * 1.5;
    }
    
}
