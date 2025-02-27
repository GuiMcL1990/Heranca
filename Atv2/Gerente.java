public class Gerente extends Empregado {
    private String Departamento;

    public Gerente(){super();}

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        Departamento = departamento;
    }

    @Override
    public void ExibirProduto() {
        super.ExibirProduto();
        System.out.printf("Departamento: %s%n", getDepartamento());
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
}
