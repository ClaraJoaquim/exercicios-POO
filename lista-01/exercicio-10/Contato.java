public class Contato {

    String nome;
    String telefone;
    String email;

    public Contato(String email, String nome, String telefone) {
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}
