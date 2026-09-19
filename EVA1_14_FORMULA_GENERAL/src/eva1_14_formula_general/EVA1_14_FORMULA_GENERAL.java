/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formula_general;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_14_FORMULA_GENERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
  Scanner captu = new Scanner(System.in);
  double A, B ,C;
  double x1, x2;
    System.out.println("valor A");
    A = captu.nextDouble();
    System.out.println("valor B");
    B = captu.nextDouble();
    System.out.println("valor C");
    C = captu.nextDouble();
    
    x1 = (-B  + Math.sqrt(Math.pow(B, 2)- (4 * A * C))) / (2 * A);
    x2 = (-B - Math.sqrt(Math.pow(B, 2)- (4 * A * C))) / (2 * A);
    
    System.out.println("X1 = " + x1);
    System.out.println("X2 = " + x2);
    
    
    
    
        
        
        
        
    }

}
