public class Empregado {
    private String nome;
    protected double salario;

    public Empregado(){}

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void ExibirProduto(){
        System.out.println("---------------Exibir----------------");
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("Salario: %s%n", getSalario());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
