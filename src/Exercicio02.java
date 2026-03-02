import java.util.Scanner;

public class Exercicio02 {

    static final int numeroMaximo = 30;

    public static void main(String[] args) {

        int rm[] = new int[numeroMaximo];
        double nota1[] = new double[numeroMaximo];
        double nota2[] = new double[numeroMaximo];

        //Entrada de Dados
        int numeroAlunos = entradaDados(rm,nota1,nota2);

        //Os dados foram devolvidos sem precisar utilizar return no metodo
        for (int i = 0; i < 2; i++) {
            System.out.println("RM: "+ rm[i]);
        }

        // Media
        double media[] = new double[numeroAlunos];

        calcularMedia(numeroAlunos, nota1, nota2, media);
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.println("RM: " + rm[i] + "\t media: " + media[i]);
        }

        //Aprovados
        int aprovados[] = new int[numeroAlunos];
        int numeroAprovado = gerarListaAprovados(numeroAlunos, rm, media, aprovados);


        System.out.println("\n **** Alunos aprovados ****");
        for (int i = 0; i < numeroAprovado; i++) {
            System.out.println(aprovados[i]);
        }

    }

    public static int gerarListaAprovados(int numeroAlunos, int[] rm, double[] media, int[] aprovados){
        int numeroAprovado = 0;
        for (int i = 0; i < numeroAlunos; i++) {
            if (media[i]>=6){
                aprovados[numeroAprovado] = rm[i];
                numeroAprovado++;
            }
        }

        return numeroAprovado;
    }

    public static void calcularMedia(int numeroAlunos, double[] nota1, double[] nota2, double[] media){
        for (int i = 0; i < numeroAlunos; i++) {
            media[i] = (nota1[i] + nota2[i]) / 2;
        }
    }

    public static int entradaDados(int[] rm, double[] nota1, double[] nota2){

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
        return numeroAlunos;
    }
}
