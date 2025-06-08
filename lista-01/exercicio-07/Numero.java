public class Numero {

    int numero;

    public void imprimirNumero() {
        System.out.println("O número digitado foi: " + this.numero);
        System.out.println("O endereço de memória é: " + System.identityHashCode(numero));
    }
}
