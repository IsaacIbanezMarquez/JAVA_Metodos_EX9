


import java.util.*;

public class Solution
{

    // 9.- En este ejercicio se debe mostrar el mensaje «Ha ingresado un numero de un dígito»,
    // si el numero ingresado esta en el rango del 1 al 9, si ingresa un numero de 2 dígitos mostrar el mensaje;
    // «Ha ingresado un numero de dos dígitos», de la misma manera si es de 3 dígitos.


    public static class Ejercicio9 {
        Scanner dato = new Scanner(System.in);
        void cifras(){
            int numero;
            System.out.println("Ingrese un numero");
            numero = dato.nextInt();
            if(numero>=1 && numero<10){
                System.out.println("Ha ingresado un numero de un digito ");
            }else if(numero>=10 && numero<100){
                System.out.println("Ha ingresado un numero de dos digito ");
            }else{
                System.out.println("Ha ingresado un numero de tres digito ");
            }
        }
        public static void main(String[] args){
            Ejercicio9 cif = new Ejercicio9();  cif.cifras();
        }
    }

}
