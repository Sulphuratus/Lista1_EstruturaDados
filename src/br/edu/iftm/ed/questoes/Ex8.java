package br.edu.iftm.ed.questoes;
import br.edu.iftm.ed.estruturas.Pilha;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();
        Scanner leia = new Scanner(System.in);
        for (int i=0; i < 10; i++){
            System.out.println("Digite um número inteiro: ");
            int numero = leia.nextInt();
            if (numero % 2 == 0 ){
                pilha.empilhar(numero);
            }else{
                if(pilha.estaVazia()){
                    System.out.println("Pilha está vazia!!");
                }else{
                    pilha.desempilhar();
                }
            }
        }
        while (!pilha.estaVazia()){
            System.out.println(pilha.desempilhar());
        }
    }

}