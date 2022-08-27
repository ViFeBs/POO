public class Gerente extends Auntenticado{
    private String area;
    private double bonus;


    public Gerente(int codigo, String nome) {
        super(codigo, nome);
        
    }


    public String getArea() {
        return area;
    }


    public void setArea(String area) {
        this.area = area;
    }


    public double getBonus() {
        return bonus;
    }


    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public double calcularSalario() {
        return this.getSalario() + bonus;
    }    
}
