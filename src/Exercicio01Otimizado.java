import java.util.Scanner;

public class Exercicio01Otimizado {
    public static void main(String[] args) {

        final int numeroMaximo = 30;

        int rm[] = new int[numeroMaximo];
        double nota1[] = new double[numeroMaximo];
        double nota2[] = new double[numeroMaximo];

        Scanner entrada = new Scanner(System.in);

        int numeroAlunos=0;
        System.out.println("Digite o RM do aluno:");
        int rmLido = entrada.nextInt();

        while (numeroAlunos< numeroMaximo && rmLido>0){
            rm[numeroAlunos] = rmLido;
            System.out.println("Nota1: ");
            nota1[numeroAlunos] = entrada.nextDouble();

            System.out.println("Nota2: ");
            nota2[numeroAlunos] = entrada.nextDouble();

            numeroAlunos++;
            System.out.println("Digite o RM do aluno:");
            rmLido = entrada.nextInt();
        }

        double media[] = new double[numeroAlunos];

        for (int i=0; i< numeroAlunos; i++){
            media[i] = (nota1[i]+nota2[i])/2;
            System.out.println("RM: "+rm[i]+"\t Média: "+media[i]);
        }

        int aprovados[] = new int[numeroAlunos];
        int numeroAprovados = 0;
        for (int i=0; i< numeroAlunos; i++){
            if (media[i]>=6){
                aprovados[numeroAprovados] = rm[i];
                numeroAprovados++;
            }
        }

        System.out.println("\n **** Alunos aprovados ****");
        for (int i=0; i<numeroAprovados; i++){
            System.out.println(aprovados[i]);
        }
    }
}
