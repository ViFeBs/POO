package model;

public class Smartphone extends Produto{
    private String marca;
    private String modelo;
    
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void showProduto(){
        super.showProduto();
        System.out.println(this.getMarca());
        System.out.println(this.getModelo());
    }
}
