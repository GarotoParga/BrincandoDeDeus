import Astros.Estrela;
import Astros.Galaxia;
import Astros.Planeta;
import Astros.Interstellar.SistemaEstelar;

public class Main {
    public static void main(String[] args) {

        // Estrelas
        Estrela bublle = new Estrela("Bublle", 25000000, 1500000, 40000, 1299); // Intanciando Estrela sem nenhum
                                                                                // planeta, Sistema ou galaxia.

        // Planetas
        Planeta ceu = new Planeta("Céu", 1500000, 200000, "Rochoso", bublle); // Planeta vinculando como sua Estrela,
                                                                              // Bublle.
        Planeta fumala = new Planeta("Fumala", 3000000, 500000, "Gasoso", bublle); // Planeta vinculando como sua
                                                                                   // Estrela, Bublle.

        // Sistemas solares
        SistemaEstelar nullo = new SistemaEstelar("Nullo", bublle); // Sistema vinculando como Estrela primária do seu
                                                                    // Sistema, Bublle.
        SistemaEstelar bagal = new SistemaEstelar("Bagal", bublle);
        // Galaxias
        Galaxia cosminho = new Galaxia("Cosminho", nullo); // Galaxia vinculando Sistema nullo, como seu SIstema
                                                           // primário.
    }
}
