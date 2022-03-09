
package ejercicio03;

import java.util.Random;

public class Ejc03 {

    public static void main(String[] args) {
        Random rnd = new Random();
        
        double[] ejc = new double[20];
        
        for (int i = 0; i < 20; i++) {
            ejc[i] = 7.5;
        }
        
        double[] copia = new double[20];
        
        for (int i = 0; i < 20; i++) {
            copia[i] = ejc[i];
        }
        
        System.out.println("Array1");
        for (int i = 0; i < 20; i++) {
            System.out.println(ejc[i]);
        }
        
        System.out.println("------");
        System.out.println("Array2");
        for (int i = 0; i < 20; i++) {
            System.out.println(copia[i]);
        }
        
        ejc[rnd.nextInt(20)] = 6.3;
        
        System.out.println("Array1");
        for (int i = 0; i < 20; i++) {
            System.out.println(ejc[i]);
        }
        
        System.out.println("------");
        System.out.println("Array2");
        for (int i = 0; i < 20; i++) {
            System.out.println(copia[i]);
        }
        
    }
}
