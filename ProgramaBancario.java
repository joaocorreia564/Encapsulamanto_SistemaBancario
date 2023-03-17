package fema.edu.br;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaBancario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        ContaBanco conta;

        System.out.println("Entre com o numero da conta: ");
        int numero = tc.nextInt();
        System.out.println("Entre com o nome do Titular da conta: ");
        tc.nextLine();
        String titular = tc.nextLine();
        System.out.println("Deseja fazer um deposito inicial (y/n)? ");
        char resposta = tc.next().charAt(0);
        if(resposta == 'y'){
            System.out.println("Entrada do valor inicial do Deposito: ");
            double depositoInicial = tc.nextDouble();
            conta = new ContaBanco(numero,titular,depositoInicial);
        }
        else{
            conta = new ContaBanco(numero,titular);
        }
        System.out.println();
        System.out.println("Dadoos da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entrada do valor de Saque : ");
        double valorSaque = tc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Saldo Atualizado: ");
        System.out.println(conta);






        tc.close();
    }
}
