import Astros.Estrela;
import Astros.Planeta;
import Astros.Interstellar.SistemaEstelar;

public class Main {
    public static void main(String[] args) {

        Estrela bublle = new Estrela("Bublle", 25000000, 1500000, 40000, 1299);
        Planeta ceu = new Planeta("Céu", 1500000, 200000, "Rochoso", bublle);
        Planeta fumala = new Planeta("Fumala", 3000000, 500000, "Gasoso", bublle);

        SistemaEstelar nullo = new SistemaEstelar("Nullo", bublle);

        nullo.exibirSistemaComDados();
    }
}
