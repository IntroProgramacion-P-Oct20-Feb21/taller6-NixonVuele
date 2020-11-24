package problematicas;
import java.util.Locale;
import java.util.Scanner;
public class Problematica1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String empresa;
        String cadenaFinal = "";
        String nombreCliente;
        int numMensualidades;
        int contador = 1;
        double valor;
        double iva;
        double totalCancelar;
        System.out.println("Ingrese el nombre del cliente");
        nombreCliente = entrada.nextLine();
        System.out.println("Cuantas mensualidades va a cancelar");
        numMensualidades = entrada.nextInt();
        while(contador <= numMensualidades){
            if (contador>1)
                System.out.print("Presione enter para pasar al siguiente pago");
            entrada.nextLine();
            System.out.printf("-----------------------------------------------"
                + "\nSeleccione la empresa a la que va a cancelar\n"
                + "Netflix\n"
                + "Disney Plus \n"
                + "Apple TV \n"
                + "Amazon Prime \n\n>");
            empresa = entrada.nextLine();
            switch(empresa){
                case "Netflix":
                    valor=10;
                    iva = (valor*10)/100;
                    totalCancelar= valor + iva;
                    cadenaFinal= String.format("Usuario: %s\nEmpresa: %s \nPrecio "
                    +"base: $%.2f\nImpuesto: $%.2f\nTotal a cancelar: $%.2f\n",
                    nombreCliente,empresa,valor,iva,totalCancelar);
                break;
                case "Disney Plus":
                    valor=6;
                    iva = (valor*12)/100;
                    totalCancelar= valor + iva;
                    cadenaFinal= String.format("Usuario: %s\nEmpresa: %s \nPrecio "
                    +"base: $%.2f\nImpuesto: $%.2f\nTotal a cancelar: $%.2f\n",
                    nombreCliente,empresa,valor,iva,totalCancelar);
                break;
                case "Apple TV":
                    valor=5;
                    iva = (valor*14)/100;
                    totalCancelar= valor + iva;
                    cadenaFinal= String.format("Usuario: %s\nEmpresa: %s \nPrecio "
                    +"base: $%.2f\nImpuesto: $%.2f\nTotal a cancelar: $%.2f\n",
                    nombreCliente,empresa,valor,iva,totalCancelar);
                break;
                case "Amazon Prime":
                    valor=4.50;
                    iva = (valor*16)/100;
                    totalCancelar= valor + iva;
                    cadenaFinal= String.format("Usuario: %s\nEmpresa: %s \nPrecio "
                    +"base: $%.2f\nImpuesto: $%.2f\nTotal a cancelar: $%.2f\n",
                    nombreCliente,empresa,valor,iva,totalCancelar);
                break;
            }
        contador=contador + 1;
        System.out.printf("Su recibo es :\n%s\n", cadenaFinal);
        }
    }
}