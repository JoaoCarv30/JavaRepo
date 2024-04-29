

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do titular da conta: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a Agência: ");
        int agencia = scanner.nextInt();


        System.out.println("Haverá depósito inicial (s/n)? ");
        char resposta = scanner.next().charAt(0);

        double saldo = 0;
        if (resposta == 's') {
            System.out.println("Digite o valor do depósito inicial: ");
            saldo = scanner.nextDouble();
        }

        System.out.println("Olá " + nome +  " ,obrigado por criar uma conta em nosso banco sua agência é : " + agencia +", conta : " + numero + " e saldo inicial de R$ " + saldo + " reais.");

        
    }
}
    