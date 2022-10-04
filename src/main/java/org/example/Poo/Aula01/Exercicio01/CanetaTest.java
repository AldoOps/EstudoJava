package org.example.Poo.Aula01.Exercicio01;

public class CanetaTest {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Azul", 0.7, 80, true);
        c1.tampar();
        c1.rabiscar();
        c1.status();

        Caneta c2 = new Caneta("Bic", "Azul", 0.7, 80, true);
        c2.destampar();
        c2.rabiscar();
        c2.status();


    }


}
