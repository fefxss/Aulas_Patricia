package ExercicioPilhas;

import java.util.Scanner;

public class PilhaMain {

    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            Metodos pilha = new Metodos();
            int valor;

            pilha.init();

            pilha.push(10);
            pilha.push(12);
            pilha.push(22);
            pilha.push(55);
            pilha.push(66);
            pilha.push(77);



            pilha.isFull();

            pilha.pop();

            pilha.top();

            pilha.pop();

            pilha.top();

            pilha.isEmpty();

            pilha.top();
    }
}
