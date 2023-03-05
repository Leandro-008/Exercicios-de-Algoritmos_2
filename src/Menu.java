//Algoritmo 346 

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        int op, tam;
        do {
            System.out.println("MENU");
            System.out.println("1 - Imprima o comprimento da frase");
            System.out.println("2 - Imprima os dois primeiros e os dois últimos caracteres");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.println("OPCAO");
            op = entrada.nextInt();
            entrada.nextLine(); 

            if (op == 1) {
                System.out.println("Digite uma frase: ");
                frase = entrada.nextLine();
                System.out.println("Numero de caracteres da frase: " + frase.length());
            } else if (op == 2) {
                System.out.println("Digite uma frase: ");
                frase = entrada.nextLine();
                System.out.println("Dois primeiros caracteres: " + frase.substring(0, 2));
                tam = frase.length() - 2;
                System.out.println("Dois ultimos caracteres: " + frase.substring(tam));
            } else if (op == 3) {
                System.out.println("Digite uma frase: ");
                frase = entrada.nextLine();
                for (int x = frase.length() - 1; x >= 0; x--) {
                    System.out.print(frase.charAt(x));
                }
                System.out.println();
            } else if (op == 4) {
                System.out.println("Fim do algoritmo");
            } else {
                System.out.println("Opcao nao disponivel");
            }

        } while (op != 4);

        entrada.close();
    }
}