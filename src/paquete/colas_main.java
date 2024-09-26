package paquete;

import java.util.Scanner;

/**
 *
 * @author martin cantillo
 */
public class colas_main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tamano, opc = 1, o;
        System.out.println("TALLER DE PILAS Y COLAS MARTIN CANTILLO");
        System.out.println("");
        System.out.println("INGRESE EL TAMAÑO DE LA COLA");
        tamano = entrada.nextInt();
        colas c = new colas(tamano);
        do {
            System.out.println("1.INGRESAR ELEMENTOS ");
            System.out.println("2.PREGUNTAR TICKETES");
            System.out.println("3.MOSTR DATOS ");
            System.out.println("4.SALIR");
            o = entrada.nextInt();
            switch (o) {
                case 1:
                    c.ingresar_Datos();
                    break;
                case 2:
                    c.preguntar();
                    break;
                case 3:
                    c.mostrar_datos();
                    break;
            }
        } while (o != 4);
    }
}
