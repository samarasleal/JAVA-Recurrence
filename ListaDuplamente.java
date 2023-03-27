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
public class ListaDuplamente {
    private NodoDuplamente cabecalho, fim;
    private long tamanhoLista;
    
    public ListaDuplamente(){
        this.cabecalho = null;
        this.fim = null;
        this.tamanhoLista = 0;
    }

    public NodoDuplamente getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(NodoDuplamente cabecalho) {
        this.cabecalho = cabecalho;
    }

    public NodoDuplamente getFim() {
        return fim;
    }

    public void setFim(NodoDuplamente fim) {
        this.fim = fim;
    }

    public long getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(long tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }
  
    public void removeFinal(){
        NodoDuplamente t,antes;
        if (tamanhoLista==0)
        System.out.println("Erro");
        else {
            t = fim.getAnterior();      // Último nodo a ser removido
            antes = t.getAnterior();    // Nodo antes do último nodo
            antes.setProximo(fim);      // antes recebe o fim como próximo
            fim.setAnterior(antes);     // fim receber o antes como anterior
            t.setAnterior(null);        // Nodo removido anterior recebe null
            t.setProximo(null);         // ||   ||       próximo recebe null
            tamanhoLista--;
        }
            
    }
    
    public void insereInicio(NodoDuplamente novo){
        NodoDuplamente w = cabecalho.getProximo();
        novo.setProximo(w);
        novo.setAnterior(cabecalho);
        w.setAnterior(novo);
        cabecalho.setProximo(novo);
        tamanhoLista++;
    }
    
}
