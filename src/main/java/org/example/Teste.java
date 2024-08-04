package org.example;

public class Teste {
    public static void main (String[] args){
        Conta c3= new Conta();
        c3.titular.nome= "Ricardo";
        c3.titular.sobrenome= "Soares";
        c3.titular.cpf = "111.111.111-11";
        c3.saldo= 2500;

        System.out.println(c3.titular);

        Conta c4= new Conta();
        c4.titular.nome= "Manoel";
        c4.titular.sobrenome= "Silva";
        c4.titular.cpf = "222.222.222-22";
        c4.saldo= 2500;

        Conta c5 = new Conta();
        c5.titular.nome = "João Paulo";
        c5.titular.sobrenome = "Medeiros";
        c5.titular.cpf = "555.555.555-55";

        Conta c6 = new Conta();
        c6.titular.nome = "Maria";
        c6.titular.sobrenome= "Santos";
        c6.titular.cpf= "666.666.666-66";
    }
}
