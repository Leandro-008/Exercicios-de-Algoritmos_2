//Algoritmo 351 

import java.util.Scanner;

public class ProcuraNomePeloNumero{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int l, num ;
        String nomes[] = new String[5];
        
        for(l = 0 ; l <= 4 ; l++){
            System.out.println("nome " + (l+1) + ":");
            nomes[l] = entrada.nextLine();
        }

        System.out.println("Digite o numero da pessoa: ");
        num = entrada.nextInt();
        while(num < 1 || num > 5){
            System.out.println("Numero fora do intervalo");
            System.out.println("Digite o numero da pessoa: ");
            num = entrada.nextInt();
        }
        System.out.println(nomes[num - 1]);

        entrada.close();
    }
}