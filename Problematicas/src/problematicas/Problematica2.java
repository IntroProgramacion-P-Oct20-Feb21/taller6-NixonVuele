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
public class Problematica2 {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal="";
        int  contador = 1;
        int  denominador = 19;
        while (contador <= 6) {            
            if ((contador % 2) == 0){
                denominador = denominador + 10;
                cadenaFinal = (cadenaFinal + contador + "/" +denominador +"  ");
            }else{
                denominador = denominador - 9;
                cadenaFinal = (cadenaFinal + contador + "/" +denominador +"  ");
            }
        contador= contador + 1;
        }
        System.out.printf(cadenaFinal+"\n");
    }
}