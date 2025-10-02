import Astros.Estrela;
import Astros.Lua;
import Astros.Planeta;

public class App {
    public static void main(String[] args) {
        Estrela sol = new Estrela("Sol", 1392000, 3666666, 10000, 38800, 6);
        Planeta terra = new Planeta("Terra", 30000, 22770, "Rochoso", 3, sol);
        Planeta marte = new Planeta("Marte", 25000, 21000, "Rochoso", 3, sol);
        Planeta venus = new Planeta("Vênus", 20000, 10770, "Rochoso", 3, sol);
        Lua lua = new Lua("Lua", 2500, 3000, terra);
        Lua galileu = new Lua("Galileu", 5600, 5600, terra);

        sol.dados();
        terra.dados();
        marte.dados();
        venus.dados();
        lua.dados();
        galileu.dados();
    }
}
