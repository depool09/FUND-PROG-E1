/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_captura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_4_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   //SI VAMOS A USAR VARIABLES, SE TIENEN QUE "DECLARAR" ANTES DE USAR
   //DECLARAR--> CREAAR LA VARIABLE PARA SU USO EN EL PROGRAMA 
   //TIPO_DATO NOMBRE_IDENTIFICADOR
   //
   
   String nombre;//declaracion de la variable 
   System.out.println("Captura nombre");
    //ENTREDA DE DATOS DEL TECLADO (JAVA)
    Scanner capto = new Scanner(System.in);//otra variable--> capto de tipo scanner
    //capturar del tecaldo y ponerlo en la variable del nombre 
    //escribir en la variable (poner un  valor) Asignacion
  nombre = capto.nextLine();
  System.out.println("El valor capturado es");
   System.out.println(nombre);// uso de la variable --> lectura
    
    }
   
    
    
}
