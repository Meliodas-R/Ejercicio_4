package ejercicio_4;

import java.util.Scanner;

/**
 * 4. Recoger por teclado un número que introduzca el usuario y mostrar si es
 * divisible entre 2 (resto = 0). En caso de no ser divisible entre dos, mostrar
 * el siguiente mensaje "numero no es divisible entre 2".
 *
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        
        System.out.print("Introduzca un número: ");
        numero=teclado.nextInt();
        if(numero%2==0){
            System.out.println(numero + " es divisible entre 2.");
        }else{
            System.out.println(numero + " no es divisible entre 2.");
        }
    }

}
