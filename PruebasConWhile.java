
/**
 * Write a description of class PruebasConWhile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebasConWhile
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PruebasConWhile
     */
    public PruebasConWhile()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Metodo para saber los multiplos de 5 entre los valores comprendidos
     * desde 10 hasta 95.
     */
    public void multiplosDe5()
    {
        int index = 10;
        // Iniciamos el contador el 10 porque lo pide el enunciado.
        while (index <= 95){
            int resultado = 0;
            resultado = index / 5;
            System.out.println(resultado);
            index = index + 5;
        }
    }

    /**
     * Metodo para sumar los valores comprendidos entre 1 y 10
     */
    public void sumaEntre1y10()
    {
        int index = 1;
        int resultado = 0;
        // Iniciamos dos variables, una como contador, y otra para guardar
        //el resultado.
        while (index <= 10){
            resultado = resultado + index;
            index++;
        }
        System.out.println(resultado);
    }

    /**
     * Metodo para sumar los valores comprendidos entre 1 y 10
     */
    public void sumaEntreAyB(int a, int b)
    {
        int resultado = 0;
        // Iniciamos dos variables, una como contador, y otra para guardar
        //el resultado.
        while (a <= b){
            resultado = resultado + a;
            a++;
        }
        System.out.println(resultado);
    }

    /**
     * Metodo para comprobar si n es un numero primo
     */
    public boolean isPrime(int n)
    {
        int index = 2;
        boolean esPrimo = true;
        while (index < n && esPrimo){
            if(n%index == 0){
                esPrimo = false;
            }
            else{
                index++;
            }
        }
        return esPrimo;
    }
}
