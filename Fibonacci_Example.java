/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02_03;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author samara
 */
public class Fibonacci_Example {

    /**
     * RECURSIVIDADE
     */
    public static int fatorial(int n){
        if (n==0)return 1;
        else return n*fatorial(n-1);
    }
    public static int somatorio(ArrayList lista, int n){
        if (n==1) return (int)lista.get(0);
        else return somatorio(lista, n-1) + (int)lista.get(n-1);           
    }
    public static int somatorioBinario(ArrayList lista, int i, int n){
        if (n==1) return (int)lista.get(i);
        else return somatorioBinario(lista, i, n/2) + somatorioBinario(lista, i+n/2, n/2);           
    }
    
    public static int fibonacci(int k){
        if (k<=1) return 1;
        else return fibonacci(k-1) + fibonacci(k-2);
    }
            
    public static void main(String[] args) {
        // Fatorial
        int retorno = fatorial(3);
        //System.out.println(retorno);
        
        // Somatório 
        // Lembrar que a primeira posição é 0 e a última é n-1
        ArrayList<Integer> lista = new ArrayList();
        lista.addAll(Arrays.asList(0,1,2,3,4,5,6,7));
        
        //int retorno2 = somatorio(lista, lista.size());
        int retorno2 = somatorioBinario(lista, 0, lista.size());
        //System.out.println(retorno2);
        
        int retorno3 = fibonacci(5);
        System.out.println(retorno3);
    }
    
    
}
