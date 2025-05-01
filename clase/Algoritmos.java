package clase;

import java.util.ArrayList;

public class Algoritmos {

    //Metodo Par
    public static boolean esPar(int numero) {
        return numero % 2 == 0; // True si es par
    }

    //Metodo Primo
    public static boolean esPrimo(int numero) {
        return numero % 2 == 1;
    }

    /*
     Metodo que sirve para dar vuelta una palabra
     */
    public static String stringEnReversa(String palabra) {
        //Creamos un array donde vamos a almacenar nuestras letras ["a","b","c"],
        ArrayList<String> palabraInversa = new ArrayList<>();

        //Creamos un bucle que lo que hara es recorrer nuestra palabra 
        for (int letraIndice = 1; letraIndice <= palabra.length(); letraIndice++) {

            //Le daremos cada letra a nuestra variable char (que solo puede almacenar 1)
            char letras = palabra.charAt(palabra.length() - letraIndice);
            //Y cada vez que almacene 1 se la daremos a nuestro array que ira agregando cada letra
            palabraInversa.add(String.valueOf(letras));
        }

        //Ahora convertimos nuestro Array a string usando Join y sacando los espacios que existen
        String palabraFinal = String.join("", palabraInversa);

        return palabraFinal;
    }

    /*
        Metodo para saber si las palabras son iguales cuando una esta volteada y la otra
        esta normal.
     */
    public static boolean esPalindromo(String palabra) {
        //Reutilizamos nuestro metodo creado anteriormente para reutilizarlo
        String palabraVoltada = Algoritmos.stringEnReversa(palabra);

        /*
            Aqui retornamos nuestra palabra ingresa por el usuario la cual le ponemos que ignore 
            el caso de mayusuclas y minusculas
        */
        return palabra.equalsIgnoreCase(palabraVoltada);
    }


    /* Metodo que sirve para el fizz buzz */
    public static String secuenciaFizzBuzz(int numeroEntero) {

        //Creamos una array donde vamos a almacenar nuestros datos 
        ArrayList<String> almacedanorDeFizzBuzz = new ArrayList<>();
        
        /*
            Hacemos un for para que recorrar y asi poder determinar que sucede
            segun el numero quen nos de el usuario
        */
        for (int i = 1; i <= numeroEntero; i++) {
            
            //Aqui decimos fizz si es divisible entre 3
            if (i % 3 == 0) {
                almacedanorDeFizzBuzz.add("Fizz");
            }
    
            //Aqui decimos Buzz si es divisible entre 5
            if (i % 5 == 0) {
                almacedanorDeFizzBuzz.add("Buzz");
    
            }
            
            //Aqui solo pasara el numero que no sea divisible entre 5 y 3 
            if(i % 5 != 0 && i % 3 != 0){

                /*
                 Como nuestra array es de string lo que hacemos es convertir 
                 nuestro numero a un string
                 */
                String numCadena = String.valueOf(i);
                almacedanorDeFizzBuzz.add(numCadena);
            }
        }

        //Aqui lo que hacemos es convertir nuestro array a string
        String palabraFinal = String.join(" ", almacedanorDeFizzBuzz);

        return palabraFinal;
    }

}
