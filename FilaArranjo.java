/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09;

/**
 *
 * @author samara
 */
public class FilaArranjo {
  private Object item[];
  private int    frente, tras;
  
  public FilaArranjo () { 
    this.item = new Object[1000];
    this.frente = 0;
    this.tras = this.frente;
  }
  public FilaArranjo (int maxTam) { 
    this.item = new Object[maxTam];
    this.frente = 0;
    this.tras = this.frente;
  }
  public void enfileira (Object x) throws Exception {
    if ((this.tras + 1) % this.item.length == this.frente)
      throw new Exception ("Erro: A fila esta cheia");
    this.item[this.tras] = x;
    this.tras = (this.tras + 1) % this.item.length;
  }
  public Object desenfileira () throws Exception {
    if (this.vazia ())
      throw new Exception ("Erro: A fila esta vazia");
    Object item = this.item[this.frente];
    this.frente = (this.frente + 1) % this.item.length;
    return item;
  }
  public boolean vazia () {
    return (this.frente == this.tras);
  }
  public void imprime () {
    for (int i = this.frente; i != this.tras; i = (i + 1) % this.item.length)
      System.out.println(this.item[i].toString ());
  }    
}
