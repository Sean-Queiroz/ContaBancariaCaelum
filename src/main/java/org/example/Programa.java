package org.example;


public class Programa {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.titular = "Duker";
        minhaConta.saldo = 1000;

        System.out.println("Saldo Atual: " + minhaConta.saldo);

        System.out.println("////////");

        System.out.printf("Titular da Conta: %S, Saldo da Conta: %.2f  ", minhaConta.titular, minhaConta.saldo);

        System.out.println("///////");

        System.out.println();

        minhaConta.sacar(200);

        System.out.println("/////");

        System.out.println("Saldo Atual: " + minhaConta.saldo);

        System.out.println("//////");

        minhaConta.sacar(3000);
        System.out.println("/////");

        System.out.println("Saldo Atual: " + minhaConta.saldo);

        minhaConta.depositar(2200);

        System.out.println("Saldo Atual: " +minhaConta.saldo);


    }
}