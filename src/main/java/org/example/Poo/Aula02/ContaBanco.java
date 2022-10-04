package org.example.Poo.Aula02;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float Saldo;
    private boolean status;


    public void estadoAtual(){
        System.out.println("-------------------------");
        System.out.println("Conta:"+this.getNumConta());
        System.out.println("Tipo:"+this.getTipo());
        System.out.println("Dono:"+this.getDono());
        System.out.println("Saldo:"+this.getSaldo());
        System.out.println("Status:"+this.isStatus());

    }



    public ContaBanco() {
        this.Saldo = 0;
        this.status = false;
    }

    public ContaBanco(int numConta, String tipo, String dono, int saldo, boolean status) {

        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        Saldo = saldo;
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.status = true;
        if (t == "CC"){
            Saldo = 50;
        } else if (t == "CP") {
            Saldo = 150;
        }

    }
    public void fecharConta(){
        if (Saldo > 0){
            System.out.println("Conta tem dienheiro");
        } else if (Saldo < 0) {
            System.out.println("Conta em debito");

        } else{
            this.status = false;
        }

    }

    public  void depositar(float v){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depósito realizado na conta de: "+this.getDono());
        }else {
            System.out.println("impossil depositar em uma conta fechada! ");
        }

    }

    public void sacar(float v){
        if (this.isStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de "+ this.getDono());

            }else{
            System.out.println("Saldo insuficiente para sacar");
            }
        } else {
            System.out.println("Impossil sacar de uma conta fechada! ");
        }


    }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;

        }if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por "+this.getDono());
        } else{

            System.out.println("Impossil pagar conta fechada! ");
        }

    }


}
