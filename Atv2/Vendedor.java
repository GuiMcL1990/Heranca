public class Vendedor extends Empregado {
    private float percentualComissao;

    public Vendedor(){super();}

    public Vendedor(String nome, double salario, float percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public void ExibirProduto(){
        System.out.println("---------------Exibir----------------");
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("Salario: %s%n", getSalario());
        System.out.printf("Percentual de Comissao: ", getPercentualComissao());
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
