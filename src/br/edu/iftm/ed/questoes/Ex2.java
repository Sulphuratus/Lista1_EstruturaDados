package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.estruturas.Lista;

import java.net.StandardSocketOptions;
import java.util.ArrayList;

public class Ex2 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(10);
        //listaArray.lastIndexOf(); // Para verificar detalhes de como o método funciona
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");
        System.out.println("Ultima ocorrencia de A: " + lista.ultimoIndice("A"));
        System.out.println("Ultima ocorrencia de B: " + lista.ultimoIndice("B"));
        System.out.println("Ultima ocorrencia de C: " + lista.ultimoIndice("C"));
    }
}