/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * PRATICA
 */
public class Exponential_Example {
    
    public static void inverterArray(ArrayList lista, int i, int j){
        int aux;
        if (i<=j){
            //System.out.println((int)lista.get(j));
            //System.out.println((int)lista.get(i));
            aux = (int)lista.get(i);
            //lista.set(i, potencia((int)lista.get(j),i));
            //lista.set(j, potencia(aux,j));
            inverterArray(lista,i+1,j-1);
        }
    }
    public static int potencia(int numero, int expoente){
        if (expoente==0)return 1;
        else return numero*potencia(numero, expoente-1);
    }   
    
    public static void main (String[] args){
        ArrayList<Integer> lista = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        int item, tamanho;
        System.out.println("Informe o tamanho do vetor");
        tamanho = entrada.nextInt();
        for(int i=0; i<tamanho;i++){
            System.out.println("Informe o item posição "+i+" do vetor");
            item = entrada.nextInt();
            lista.add(item);
        }
        System.out.println(lista);
        inverterArray(lista,0,lista.size()-1);
        System.out.println(lista);
    }
    
}
