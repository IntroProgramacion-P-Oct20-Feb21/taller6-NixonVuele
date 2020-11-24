/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problematicas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Nixon
 */
public class Problematica3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);    
        String contador ="1" ;
        String nombre ;
        String cadenaFinal = "";
        int numeroDias;
        double costoDia;
        double pagoEmpleados;
        while (contador.equals("1")) {
            System.out.println ("Ingrese el nombre del empleado");  
            nombre=entrada.nextLine(); 
            System.out.println ("Ingrese el número de días trabajados");
            numeroDias=entrada.nextInt();  
            System.out.println ("Ingrese el costo del día trabajado");
            costoDia=entrada.nextDouble();  
            pagoEmpleados = numeroDias * costoDia;
            cadenaFinal = String.format("%s%s\t%d\t$%.2f\t\t$%.2f\n",
            cadenaFinal,nombre,numeroDias,costoDia,pagoEmpleados);
            System.out.println("Ingrese el numero 1 si hay otro empleado "
                +"o Ingrese cualquier numero o letra exepto el 1 para mostrar"
                    + " la tabla");
            entrada.nextLine();     
            contador = entrada.nextLine();
        }
       System.out.printf("%s\n", cadenaFinal);
    }  
}