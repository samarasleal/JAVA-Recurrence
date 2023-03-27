/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06;

/**
 *
 * @author samara
 */
public class ListaSimples {
    private NodoSimples cabeca, cauda;
    private long tamanhoLista;
    
    public ListaSimples(){
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }
    
    public void inserirNoInicio(NodoSimples novo){
        novo.setProximo(cabeca); // Novo nodo aponta para o nodo cabeça antigo (definir ponteiro proximo primeiro)
        cabeca = novo;           // Cabeça aponta para o novo
        tamanhoLista++;          // Incrementa o tamanho da lista        
    }
    
    public void inserirNoFim(NodoSimples novo){
        novo.setProximo(null);  // Novo nodo aponta para null
        cauda.setProximo(novo); // Cauda antiga aponta para nodo novo
        cauda = novo;           // Cauda aponta para nodo novo
        tamanhoLista++;
    }
    
    public void remocaoNoInicio(){
        NodoSimples t;
        if (cabeca==null)
            System.out.println("Lista vazia");
        else{
            t = cabeca;                     // NodoSimples t a ser removido (NodoDuplamente cabeça)
            cabeca = cabeca.getProximo();   // Cabeça aponta para o proximo nodo ou null
            t.setProximo(null);             
            tamanhoLista--;
        }
    }
    
}
