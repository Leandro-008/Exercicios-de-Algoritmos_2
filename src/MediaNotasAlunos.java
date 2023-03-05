//Algoritmo 348 

import java.util.Scanner;
public class MediaNotasAlunos {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];
        float []pr1 = new float [5];
        float []pr2 = new float [5];
        float []media = new float [5];

        for (int l=0; l<5; l++){
            System.out.print("Digite " + (l+1) + " nome: ");
            nomes[l]= entrada.nextLine();
            System.out.print("Digite a primeira nota: " + (l+1) + ":");
            pr1[l]= entrada.nextFloat();
            System.out.print("Digite a segunda nota: " + (l+1) + ":");
            pr2[l]= entrada.nextFloat();
            entrada.nextLine();
            media[l]=(pr1[l]+pr2[l])/2;
        }

        System.out.println("\n\n\t\t\tRELACAO FINAL \n");
        for(int l=0; l<5; l++){
            System.out.println("\nAluno" + (l+l) + "-" + nomes[l]);
            System.out.println("Nota 1: " + pr1[l]);
            System.out.println("Nota 2: " + pr2[l]);
            System.out.println("Média: " + media[l]);
        }

        entrada.close();
    }
}