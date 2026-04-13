package Exercicio04;

import Testefila.FilaInt;

import java.util.Scanner;

public class Processador {
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
                    System.out.println("Informe o pid do processo que está sendo submetido:");
                    int pid = entrada.nextInt();
                    fila.enqueue(pid);
                    break;
                case 2:
                    if (fila.isEmpty()){
                        System.out.println("Não existem atendimentos na fila");
                    } else {
                        pid = fila.dequeue();
                        System.out.println("Processo: "+fila.dequeue()+ "sera executado");
                        System.out.println("...Execução...");
                        System.out.println("O Processo concluiu? (1-sim)");
                        int resp = entrada.nextInt();
                        if (resp ==1){
                            System.out.println("O processo "+pid+" foi concluido");
                        } else {
                            System.out.println("Processo voltou para fila");
                            fila.enqueue(pid);
                        }
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