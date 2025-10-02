import Astros.Estrela;
import Astros.Planeta;
import Astros.Interstellar.SistemaSolar;
import Astros.Interstellar.SolarSystem;

public class Main {
    public static void main(String[] args) {

        // Sistema fictício criado pelo usuário
        Estrela sol = new Estrela("Sol", 1392680, 1989e27, 10000, 38800, 6);
        Planeta terra = new Planeta("Terra", 12742, 5970, "Rochoso", 1, sol);
        SolarSystem sisteminha = new SolarSystem("Sisteminha", sol);
        // Adcionando Terra como planeta do seu Sistema 
        sisteminha.adicionarPlaneta(terra);

        // Sistema único e real
        SistemaSolar sistemaSolar = new SistemaSolar("Sistema Solar");
        sistemaSolar.exibirSistema();

    }
}
