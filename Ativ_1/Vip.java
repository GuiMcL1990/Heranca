package Ativ_1;

public class Vip extends Ingresso {
    private double IngressoVip;
    private double taxa;

    public Vip(){
        super();
    }

    public Vip(double IngressoVip, double taxa) {
        super (IngressoVip);
        this.IngressoVip = IngressoVip;
        this.taxa = taxa;
    }

    @Override
    public void ImprimeValor() {
        System.out.println("------------- Informação do ingresso -------------");
        System.out.println("Tipo: Ingresso VIP");
        System.out.println("Valor do ingresso VIP: R$" + getIngressoVip());
        System.out.println("Taxa adicional: R$" + getTaxa());
        System.out.println("Valor total: R$" + getValor());

    }

    public double getIngressoVip() {
        return IngressoVip;
    }

    public void setIngressoVip(double ingressoVip) {
        IngressoVip = ingressoVip;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}