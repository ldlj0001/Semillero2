/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.productos;
import java.util.*;
/**
 *
 * @author pc
 */

public class Productos {

    static Scanner entrada = new Scanner (System.in);
    static String nombre;
    static double precio;
    static int opcion,stock,codigo;
    
    public static void main(String[] args) {
        Producto p;
        Vector productos = new Vector();
        do{
            System.out.print("\n 1. Compra"  +
                    "\n 2. venta" +
                    "\n 3." + "Buscar Producto" +
                    "o\n 4. Salir ____");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Favor Ingresar codigo: ");
                    codigo = entrada.nextInt();
                    System.out.print("Favor ingresar nombre: ");
                    nombre = entrada.next();
                    System.out.print("Favor ingresar precio: ");
                    precio = entrada.nextDouble();
                    System.out.print("Favor ingresar cantidad en stock: ");
                    stock = entrada.nextInt();
                    p= busqueda(codigo,productos);
                    if(p==null){
                        productos.addElement(new Producto(codigo,nombre,precio,stock));
                        System.out.print("Producto Agregado");
                    }
                    else
                        System.out.print("Ya existe este este producto");
                    break;
                case 2:
                    System.out.print("Por favor ingresar codigo: ");
                    codigo = entrada.nextInt();
                    p = busqueda(codigo,productos);
                    if(p!=null){
                        if(p.getStock() > 0){
                            p.setStock(p.getStock()-1);
                            System.out.print("Venta Realizada");
                            p.mostrarResultado();
                          
                        }
                        else
                            System.out.print("Sin stock");
                    }
                    else
                        System.out.print("Producto inexistente");
                    break;
                case 3:
                    System.out.print("Por favor ingresar codigo: ");
                    codigo = entrada.nextInt();
                    p = busqueda(codigo,productos);
                    if(p!=null){
                        p.mostrarResultado();
                    }
                    else
                        System.out.print("Producto inexistente");
                    break;
                case 4:
                    break;
                default: System.out.print("Favor ingresar opcion de menu");
            }
        }while(opcion!=4);
    }
    static Producto busqueda(int codigo,Vector productos){
        boolean band = false;
        Producto p,retornP = null;
        for(int x = 0; x < productos.size(); x++){
        p = (Producto) productos.elementAt(x);
        if(p.getCodigo() == codigo)
            retornP = p;
        }
        return retornP;
    }
}

// clase producto

class Producto{
    int c,s;
    double p;
    String n;
    Producto(int codigo,String nombre,double precio,int stock){
        c = codigo;
        n = nombre;
        p = precio;
        s = stock;
    }
    public void setStock(int stock){
        s = stock;
    }
    public int getCodigo(){
        return c;
    }
    public int getStock(){
        return s;
    }
    public void mostrarResultado(){
       System.out.println("\nNombre = "+ n +"\t Precio = "+ p + "t Stock = "+ s);
    }
    public void mostrarResultadografico(){
        javax.swing.JOptionPane.showMessageDialog(null,"\nNombre = "+ n +"\t Precio = "+ p + "t Stock = "+ s);
    }
    
}