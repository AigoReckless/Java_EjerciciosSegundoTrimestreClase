/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;
import java.sql.DriverManager;
import java.util.Arrays;

/**
 *
 * @author xp
 */
public class EjemplosConsolaClase {
    
    //Declaro un array de ints de instancia
    int[] listaNumeros ={200, 31, 27, 2, 5, 99};
    int[] listaNumeros2 ={-3, -3, -9, -3, 0, -209, -10, 0};
    int[] listaNumeros3 ={0, 2000, -4, 1581, 5, 999, 777, 9};
    
    /*
    El método máximo va a calcular el máximo y el segundo máximo de una lista de numeros
    */
    private int[] maximos (int[] lista){
        
        //declaramos un array de dos elementos para guardar el máximo y el segundo máximo
        int [] listaMaximos = {lista[0], lista[1]};
        
        for (int i=0; i< lista.length; i++){ 
                if (listaMaximos[0] <= lista[i]){
                    //Si llega aquí es que el numero que estoy
                    //Comparando es mayor o igual que el que tengo primero en la
                    //lista de máximos
                    if (i!=0){ //desplazo solo a la derecha si no estoy justo en la primera posición
                        listaMaximos[1] = listaMaximos[0];
                    } //desplazo a la derecha el que habia como maximo
                    listaMaximos[0] = lista[i];   //pongo en la primera posicion al nuevo maximo
                }
                else if (listaMaximos[1] <= lista[i]){ //compruebo si el numero que estoy leyendo es mayor que el SEGUNDO de la lista de máximos
                    listaMaximos[1] = lista[i];   //pongo en la SEGUNDA posición al nuevo SEGUNDO maximo
                }
                
        }
        
        

        return listaMaximos;
        //devuelve el valor de los 2 maximos  
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsolaClase ejercicios = new EjemplosConsolaClase();
        
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros2)));
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros3)));
    }
    
    
}
