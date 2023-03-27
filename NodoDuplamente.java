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
public class NodoDuplamente {
    private String elemento; // Elemento a ser amarzenado no NodoDuplamente
    private NodoDuplamente proximo;
    private NodoDuplamente anterior;
    
    public NodoDuplamente(String elemento, NodoDuplamente anterior, NodoDuplamente proximo){
        this.anterior = anterior;
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public NodoDuplamente getProximo() {
        return proximo;
    }

    public void setProximo(NodoDuplamente proximo) {
        this.proximo = proximo;
    }

    public NodoDuplamente getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDuplamente anterior) {
        this.anterior = anterior;
    }
    
}
