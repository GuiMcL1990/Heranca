public class Main {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        empregado1.setNome("Thallys Malaquias Gonçalves dos Santos: ");
        empregado1.setSalario(12.000);
        empregado1.ExibirProduto();

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Ryan Gabriel Silva: ");
        gerente1.setSalario(12.000);
        gerente1.setDepartamento("250!");
        gerente1.ExibirProduto();

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Davidson Fernandes dos Reis Silva: ");
        vendedor1.setSalario(1200);
        vendedor1.setPercentualComissao(41);
        vendedor1.ExibirProduto();
    }
}
