import java.util.Random;
/**
 *    
 */
public class PracticaLoops {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaLoops()    {
        generador = new Random();
    }

    /**
     * Devuelve un valor aleatorio entre 0 y limite (exclusive)
     * 
     */
    public int obtenerAleatorio(int limite) {
        // TODO

        return 0;
    }

    /**
     * devuelve true si termina en 7, false en otro caso. Sin if
     */
    public boolean terminaEn7(int n) {         
        // TODO

        return true;
    }

    /**
     *  Devuelve un número n con las cifras no nulas en el mismo orden
     *  pero entre cada par de cifras no nulas consecutivas el número
     *  devuelto tiene un 0
     *  
     *  intercalarCeros(7) = 7
     *  intercalarCeros(17) = 107
     *  intercalarCeros(113) = 10103
     *  intercalarCeros(170) = 107
     *  intercalarCeros(1203) = 10203
     *  intercalarCeros(1000203) = 10203
     *  intercalarCeros(912000) = 90102
     *  intercalarCeros(91002000) = 90102
     */
    public int intercalarCeros(int n) {
        // TODO


        return 0;
    }

    /**
     *  El método  genera  números aleatorios  entre 0 y 100000 (exclusive)
     *  y calcula y escribe cada valor aleatorio junto con su versión con ceros intercalados
     *      
     *  El proceso termina cuando sale un aleatorio igual a 0 o un número que acaba en 7       
     *   
     *  Cada nº aleatorio se muestra en un espacio de 15 posiciones en la pantalla  
     *  y al lado ese mismo valor con los ceros intercalados en 25 posiciones
     *  
     *  Si ya el primer aleatorio termina en 7 se visualizará un mensaje que así lo indique
     *  
     *  Utiliza solo bucles while
     */
    public void generarNumeros()   {
        // TODO

        
        
        
    }
    
    /**
     *  Dibuja la letra indicada (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   grosor y altura asumimos correctos
     *  
     *      
     */
    public void dibujarLetra(int grosor, int altura)    {
        // TODO

        
        
    }

    /**
     *  escribe n veces el caracter  indicado en 2 posiciones
     *  en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
         // TODO
         
         
         
    }

}
