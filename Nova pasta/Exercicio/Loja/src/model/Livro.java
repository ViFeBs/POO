package model;

public class Livro extends Produto {

    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public void showProduto(){
        super.showProduto();
        System.out.println(this.getAutor());
        
    }
}