
package ejercicio19;

import java.util.Scanner;

public class Ejc19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean[][] avion = new boolean[25][4];
        
        System.out.println("Eliga su fila (1-25)");
        int fila = sc.nextInt()-1;
        
        System.out.println("Eliga su asiento (1-4)");
        int asiento = sc.nextInt()-1;
        
        avion[fila][asiento] = true;
        

        for (int i = 0; i < avion.length; i++) {
            for (int j = 0; j < avion[0].length; j++) {
                if(avion[i][j]==false){
                    System.out.print("[Dis ]");
                } else {
                    System.out.print("[Res ]");
                }
            }
            System.out.println("\n");
        }
    }
    
}
