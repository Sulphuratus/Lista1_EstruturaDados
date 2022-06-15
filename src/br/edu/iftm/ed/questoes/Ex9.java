package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.estruturas.Pilha;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex9{
    public static void main(String[] args) {
        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número inteiro: ");
            int numero = leia.nextInt();
            if(numero == 0){
                if(pilhaPar.estaVazia()){
                    System.out.println("A pilha par está vazia!!");
                }else{
                    pilhaPar.desempilhar();
                }

                if(pilhaImpar.estaVazia()){
                    System.out.println("A pilha impar está vazia!!");
                }else{
                    pilhaImpar.desempilhar();
                }
            }else if(numero % 2 == 0){
                pilhaPar.empilhar(numero);

            }else{
                pilhaImpar.empilhar(numero);
            }
        }
        System.out.println("Pilha par: ");
        while(!pilhaPar.estaVazia()){
            System.out.println(pilhaPar.desempilhar());
        }

        System.out.println("Pilha impar");
        while(!pilhaImpar.estaVazia()){
            System.out.println(pilhaImpar.desempilhar());
        }
    }

}