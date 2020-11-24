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
public class Problematica4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);    
        int contador = 1;
        String nombreJugador;
        String cadenaFinal = "";
        int cantidadPuntos;
        int cantidadFaltas;
        while (contador <= 10) {            
            System.out.println("Ingrese el nombre del jugador: ");
            nombreJugador = entrada.nextLine();   
            System.out.println("Ingrese de Cantidad de los puntos que anoto en la "
                + "temporada");
            cantidadPuntos = entrada.nextInt();  
            System.out.println("Ingrese las faltas cometidas de la temporada");
            cantidadFaltas = entrada.nextInt();
            cadenaFinal = String.format("%s%s\t%d\t%d\n",
            cadenaFinal,nombreJugador,cantidadPuntos,cantidadFaltas);
            contador = contador + 1;
            entrada.nextLine();
        }
       System.out.printf("%s\n", cadenaFinal);
    }
    
}