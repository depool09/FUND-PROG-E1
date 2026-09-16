/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_temperatura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_10_TEMPERATURA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
   
    double temp, far, kelvin; //variables 
    Scanner captu = new Scanner(System.in);
    //solicitar dartos al usuario
    System.out.println("introduce la temperatura en Centigrados");
    temp = captu.nextDouble();
    //hacer calculo
    far = (temp * 1.8) + 32; //grados
    kelvin = temp + 273.15;//kelvin
  // mostar resultados al usuario
  System.out.println(temp + "C = " + far + "F");
     System.out.println(temp + "C = " + kelvin + "K");
    
    
    }
}
