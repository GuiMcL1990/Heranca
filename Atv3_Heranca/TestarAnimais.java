public class TestarAnimais {
        public static void main(String[] args) {
            Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2.0f, "");
            Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
            Mamifero ursoCanada = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", 0.5f, "Mel");

            System.out.println("Dados do Camelo:");
            camelo.dadosMamifero();
            System.out.println();

            System.out.println("Dados do Tubarão:");
            tubarao.dadosPeixe();
            System.out.println();

            System.out.println("Dados do Urso-do-canadá:");
            ursoCanada.dadosMamifero();
        }
    }

