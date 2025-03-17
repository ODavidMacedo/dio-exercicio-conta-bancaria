package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Por favor, digite o número da agência: ");
        int numAgencia = sc.nextInt();
        System.out.print("Por favor, digite a agência: ");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +  agencia + ", conta " +  numAgencia + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();  


    }

}
