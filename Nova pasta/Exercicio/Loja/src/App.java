import model.Livro;
import model.Produto;
import model.Smartphone;

public class App {
    public static void main(String[] args) throws Exception {
        var produto = new Produto();
        var livro = new Livro();
        var smartphone = new Smartphone();

        produto.setDescricao("Produto Legal");
        produto.setPreco(50);

        livro.setDescricao("Livro Legal");
        livro.setPreco(15);
        livro.setAutor("Autor Legal 😎😁");

        smartphone.setDescricao("Telefone Caro oh maa goood");
        smartphone.setPreco(999999999);
        smartphone.setMarca("Iphone 🤢");
        smartphone.setModelo("500 😎👌🐱‍👤");

        produto.showProduto();
        System.out.println("---------------------------------");
        livro.showProduto();
        System.out.println("---------------------------------");
        smartphone.showProduto();

    }
}
