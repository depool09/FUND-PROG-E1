/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_temperatura2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_11_TEMPERATURA2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
  double temp, kel, far;
   Scanner captu = new Scanner(System.in);
    System.out.println("introduce la temperatura en Fahrenheit");
    far = captu.nextDouble();
    temp = (far - 32) / 1.8;
    kel = (far - 32) * (5/9.0) + 273.15;  //nota 5/9 da 0 , 5/9.0 da 0.5
   
     System.out.println(far + "F =" + temp + "C");
     System.out.println(far + "F =" + kel + "K");
    }
}
