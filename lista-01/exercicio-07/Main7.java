import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Numero numero = new Numero();

        System.out.println("Digite um número: ");
        numero.numero = scanner.nextInt();

        numero.imprimirNumero();

        scanner.close();
    }
}
