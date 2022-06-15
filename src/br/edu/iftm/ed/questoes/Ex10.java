import br.edu.iftm.ed.classes.Livro;
import br.edu.iftm.ed.estruturas.Pilha;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pilha<Livro> pilha = new Pilha<>(20);
        for (int i=0; i < 2; i++){
            System.out.println("Nome: ");
            String nome = leia.nextLine();
            System.out.println("isbn: ");
            String isbn = leia.nextLine();
            System.out.println("ano Lancamento: ");
            int ano = leia.nextInt();
            leia.nextLine();
            System.out.println("nome autor: ");
            String autor = leia.nextLine();
            Livro l = new Livro(nome, isbn, ano, autor);
            pilha.empilhar(l);
        }
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.tamanho());
        System.out.println(pilha.topo());
        System.out.println(pilha.empilhar(new Livro("A pipoca assasina", "opus963", 2013, "Pipoqueiro da Praça")));
        //System.out.println(pilha);
        System.out.println(pilha.desempilhar());
        System.out.println(pilha);
    }
}