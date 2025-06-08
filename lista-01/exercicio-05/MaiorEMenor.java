import java.util.Scanner;

public class MaiorEMenor {

    Scanner scanner = new Scanner(System.in);

    public void criarMatriz(int m, int n) {
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i <  m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("\nMaior elemento da matriz: " + maior);
        System.out.println("Menor elemento da matriz: " + menor);
    }
}
