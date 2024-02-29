package switchCaseJava;

import java.util.Scanner;

// o sistema consiste em armazenar cada pessoa que escolhe um tipo de combustivel e adiciona na
// variavel 

public class teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;
        int opc;

        do {
        	System.out.println("Escolha qual você vai querer");
            System.out.print("[1] - Álcool\n");
            System.out.print("[2] - Gasolina\n");
            System.out.print("[3] - Diesel\n");
            System.out.print("[4] - Fim\n");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO!!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opc != 4);

        System.out.println("Quantidade de clientes Álcool: " + alcool);
        System.out.println("Quantidade de clientes Gasolina: " + gasolina);
        System.out.println("Quantidade de clientes Diesel: " + diesel);
    }
}
