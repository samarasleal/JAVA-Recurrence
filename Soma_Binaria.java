/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author samara
 */
public class Soma_Binaria {
    
    public static int somaBinaria(ArrayList lista, int i, int n){
        if (n==1) return (int)lista.get(i);
        else return somaBinaria(lista, i, n/2) + somaBinaria(lista, i+n/2,n/2);        
    }
    
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList();
        lista.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        int retorno = somaBinaria(lista, 0,lista.size());
        System.out.println(retorno);
    }
}
