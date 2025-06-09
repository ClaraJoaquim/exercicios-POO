import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a duracao em segundos: ");
        int segundos = scanner.nextInt();

        Duracao duracao = new Duracao(segundos);

        System.out.println(duracao.getHoras() + ":" + duracao.getMinutos() + ":" + duracao.getSegundos());

        scanner.close();
    }
}
