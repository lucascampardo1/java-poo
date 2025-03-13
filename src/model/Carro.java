package model;

public class Carro {

    private String modelo;
    private String placa;
    private String marca;
    private int anoFabricacao;
    private String cor;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void imprimir() {
        System.out.println("Dados do Carro");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Cor: " + cor);
        System.out.println("--------------------");
    }
    

}
