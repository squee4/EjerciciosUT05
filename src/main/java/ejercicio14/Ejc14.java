
package ejercicio14;

import java.util.Random;

public class Ejc14 {

    public static void main(String[] args) {
        Random rnd = new Random();
                //nextInt(max-min+1)+min
        
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rnd.nextInt(100)+1;
            }
        }
        
        double media=0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                media = media+matriz[i][j];
            }
        }
        
        media = media/(matriz.length*matriz[0].length);
        System.out.println("La media de matriz es "+media);
        
        int min = matriz[0][0];
        int max = matriz[0][0];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]<min){
                    min=matriz[i][j];
                }
                if(matriz[i][j]>max){
                    max=matriz[i][j];
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("\n");
        }
        
        System.out.println("Mínimo "+min);
        System.out.println("Máximo "+max);
    }
    
}
