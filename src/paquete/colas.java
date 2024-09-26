package paquete;

import java.util.*;

/**
 *
 * @author martin cantillo
 */
public class colas {

    Scanner entrada = new Scanner(System.in);
    String cola[];
    int fr, fi, tamano, opc, ti;
    String nombre, mostrar[], nom, cola_aux[];

    public colas(int tamaño) {
        cola = new String[tamaño];
        fr = -1;
        fi = -1;
    }

    public void ingresar_Datos() {
        System.out.println("INGRESE NOMBRE");
        nombre = entrada.next();
        if (fi == cola.length - 1) {
            System.out.println("COLA LLENA");
        } else {
            fi++;
            cola[fi] = nombre;
            if (fr == -1) {
                fr = 0;
            }
        }
    }

    public void mostrar_datos() {
        System.out.println("DATOS DE LA COLA");
        for (int i = 0; i < cola.length; i++) {
            System.out.println("");
            System.out.println((i + 1) + "." + cola[i]);
        }
        System.out.println("");
    }

    public void preguntar() {
        System.out.println(" SR.(a) [" + cola[fr] + "] = ¿TIENE TICKETE? \n1.SI. \n2 NO ");
        opc = entrada.nextInt();
        if (opc == 1) {
            cola[fr] = "SR. " + cola[fr] + " CON  TICKET";
            fr++;
        } else {
            cola[fr] = " colado sr [" + cola[fr] + "] NO TIENE TICKETE ";
            System.out.println("RETIRADO SR.(a) [" + cola[fr] + "] ");
            fr++;
        }
    }
}
