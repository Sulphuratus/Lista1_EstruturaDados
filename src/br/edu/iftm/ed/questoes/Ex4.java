package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.estruturas.Lista;

public class Ex4 {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(10);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println("Lista antes de remover o primeiro elemento: " + lista);
        try{
            lista.removePrimeiro();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
        System.out.println("Lista após a remoção do primeiro elemento: " + lista);
    }
}