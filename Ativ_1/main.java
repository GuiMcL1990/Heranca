package Ativ_1;

public class main {
    public static void main(String[] args) {

        Ingresso Ingresso1 = new Ingresso(10);
        Ingresso1.ImprimeValor();

        Normal ingressoNormal1 = new Normal(15);
        ingressoNormal1.ImprimeValor();

        Vip ingressoVip = new Vip(15, 10);
        ingressoVip.ImprimeValor();
    }
}