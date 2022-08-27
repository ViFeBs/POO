package model;

public class Produto {
    private String descricao;
    private double preco;
    


    public String getDescricao() {
        return descricao;
    }
    public double getPreco() {
        return preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void showProduto(){
        System.out.println(this.getDescricao());
        System.out.println(this.getPreco());
    }
}
