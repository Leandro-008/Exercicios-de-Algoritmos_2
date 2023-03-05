//Algoritmo 358 

import java.util.Scanner;

public class Vetor6{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float precompra[] = new float[3];
        float precovenda[] = new float[3];
        float lucro;
        int totlucromenor10,totlucromenor20,totlucromaior20, A; 
        totlucromenor10 = 0;
        totlucromenor20 = 0;
        totlucromaior20 = 0;
        
        for(A = 0; A < 3; A++ ){
            System.out.println("Preço de compra: ");
            precompra[A] = entrada.nextFloat();
            System.out.println("Preço da venda: ");
            precovenda[A] = entrada.nextFloat();
        }
        for(A = 0; A < 3; A++ ){
            lucro = precovenda[A] - precompra[A] ;
            if(lucro < 10.0){
                totlucromenor10 ++ ;
            }
            else{
                if(lucro <= 20.0){
                    totlucromenor20++;
                }
                else{
                    totlucromaior20++;
                }
            }
        }
        
        System.out.println("total de mercadorias com lucro < 10%: " + totlucromenor10);
        System.out.println("total de mercadorias com 10% <= lucro <= 20%: " + totlucromenor20);
        System.out.println("total de mercadorias com lucro > 20%: " + totlucromaior20);

        entrada.close();  
    }
}