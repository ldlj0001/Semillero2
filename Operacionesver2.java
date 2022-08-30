/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operacionesver2;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author pc
 */
public class Operacionesver2 {
    

     public static void main(String[] args) 
    {
         //Declaramos las variables
        int num1=0;
        int opcion;
        int num2=0;
        int operacion;
        String numero1 = javax.swing.JOptionPane.showInputDialog(null,"Ingrese primer numero");
        num1 = Integer.parseInt(numero1);
        String numero2 = javax.swing.JOptionPane.showInputDialog(null,"Ingrese segundo numero");
        num2 = Integer.parseInt(numero2);
        
        do{
           String opc = javax.swing.JOptionPane.showInputDialog(null,"seleccione la operaciòn a realizar" +
                    "\n 1. Suma " +
                    "\n 2. resta " +
                    "\n 3. Multiplicacion " +
                    "\n 4. Division ");
           opcion = Integer.parseInt(opc);
           switch(opcion){
               case 1:
                   operacion = num1 + num2;
                   JOptionPane.showMessageDialog(null, "Suma es " + operacion );
                   break;
                   
                case 2:
                   operacion = num1 - num2;
                   JOptionPane.showMessageDialog(null, "Resta es " + operacion );
                   break;
                   
                case 3:
                   operacion = num1 * num2;
                   JOptionPane.showMessageDialog(null, "Multiplicacion es " + operacion );
                   break;
                   
                case 4:
                   operacion = num1 / num2;
                   JOptionPane.showMessageDialog(null, "Division es " + operacion );
                   break;
                case 5:
                    break;
                default: JOptionPane.showMessageDialog(null,"Favor ingresar opcion de menu");
            }
            
        }while(opcion!=5);
         
        }
    
}

