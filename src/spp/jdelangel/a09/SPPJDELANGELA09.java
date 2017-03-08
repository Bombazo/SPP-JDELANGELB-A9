/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelangel.a09;
import java.util.Scanner;
/**
 *
 * @author Alberto
 */
public class SPPJDELANGELA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int tamaño =solicitartamaño();
         int [][] A =array("A", tamaño);
         int [][] B =array("B", tamaño);
       
        sumadematrices (A,B);
       
        
    }
    public static int solicitartamaño(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int A= 0;
        do{
            try{
                System.out.println("INGRESA EL TAMAÑO DE UN MATRIX");
                A = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("NO ES NUMERO ENTERO COMPA");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return A;
        
        
    }
    public static int solicitarentero(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int A= 0;
        do{
            try{
                System.out.println("ESCRIBE UN NUMERO ENTERO");
                A = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("LO SIENTO, INGRESASTE UN NÚMERO QUE NO ES ENTERO");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return A;
        
        
    }
    public static int [][] array (String A, int tamaño){
        int [][]arreglo = new int [tamaño][tamaño];
        System.out.println("MATRIX " + A);
        for (int i = 0; i < arreglo.length; i++){ 
        for (int j = 0; j < arreglo[i].length; j++){
        arreglo [i][j] = solicitarentero();
        }
        }
        return arreglo;
        
        
    }
    public static int [][] sumadematrices (int [][]A, int[][]B){
        int [][] r = new int [A.length] [A.length];
        System.out.println("Suma: ");
        for (int i = 0; i < A.length; i++){
        for (int j = 0; j < A[i].length; j++){
        r[i][j] = A[i][j] + B[i][j];
        System.out.println("["+r[i][j]+"]");   
    }
        System.out.println("");   
    }
        return r; 
    }
    
    
}
