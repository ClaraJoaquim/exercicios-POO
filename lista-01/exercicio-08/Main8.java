import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        ValorContainer objA = new ValorContainer();
        ValorContainer objB = new ValorContainer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de objA: ");
        objA.valor = scanner.nextInt();

        System.out.println("Informe o valor de objA: ");
        objB.valor = scanner.nextInt();

        System.out.println("\n--- Antes da troca ---");
        System.out.println("objA.valor = " + objA.valor);
        System.out.println("objB.valor = " + objB.valor);

        trocarValores(objA, objB);

        System.out.println("\n--- Depois da troca ---");
        System.out.println("objA.valor = " + objA.valor);
        System.out.println("objB.valor = " + objB.valor);
    }
    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        int var = refA.valor;
        refA.valor = refB.valor;
        refB.valor = var;
    }
}
