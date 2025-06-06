public class Fatorial {

    public long calcularFatorial (long n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}
