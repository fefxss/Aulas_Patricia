package ExercicioFixacao1;

import java.util.Scanner;

public class Aluno {
    String nome;
    int rm;
    double nota1, nota2, media;

    public void leitura(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        this.nome = entrada.next();
        System.out.println("RM: ");
        this.rm = entrada.nextInt();
        System.out.println("Nota 1: ");
        this.nota1 = entrada.nextDouble();
        System.out.println("Nota 2: ");
        this.nota2 = entrada.nextDouble();
        entrada.close();
    }

    public void calculaMedia(){
        this.media = (this.nota1 + this.nota2)/2;
    }

    public void mostraAluno(){
        System.out.println("Aluno: "+this.nome+"\t RM: "+this.rm);
        System.out.println("Média: "+this.media);
    }
}
