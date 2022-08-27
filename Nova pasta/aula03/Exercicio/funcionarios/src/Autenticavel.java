public abstract class Autenticavel extends Funcionario{
    
    public Autenticavel(int codigo, String nome) {
        super(codigo, nome);
        //TODO Auto-generated constructor stub
    }

    public void fazerLogin(){
        System.out.println("logando....");
    }

    @Override
    public abstract double calcularSalario();
}
