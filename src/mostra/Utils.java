/*
 * Classe Utils per fer operacions amb strings o Enteros.
 */
package mostra;

/**
 *
 * @author mjimenez
 */
public class Utils {
    
    private Utils() {
    }

    /**
     * Calcula la suma de dos números enters.
     * @param a
     * @param b
     * @return int
     */    
    public static int calculSuma(int a, int b){
        return a + b;
    }
    
    /**
     * Calcula el factorial d'un número enter.
     * @param number
     * @return String
     * @throws IllegalArgumentException
     */
    public static int calculFactorial(int number)
            throws IllegalArgumentException {
        if (number < 1) {
            throw new IllegalArgumentException("cero o paràmetre negatiu (" + number + ')');
        }

        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
    
    /**
     * Validem que el valor màxim no supera 5.
     * @param maxim
     * @return boolean
     */
    public static boolean validarMaxim(int maxim){
     boolean max = true;
     if (maxim > 5){
         max = false;
     }
     return max;
    }
}
