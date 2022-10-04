package org.example.Poo.Aula01.Exercicio01;

public class Caneta {

    String modelo;
    String cor;
    double ponta;
    int Carga;
    boolean Tampada;

    public Caneta() {
    }

    public Caneta(String modelo, String cor, double real, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = real;
        Carga = carga;
        Tampada = tampada;
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

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return Carga;
    }

    public void setCarga(int carga) {
        Carga = carga;
    }

    public boolean isTampada() {
        return Tampada;
    }

    public void setTampada(boolean tampada) {
        Tampada = tampada;
    }

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.Carga);
        System.out.println("Tampada: " + this.Tampada);


    }

    public void rabiscar() {

        if (this.Tampada = true) {
            System.out.println("Nao pode rasbicar");
        } else {
            System.out.println("Pode rabiscar");
        }

    }

    public void tampar() {
        this.Tampada = true;
        System.out.println("Esta tampada");

    }

    public void destampar() {
        this.Tampada = false;
        System.out.println("Está destampada");
    }


}

