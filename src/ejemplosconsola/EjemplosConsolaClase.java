/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;
import java.util.Arrays;

/**
 *
 * @author xp
 */
public class EjemplosConsolaClase {
    
    //Declaro un array de ints de instancia
//    int[] listaNumeros ={-20, 50};
//    int[] listaNumeros2 ={-3, -3, -9, -3, 0, -209, -10, 0};
//    int[] listaNumeros3 ={0, 2000, -4, 1581, 5, 999, 777, 9};
      
    /*
    El método máximo va a calcular el máximo y el segundo máximo de una lista de numeros
    */
    
    private int[] maximos (int[] lista){
        
        //declaramos un array de dos elementos para guardar el máximo y el segundo máximo
        int [] listaMaximos = {lista[0], lista[1]};
        
        for (int i=1; i< lista.length; i++){ 
                if (listaMaximos[0] <= lista[i]){
                    //Si llega aquí es que el numero que estoy
                    //Comparando es mayor o igual que el que tengo primero en la
                    //lista de máximos
    //                if (i!=0){ //desplazo solo a la derecha si no estoy justo en la primera posición
                        listaMaximos[1] = listaMaximos[0];
    //                } //desplazo a la derecha el que habia como maximo
                    listaMaximos[0] = lista[i];   //pongo en la primera posicion al nuevo maximo
                }
                else if (listaMaximos[1] <= lista[i]){ //compruebo si el numero que estoy leyendo es mayor que el SEGUNDO de la lista de máximos
                    listaMaximos[1] = lista[i];   //pongo en la SEGUNDA posición al nuevo SEGUNDO maximo
                }
                
        }
        
        
        
        return listaMaximos;
        //devuelve el valor de los 2 maximos  
    }
    private boolean esPalindromo (String cadena){
        //Primera fase: Creo un nuevo String que sea una copia del
        //que me pasan pero quitandole los espacios en blanco
        String auxiliar ="";
        for (int i=0; i< cadena.length(); i++){
            if (cadena.charAt(i) != ' '){
                auxiliar = auxiliar + cadena.charAt(i);
            }
            
        }  
        //ahora en auxiliar tengo el string pero sin espacios en blanco
        //declaro dos indices para que digan que posiciones estoy comparando
        int indiceIzq = 0;
        int indiceDer = auxiliar.length() -1;
        
        //mientras sean iguales los caracteres en esas posiciones la palabra será un palíndromo
        //en el momento en el que una de esas comparaciones falle es que no es palíndromo
        
        //además si el indice izquierdo es mayor que el derecho, ya he chequeado toda la frase
        while (auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && indiceIzq <= indiceDer){
            indiceIzq++;
            indiceDer--;
        }
        boolean resultado = true;
        if (indiceIzq < indiceDer){  //Si esto se cumple es que la palabra no es un palindromo
            resultado = false;
            System.out.println("NO ES UN PALINDROMO");
        }
        else{
            System.out.println("SI ES UN PALINDROMO");
        }
        return resultado; 
    }
    private boolean esAnagrama (String palabraA, String palabraB){
        palabraA = palabraA.toUpperCase();
        palabraB = palabraB.toUpperCase();
        
        boolean anagrama = false; //Indica si las palabras son anagramas o no
        
        if (palabraA.length() == palabraB.length()){ //sólo empiezo a chequear si las 
                                                     //dos palabras tienen la misma longitud
          for(int i=0; i<palabraA.length(); i++){
              for (int j=0; j<palabraA.length(); j++){
                  
              }
          }  
        }
        
        return anagrama;
    }
    private void imprimeMes(int numx){
        //filtra el numero para que siempre valga entre 0 y 7
        numx = numx % 7;
        if (numx >7){
            numx = 7;
        }
        int contador = 0;
        //pintara tantas xx como numX sea
    
        for (int j=1; j<numx; j++){
            System.out.print("XX ");
            contador = contador + 1;
        }
        for (int i=1; i<=31; i++){
            if (contador <=7){
                if (i<=9){
                    System.out.print("0" + i);
                    System.out.print(" ");
                }
            }
            if (i>9){
                System.out.print(i);
                System.out.print(" ");
            }
            contador = contador + 1;
        
            if(contador==7){
                System.out.println("");
                contador = 0;
            }
        }
        for(int x=contador; x<7; x++){
            System.out.print("XX ");
        }
        
    } 
    private void palindromoV2 (String cadena){
        String auxiliar = "";
        for (int i=0; i<cadena.length(); i++){
            if (cadena.charAt(i) != ' '){
                auxiliar = auxiliar + cadena.charAt(i);
            }
        
        }
        /*
        Aquí ya tengo en el string auxiliar todas las letras de la palabra
        original pero sin los espacios en blanco
        */
        int indiceIzq = 0;
        int indiceDer = auxiliar.length() - 1;
        
        while (auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) 
                && indiceIzq <= indiceDer){
            indiceIzq++;
            indiceDer--;
        }
        if (indiceIzq < indiceDer){
            System.out.println("la cadena " + cadena + " no es un palindromo");
                
        }
        else{
            System.out.println("la cadena " + cadena + " si es un palindromo");
        }
    }
    
    private boolean isograma (String palabra){
        for (int i=0; i <palabra.length()-1; i++){
            for (int j= i+1; j<palabra.length(); j++){
                if (palabra.charAt(j) == palabra.charAt(i)){
                    return false;
                }
            }
        }
        //si ha recorrido los dos bucles for enteros, es que
        //la palabra no tiene letras repetidas
        return true;
    }
//        String aux = "";
//        boolean esIsograma = false;
//        for (int i=0; i<palabra.length()-1; i++){
//            for(int j=0; j<palabra.length(); j++){
//                aux = aux + palabra.charAt(i);
//                if (aux.equals (palabra.charAt(j))){
//                    esIsograma = true;
//                }
//                else{
//                    esIsograma = false;
//                }
//            }  
//            
//        }
//        
//        return esIsograma;      
//    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsolaClase ejercicios = new EjemplosConsolaClase();
        
//        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
//        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros2)));
//        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros3)));
//        System.out.println(ejercicios.esPalindromo("ACASO HUBO BUHOS ACA"));
//        ejercicios.palindromoV2("ACASO HUBO BUHOS ACA");
//           System.out.println(ejercicios.isograma("pipo"));
        for (int i = 0; i<7; i++){     
            ejercicios.imprimeMes(i);
            System.out.println();
            System.out.println();
        }    
    }
    
    
}
