import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class TestPracticaLoops
{

    /**
     *  Punto de entrada a la aplicación
     *  - define y crea el teclado  
     *  - define e instancia un objeto PracticaLoops
     *  - pide al usuario la cantidad máxima de aleatorios a generar
     *    (valida que sea  un nº positivo)
     *  - muestra los números aleatorios y sus valores con ceros intercalados
     *  - haz una pausa y borra la pantalla    
     *  
     *  - pide al usuario un valor para el grosor de la letra 
     *          Valida que este valor es correcto, es decir,
     *          está en el intervalo 0 < grosor <= 5
     *  - pide al usuario un valor para ela altura de la letra 
     *          Valida que este valor es correcto, es decir,
     *          está en el intervalo (grosor < altura  <= 20)  y además (altura - grosor) es  par      
     *  - muestra la letra  
     *  
     */
    public static void main(String[] args)    {
        Scanner teclado = new Scanner(System.in);
        PracticaLoops obj1 = new PracticaLoops();
        
        System.out.println("Introduzca un número positivo");
        int numeros = teclado.nextInt();
        while(numeros < 0){
            System.err.println("Error, introduzca un número positivo");
        }
        int tmp = obj1.obtenerAleatorio(numeros);
        obj1.intercalarCeros(tmp);
        
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        
        System.out.println("Teclea grosor de la letra (1 <= grosor <= 5): ");
        int grosor = teclado.nextInt();
        while(grosor > 5 || grosor < 1){
            System.err.println("Grosor incorrecto");
            grosor = teclado.nextInt();
        }
        
        System.out.println
        ("Teclea altura de la letra (grosor < altura <= 20) y (altura - grosor es par): ");
        int altura = teclado.nextInt();
        while((altura < grosor || altura > 20) || (altura - grosor) % 2 != 0){
            System.err.println("Altura incorrecta");
            altura = teclado.nextInt();
        }
        
        obj1.dibujarLetra(grosor,altura);
    }
}

