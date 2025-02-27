package Ativ_1;

public class Normal  extends Ingresso{
    private double IngressoNormal1;

    public Normal(double valor){
        super(valor);
    }

    public Normal(double valor, double ingressoNormal1){
        super(valor);
        this.IngressoNormal1 = ingressoNormal1;

    }

    @Override
    public void ImprimeValor() {
        super.ImprimeValor();
        System.out.println("------------- Informação do ingresso -------------");
        System.out.println("Tipo: Ingresso normal");
        System.out.println("Valor: R$" + getValor());
    }

    public double getIngressoNormal1() {
        return IngressoNormal1;
    }

    public void setIngressoNormal1(double ingressoNormal1) {
        IngressoNormal1 = ingressoNormal1;
    }
}