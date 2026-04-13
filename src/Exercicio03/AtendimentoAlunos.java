package Exercicio03;

import Testefila.FilaInt;

import java.util.Scanner;

public class AtendimentoAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        int opcao;
        do {
            System.out.println("1 - Insere aluno na fila");
            System.out.println("2 - Atende aluno");
            System.out.println("3 - Encerra atendimento");
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Infomre o RM:");
                    int rm = entrada.nextInt();
                    fila.enqueue(rm);
                    break;
                case 2:
                    if (fila.isEmpty()){
                        System.out.println("Não existem atendimentos na fila");
                    } else {
                        System.out.println("Processo: "+fila.dequeue()+ "sera executado");
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()){
                        System.out.println("Ainda existem alunos na fila");
                        opcao = 0;
                    }
                    System.out.println("Atendimento encerrado");
                    break;
                default:
                    System.out.println("Opcão inválida");
            }
        } while (opcao!= 3);
    }
}
