package org.example.Poo.Aula01.Pratica01;

public class CanetaTest {
    public static void main(String[] args) {
        Caneta01 c1 = new Caneta01("Bic", "Azul", 80, true);
        c1.destampada();
        c1.rabiscar();
        c1.status();


        Caneta01 c2 = new Caneta01("Bic", "Azul", 80, true);
        c2.tampar();
        c2.rabiscar();
        c2.status();

    }
}