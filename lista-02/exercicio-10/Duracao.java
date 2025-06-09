public class Duracao {
    private int totalSegundos;

    public Duracao(int totalSegundos) {
        this.totalSegundos = totalSegundos;
    }

    public int getHoras() {
        return totalSegundos / 3600;
    }

    public int getMinutos() {
        return (totalSegundos % 3600) / 60;
    }

    public int getSegundos() {
        return totalSegundos % 60;
    }
}
