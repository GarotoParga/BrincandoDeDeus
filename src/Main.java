import Astros.Estrela;
import Astros.Galaxia;
import Astros.Lua;
import Astros.Planeta;
import Astros.Interstellar.SistemaEstelar;

public class Main {
    public static void main(String[] args) {

        // Estrelas
        Estrela bublle = new Estrela("Bublle", 25000000, 1500000, 40000, 1299);
        Estrela hohou = new Estrela("Hohou", 120000, 2330000, 30000000, 2666666);

        // Planetas
        Planeta ceu = new Planeta("Céu", 1500000, 200000, "Rochoso", bublle);
        Planeta fumala = new Planeta("Fumala", 3000000, 500000, "Gasoso", bublle);
        Planeta xurupita = new Planeta("Xurupita", 500000, 100000, "Rochoso", hohou);
        Planeta zambuca = new Planeta("Zambuca", 7000000, 800000, "Gasoso", hohou);

        // Luas

        Lua luazul = new Lua("Luazul", 50000, 10000, ceu);
        Lua luaverde = new Lua("Luaverde", 70000, 20000, fumala);
        Lua luamisteriosa = new Lua("Luamisteriosa", 30000, 5000, zambuca);
        Lua luadourada = new Lua("Luadourada", 60000, 15000, zambuca);
        Lua luaprata = new Lua("Luaprata", 40000, 8000, zambuca);
        Lua luaroxa = new Lua("Luaroxa", 20000, 3000, xurupita);

        // Sistemas solares
        SistemaEstelar bagal = new SistemaEstelar("Bagal", bublle);
        bagal.adicionarEstrelaNoSistema(hohou);

        // Galaxias
        Galaxia cosminho = new Galaxia("Cosminho", bagal);

        // Comandos Principais
        cosminho.mostrarDadosComplexos();
    }
}
