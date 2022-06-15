package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.classes.Contato;
import br.edu.iftm.ed.estruturas.Lista;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex7{

    public static void main(String[] args) {

        LinkedList<Contato> lista = new LinkedList<>();
        for(int i=0; i < 3; i++) {
            Scanner leia = new Scanner(System.in);
            System.out.println("Digite o nome: ");
            String nome = leia.next();
            System.out.println("Digite o Telefone: ");
            String telefone = leia.next();
            System.out.println("Digite o Email: ");
            String email = leia.next();
            Contato c = new Contato(nome, telefone, email);
            lista.add(c);
        }
        System.out.println(lista);
    }

}