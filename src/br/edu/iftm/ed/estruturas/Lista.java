package br.edu.iftm.ed.estruturas;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade){
        elementos = (T[])new Object[capacidade];
        tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    //adiciona o elemento no final vetor
    public boolean adiciona(T elemento){
        this.aumentarCapacidade();
        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento)throws IllegalAccessException{
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao invalida!");
        }
        this.aumentarCapacidade();
        for(int i = tamanho-1; i >= posicao; i--){
            elementos[i+1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
        return true;
    }

    public void remover(int posicao)throws IllegalAccessException{
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao invalida!");
        }

        for(int i = posicao; i < tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }

    private void aumentarCapacidade(){
        if(tamanho == elementos.length){
            T[] elementosNovos = (T[])new Object[elementos.length*2];
            for(int i =0; i < elementos.length; i++){
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }


   //Método do Exercício numero 1 da lista 1 de exercicios: Implemente um método
   // "contem" na classe Lista, semelhante ao método "contains" da classe "ArrayList";
    public boolean contem(T elemento){
        for (int i = 0; i < tamanho; i++){
            if(elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }
    //Método do Exercicio numero 2 da lista de exercicios 1: Implemente um método
    // semelhante ao método "lastIndexOf" da classe "ArrayList" na classe "Lista";
    public int ultimoIndice(T elemento){
        int indice = -1;
        for(int i = 0; i< tamanho; i++){
            if(elementos[i].equals(elemento)){
                indice = i;
            }
        }
        return indice;
    }


    //Método do Exercicio numero 3 da lista 1 de exercicios: Implemente na classe
    // "Lista" o método "removeLast(T elemento)", onde será possível remover o
    // último elemento da lista.

    public void removeUltimo() throws IllegalAccessException{
        if(this.tamanho() != 0){
            this.remover(tamanho-1);
        }
    }

    //Método do Exercicio numero 4 da lista 1 de exercicios: Implemente na classe
    // "Lista" o método "removeFirst(T elemento)", onde será possível remover o
    // primeiro elemento da lista.

    public void removePrimeiro() throws IllegalAccessException{
        if(this.tamanho() != 0){
            this.remover(0);
        }
    }

    //Método para o Exercicio 5 da lista 1 de exercicios: Implemente na classe
    // "Lista" o método "limpar", onde todos os elementos da lista são removidos.
    // Esse método é semelhante ao método "clear" da classe "ArrayList";

    public void limpar(){
        if(this.tamanho() != 0){
            for(int i = 0; i < tamanho; i++) {
                this.elementos[i] = null;
            }
        }
        tamanho = 0;
    }

    //Método para o Exercicio 6 da lista 1 de exercicios:
    /* Utilizando a classe "Lista" e a classe "contato" e desenvolva os seguintes
    itens abaixo:
    a. Crie uma Lista com capacidade para 20 contatos;
    b. Insira 30 contatos na lista;
    c. Imprima todos os elementos da lista;
    */




    public int tamanho(){
        return tamanho;
    }

    public Object busca(int posicao) throws IllegalAccessException{
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao invalida!");
        }
        return elementos[posicao];
    }

    public int busca(Object elemento){
        for (int i = 0; i < tamanho; i++) {
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {

        StringBuffer s = new StringBuffer();
        s.append("[");
        for(int i = 0; i < tamanho-1; i++) {
            s.append(elementos[i]);
            s.append(", ");
        }
        if(tamanho > 0) {
            s.append(elementos[tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }


}