import Astros.Estrela;
import Astros.Galaxia;
import Astros.Planeta;
import Astros.Interstellar.SistemaEstelar;

public class Main {
    public static void main(String[] args) {

        
        // Estrelas
        Estrela bublle = new Estrela("Bublle", 25000000, 1500000, 40000, 1299);
        
        // Planetas
        Planeta ceu = new Planeta("Céu", 1500000, 200000, "Rochoso", bublle);
        Planeta fumala = new Planeta("Fumala", 3000000, 500000, "Gasoso", bublle);
        
        // Sistemas solares
        SistemaEstelar nullo = new SistemaEstelar("Nullo", bublle);

        // Galaxias
        Galaxia cosminho = new Galaxia("Cosminho", nullo);
    }
}
