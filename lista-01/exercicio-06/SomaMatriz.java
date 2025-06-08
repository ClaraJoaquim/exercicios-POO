import java.util.Scanner;

public class SomaMatriz {

    Scanner scanner = new Scanner(System.in);

    public void lerMatriz(int[][] matriz, int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public int somaDiagonalPrincipal(int[][] matriz, int n) {
        int soma = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public int somaDiagonal (int[][] matriz, int n) {
        int soma = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }


}
