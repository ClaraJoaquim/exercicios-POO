import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        int indice;
        int somaPrincipal = 0;
        int somaSecundaria = 0;
        Scanner scanner = new Scanner(System.in);
        SomaMatriz somaMatriz = new SomaMatriz();

    System.out.println("Digite o índice da matriz: ");
    indice = scanner.nextInt();
    int[][] matriz = new int[indice][indice];

    somaMatriz.lerMatriz(matriz, indice);
    somaPrincipal = somaMatriz.somaDiagonalPrincipal(matriz, indice);
    somaSecundaria = somaMatriz.somaDiagonal(matriz, indice);

    System.out.println("A soma da diagonal principal é: " + somaPrincipal);
    System.out.println("A soma da diagonal secundária é: " + somaSecundaria);
    }
}
