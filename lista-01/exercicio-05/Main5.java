import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        int m;
        int n;

        MaiorEMenor maiorEMenor = new MaiorEMenor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as dimensões da matriz");
        System.out.println("Informe a quantidade de linhas: ");
        m = scanner.nextInt();
        System.out.println("Informe a quantidade de colunas: ");
        n = scanner.nextInt();

        maiorEMenor.criarMatriz(m, n);

        scanner.close();
    }
}
