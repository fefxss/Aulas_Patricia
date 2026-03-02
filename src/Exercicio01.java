import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] rm = new int[30];
        double [] nota1 = new double[30];
        double [] nota2 = new double[30];
        double [] media = new double[30];
        double [] aprovados = new double[30];

        for (int i=0; i<30; i++) {
            System.out.println("Digite o rm:");
            rm[i] = entrada.nextInt();
            if (rm[i] < 0) {
                break;
            }

            System.out.println("Digite a 1° Nota:");
            nota1[i] = entrada.nextDouble();

            System.out.println("Digite a 2° Nota:");
            nota2[i] = entrada.nextDouble();

            media[i] = (nota1[i] + nota2[i]) / 2;

            System.out.println("RM: "+rm[i]);
            System.out.println("Média: "+media[i]);
            System.out.println("====================");
        }

        System.out.println("APROVADOS:");
        for (int i=0; i<30; i++){

            if (media[i] >= 6) {
                System.out.println("RM: "+rm[i]+" - Média: "+media[i]);
            }
        }
    }
}
