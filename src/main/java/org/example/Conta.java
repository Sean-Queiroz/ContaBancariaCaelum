package org.example;

public class Conta {
    int numero;

    Cliente titular;
    double saldo;

    void sacar(double quantidade){
        if (saldo>quantidade) {
            this.saldo -= quantidade;
            System.out.println("Transferência Realizada com Sucesso");
        }
        else {
        System.out.println("Transferência negada por falta de saldo");
        }
    }

    void depositar(double quantidade){
        this.saldo += quantidade;
    }

    void transferenciaBancaria (Conta destino, double quantidade){
        if (saldo>quantidade){
            this.saldo -= quantidade;
            destino.saldo += saldo;
            System.out.println("Transferência realizada com sucesso");
        }
        else {
            System.out.println("Trnsferência negada por falta de saldo");
        }

    }
}

