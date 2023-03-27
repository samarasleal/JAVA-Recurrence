/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09;
import java.util.Random;
/**
 *
 * @author samara
 */
public class TestaFila {
  public static void main (String[] args) {
    FilaArranjo fila = new FilaArranjo();
    Integer vetor[] = new Integer[1000];
    Integer n = null;
    int i, j, k, max;
    Random random = new java.util.Random();
    max = 10;
    try {
      // Gera uma permutacao aleatoria de chaves entre 0 e max - 1
      for (i = 0; i < max; i++)
        vetor[i] = new Integer(i);
      for (i = 0; i < max; i++) {
        k = Math.abs(random.nextInt()) % max;
        j = Math.abs(random.nextInt()) % max;
        n = vetor[k];
        vetor[k] = vetor[j];
        vetor[j] = n;
      }
      // Insere cada chave na fila
      for (i = 0; i < max; i++) {
        fila.enfileira(vetor[i]);
        System.out.println("Enfileirou:" + vetor[i].toString());
      }
      fila.imprime();
      // Retira cada chave da fila
      for (i = 0; i < max; i++) {
        n = (Integer) fila.desenfileira();
        System.out.println("Desenfileirou: " + n.toString());
      }
      n = (Integer) fila.desenfileira();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    fila.imprime();
  }
}
