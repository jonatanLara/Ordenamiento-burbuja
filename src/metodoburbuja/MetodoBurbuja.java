/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodoburbuja;

import java.util.Scanner;

/**
 *
 * @author jonatanLara
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,aux;
        int []num;
        System.out.println("Cuantos numeros deseas introducir?");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        num = new int[n];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduice el elemento #"+ (i+1) + "");
            num[i]= leer.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-1; j++) {
                if (num[j]>num[j+1]) {
                    aux = num[j];
                    num [j] = num[j+1];
                    num[j+1]=aux;
                }
            }
            
        }
        System.out.println("el arreglo final es :");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
            
        }
        System.out.println(" ");
    }
    
}
