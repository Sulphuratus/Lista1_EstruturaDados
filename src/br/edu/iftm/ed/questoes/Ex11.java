import br.edu.iftm.ed.classes.Livro;
import br.edu.iftm.ed.estruturas.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Ex11 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Stack<Livro> pilha = new Stack<>();
        for (int i=0; i<2; i++){
            System.out.println("Nome do livro: ");
            String nome = leia.nextLine();
            System.out.println("ISBN: ");
            String isbn = leia.nextLine();
            System.out.println("Ano de Lançamento: ");
            int ano = leia.nextInt();
            leia.nextLine();
            System.out.println("Nome do autor: ");
            String autor = leia.nextLine();
            Livro l = new Livro(nome, isbn, ano, autor);
            pilha.push(l);
        }

        System.out.println(pilha.isEmpty());
        System.out.println(pilha.size());
        System.out.println(pilha.peek());
        System.out.println(pilha.push(new Livro("A pipoca assasina","", 1988, "Ventania")));
        System.out.println(pilha.pop());
        System.out.println(pilha);
    }
}