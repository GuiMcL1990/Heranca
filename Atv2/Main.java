public class Main {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        empregado1.setNome("Gohan");
        empregado1.setSalario(12.000);
        empregado1.ExibirProduto();

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Espingarda do caos");
        gerente1.setSalario(12.000);
        gerente1.setDepartamento("250!");
        gerente1.ExibirProduto();

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Praça da bigorna");
        vendedor1.setSalario(1200);
        vendedor1.setPercentualComissao(27);
        vendedor1.ExibirProduto();
    }
}
