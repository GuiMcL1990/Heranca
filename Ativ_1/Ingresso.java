package Ativ_1;

public class Ingresso {
        private double valor;

        public Ingresso() {
        }

        public Ingresso(double valor) {
            this.valor = valor;
        }

        public void ImprimeValor() {
            System.out.println("------------- Informação do ingresso -------------");
            System.out.println("Valor: R$" + getValor());
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
    }
