
import clase.Algoritmos;

public class Aplicacion {

    public static void main(String[] args) {

        boolean numeroPar = Algoritmos.esPar(2);
        boolean numeroPrimo = Algoritmos.esPrimo(19);
        String palabraReversa = Algoritmos.stringEnReversa("Joselito");
        Boolean polindromo = Algoritmos.esPalindromo("anilina");
        String fizzBuzz = Algoritmos.secuenciaFizzBuzz(15);


        System.out.println(numeroPar);
        System.out.println(numeroPrimo);
        System.out.println(palabraReversa);
        System.out.println(polindromo);
        System.out.println(fizzBuzz);

    }
}
