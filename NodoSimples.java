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
public class NodoSimples {
    private String elemento; // Elemento a ser amarzenado no NodoDuplamente
    private NodoSimples proximo;
    
    public NodoSimples(String elemento, NodoSimples proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public NodoSimples getProximo() {
        return proximo;
    }

    public void setProximo(NodoSimples proximo) {
        this.proximo = proximo;
    }
    
}
