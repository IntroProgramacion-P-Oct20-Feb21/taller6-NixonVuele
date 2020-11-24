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
public class Problematica5 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador = 1;
        String nombreEstudiante;
        double promedioCiclo;
        String cadenaFinal="";
        String notaFinal;
        while(contador <= 4){
            System.out.println("Ingrese su nombre");
            nombreEstudiante= entrada.nextLine();
            System.out.println("Ingrese su promedio del ciclo");
            promedioCiclo=entrada.nextDouble();
            if(promedioCiclo >= 7){
                notaFinal = "Aprobado";
                cadenaFinal = String.format("%s%s\t %.2f\t%s\n",
                        cadenaFinal,nombreEstudiante, promedioCiclo, notaFinal);
            }else{
                notaFinal ="Reprobado";
                cadenaFinal = String.format("%s%s\t%.2f\t%s\n",
                        cadenaFinal,nombreEstudiante, promedioCiclo, notaFinal);
            }
            contador=contador+1;
            entrada.nextLine();
        }
        System.out.printf(cadenaFinal);
    }
}
/*2. nombreEstudiante, x(200)[{1-9},{a-z},{A-Z}, {/}]
3. contador, i[0,n] <-- 1
4. promedioCiclo, d[0,n] 
5. cadenaFinal, x(200)[{1-9},{a-z},{A-Z}, {/}]
6. notaFinal, x(200)[{1-9},{a-z},{A-Z}, {/}] 
7. Mientras contador <= 4 entonces
8.	Escribir "Ingrese su nombre"
9.	Leer nombreEstudiante
10.	Escribir "Ingrese su promedio del ciclo"
11.	Leer promedioCiclo
12.  	Si promedioCiclo >= 7 Entonces
13.  		notaFinal <-- "Aprobado" 
14. 		cadenaFinal <-- nombreEstudiante + "\t" + promedioCiclo + "\t" + notaFinal + "\n"
15. 	De lo contrario 
16. 		notaFinal <-- "Reprobado"
17. 		cadenaFinal <-- nombreEstudiante + "\t" + promedioCiclo + "\t" + notaFinal + "\n"
18. 	Fin Si 
19. contador <-- contador + 1
20. Fin Mientras 
21.	Escribir cadenaFinal
22. Fin*/