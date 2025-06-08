public class Funcionario {

    String nome;
    int id;
    double salario;
    String departamento;

    public Funcionario(String departamento, int id, String nome, double salario) {
        this.departamento = departamento;
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", ID: " + id + ", Salário: R$" + String.format("%.2f", salario) + ", Departamento: " + departamento;
    }

}
