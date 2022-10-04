package org.example.Poo.Aula01.Pratica01;

public class Caneta01 {
    String modelo;
    String cor;
    int carga;
    boolean tampada;

    public Caneta01() {
    }

    public Caneta01(String modelo, String cor, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.carga = carga;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Carga: "+this.carga);
        System.out.println("Tampada: "+this.tampada);
    }

    public void tampar(){
        this.tampada = true;
        System.out.println("Nao pode escrever: ");
    }
    public void destampada(){
        this.tampada = false;
        System.out.println("Pode escrever: ");
    }

    public void rabiscar(){
        if (this.tampada = false){
            System.out.println("Pode rabiscar");
        } else {
            System.out.println("Nao pode, esta tampada");
        }

    }

}
