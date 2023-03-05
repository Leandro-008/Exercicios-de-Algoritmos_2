//Algoritmo 356

import java.util.Scanner;

public class Vetor4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int l, c, t ;
        int media[] = new int[15];
        String nomes[] = new String[15];
        String sit[] = new String[15];
        float pr1[] = new float[15];
        float pr2[] = new float[15];

        for(l = 0 ; l <= 14 ; l++){
            System.out.println("Digite " + (l+1) + " nome: " );
            nomes[l] = entrada.nextLine();
            while( nomes[l].length() > 30 ){
                System.out.println("Nomes com ate 30 caracteres");
                System.out.println("Digite " + (l+1) + " nome: ");
                nomes[l] = entrada.nextLine();
            }
        }

        t = 30 - nomes[l].length();
        for(c = 1 ; c <= t ; c++){
            nomes[l] = nomes[l].concat(" ");                          
        }

        System.out.println("Digite 1 nota: ");
        pr1[l] = entrada.nextFloat();
        System.out.println("Digite 2 nota: ");
        pr2[l] = entrada.nextFloat();
        media[l] = (int) ((pr1[l] + pr2[l]) / 2 + 0.0001);
        if( media[l] >= 5){
            sit[l] = "AP" ;
        }
        else{
            sit[l] = "RP" ;
        }

        System.out.println("RELAÇÃO FINAL");
        for(l = 0 ; l <= 14 ; l++){
            System.out.println("\n" + (l+1) + "- " + nomes[l] + "\t" + pr1[l] + "\t" + pr2[l] + "\t" + media[l] + "\t" + sit[l]);
        }

        entrada.close();
    }

}