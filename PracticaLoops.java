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
        int tmp = generador.nextInt(limite);
        return tmp;
    }

    /**
     * devuelve true si termina en 7, false en otro caso. Sin if
     */
    public boolean terminaEn7(int n) {         
        return n % 10 == 7;
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
        int aux = 0;
        int i = 0;
        while(n != 0){
            int cifra = n % 10;
            while(cifra == 0){
                n /= 10;
                cifra = n % 10;
            }
            aux = cifra * (int)Math.pow(10,i) + aux;
            n /= 10;
            i++;
        }
        int cifras = 0;
        int tmp = aux;
        while (tmp != 0)  {
            tmp = tmp / 10;
            cifras ++;
        }
        int aux2 = 0;
        for(int j = 0;j < cifras;j++){
            int tmp2 = aux % 10;
            int k = 2 * j;
            aux2 = tmp2 * (int)Math.pow(10,k) + aux2;
            aux = aux / 10;
        }
        return aux2;
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
        int tmp = obtenerAleatorio(100000);
        while(tmp != 0 && terminaEn7(tmp) == false){
            System.out.printf("El número es: %15d ,Con ceros intercalados: %25d \n"
            ,tmp,intercalarCeros(tmp));
            tmp = obtenerAleatorio(100000);
        }
        System.out.printf("El número es: %15d ,Con ceros intercalados: %25d \n"
        ,tmp,intercalarCeros(tmp));
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
        System.out.println("Letra - Grosor: " + grosor + " Altura: " + altura);
        int tmp = (altura - grosor) / 2;
        for(int i = 0;i < grosor; i++){
            for(int j = 0; j < altura; j++){
                escribirCaracter(CARACTER,1);
            }
            System.out.println();
        }

        for(int k = 0; k < (altura - grosor); k++){
            for (int m = 0; m < tmp; m++){
                escribirCaracter(ESPACIO,1);
            }
            for(int n = 0;n < grosor; n++){
                escribirCaracter(CARACTER,1);
            }
            for (int o = 0; o< tmp; o++){
                escribirCaracter(ESPACIO,1);
            }
            System.out.println();
        }
    }

    /**
     *  escribe n veces el caracter  indicado en 2 posiciones
     *  en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        for (int i = 0;i < n; i++){
            System.out.printf("%2c",caracter);
        }

    }
}
