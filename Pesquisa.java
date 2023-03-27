/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D1;

import java.util.Random;

/**
 *
 * @author samara
 */
public class Pesquisa {
    public static void Calcular(int max, int min, int []v, int t){
        if (t>=1){
            if(max<v[t-1]) max=v[t-1];
            if(min>v[t-1]) min=v[t-1];
            Calcular(max, min, v, t-1);
        }
        else 
            System.out.println("Maior número "+max+" Menor número "+min);        
    }
    
    public static void mm(int []vet, int max, int min, int aux){
        if(vet[aux] == vet[vet.length-1]){
            System.out.println("maior"+max);
        }
        else{
            if(vet[aux]>min && vet[aux]>max){
                max = vet[aux];
                System.out.println("maior "+max);}
            else if (vet[aux]<min){
                min = vet[aux];
                System.out.println("menor "+min);}
            else mm(vet, max, min, aux+1);
        }
    }
    public static int maxx(int p, int u, int []v){
        if (p == u)
            return v[u];
        else{
            int m, x, y;
            m = (p+u)/2;
            x = maxx(p,m,v);
            y = maxx(m+1,u,v);
            if (x>=y) return x;
            else return y;
        }           
    }
    public static void main (String[] args){
        int[] vetor = new int[7];
        Random random = new Random();
        for(int i=0;i<=vetor.length-1;i++){
            vetor[i] = random.nextInt(20)+1;
        }
        vetor[0]=0;
        vetor[vetor.length-1]=6;
        for(int i=0;i<=vetor.length-1;i++){
            //System.out.println(vetor[i]);
        }
        //Calcular(vetor[0], vetor[0], vetor, 10);
        //mm(vetor, vetor[0], vetor[0], 0);
        //int retorno = maxx(0,6,vetor);
        //System.out.println("retorno "+retorno);
        int x, y;
        x = 7;
        y = 15;
        boolean r = x < 7 || y == 15 && x < 7 || y == 15 && !(x < 7);
        System.out.println(r);
    }
}
