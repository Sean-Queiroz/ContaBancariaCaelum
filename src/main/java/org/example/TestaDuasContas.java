package org.example;

public class TestaDuasContas {
    public static void main (String [] args){
        Conta c1= new Conta();
        c1.titular= "João Neto";
        c1.saldo= 1000;

        Conta c2 = new Conta();
        c2.titular = "Pedro Maia";
        c2.saldo = 3500;

        c1.transferenciaBancaria(c2, 1500);


    }
}
