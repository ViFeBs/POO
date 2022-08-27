public class App {
    public static void main(String[] args) throws Exception {
       var func1 = new Engenheiro(2201, "João");
       var func2 = new Gerente(2202, "Maria");
       var func3 = new Presidente(2203, "Paula");
       var folha = new FolhaDePagamento();


       func1.setSalario(5000);
       System.out.println(func1.calcularSalario());
       folha.registrar(func1);

       func2.setSalario(6000);
       func2.setBonus(2000);
       System.out.println(func2.calcularSalario());
       folha.registrar(func2);

       func3.setSalario(12000);
       func3.setValorDaContaDeAcoes(3000);
       System.out.println(func3.calcularSalario());
       folha.registrar(func3);


       System.out.println(func1.getNome());
       System.out.println(func2.getNome());
       System.out.println(func3.getNome());

       System.out.println(folha.getSalarioTotal());

       folha.logar(func2);
       folha.logar(func3);
       folha.logar(new Auditor());
    }
}
