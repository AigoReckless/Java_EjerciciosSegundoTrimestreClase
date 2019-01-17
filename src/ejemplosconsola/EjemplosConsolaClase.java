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
    int[] listaNumeros2 ={-11, 5, -34, 7, 209, 209, 10, 7};
    int[] listaNumeros3 ={0, 2000, -4, 1581, 5, 999, 777, 9};
    
    /*
    El método máximo va a calcular el máximo y el segundo máximo de una lista de numeros
    */
    private int[] maximos (int[] lista){
        
        //declaramos un array de dos elementos para guardar el máximo y el segundo máximo
        int [] listaMaximos = {lista[0], lista[1]};
        for (int i=0; i< lista.length; i++){ 
                if (listaMaximos[0] < lista[i] || listaMaximos[0] == listaMaximos[1] ){
                    listaMaximos[0] = lista[i];   
                }
                if (listaMaximos[1] <= lista[i]){
                    listaMaximos[1] = lista[i];
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
        
        //System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros2)));
        //System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros3)));
    }
    
    
}
