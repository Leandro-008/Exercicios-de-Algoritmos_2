//Algoritmo 360

import java.util.Scanner;

public class Vetor8{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int data, i, dia, mes;
        int[] ultDia = new int[12];
        String[] signo = new String[12];

        for(i = 0; i < 12; i++){
            System.out.println("Digite signo: ");
            signo[i] = entrada.nextLine();
            System.out.println("Digite ultimo dia: ");
            ultDia[i] = entrada.nextInt();
        }
        System.out.println("digite data no formato ddmm ou 9999 para terminar: ");
        data = entrada.nextInt();

        while(data != 9999){
            dia = data / 100;
            mes = data % 100;
            mes--;
            if(dia > ultDia[mes]){
                mes = (mes + 1) % 12 ;
            }

        System.out.print("Signo: " + signo[mes]);
        System.out.println("digite data no formato ddmm ou 9999 para terminar: ");
        data = entrada.nextInt();
        }

        entrada.close();
    } 
}  