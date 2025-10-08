import Astros.Estrela;
import Astros.Galaxia;
import Astros.Lua;
import Astros.Planeta;
import Astros.Interstellar.SistemaEstelar;
import Astros.Interstellar.SistemaSolar;

public class Main {
    public static void main(String[] args) {

        Estrela sol = new Estrela("Sol", 390000000000l, "Anã Amarela", 1392000, 1.989E30, 5778, "Esférica");  

        Planeta terra = new Planeta("Terra", 4600000000l, "Planeta rochoso", 12742, 5.972E24, 288, "Esférica", sol);
        Lua lua = new Lua("Lua", 4500000000l, "Satélite natural", 3474.8, 7.342E22, 220, "Esférica", terra);
        Lua lua2 = new Lua("Lua2", 3000000000l, "Satélite natural", 1500, 5.342E20, 150, "Irregular", terra);
        
        Planeta marte = new Planeta("Marte", 4500000000l, "Planeta rochoso", 6779, 6.39E23, 210, "Esférica", sol);
        Lua fobos = new Lua("Fobos", 4500000000l, "Satélite natural", 22.2, 1.0659E16, 233, "Irregular", marte);
        Lua deimos = new Lua("Deimos", 4500000000l, "Satélite natural", 12.4, 1.4762E15, 234, "Irregular", marte);


        Planeta jupiter = new Planeta("Júpiter", 4500000000l, "Planeta gasoso", 139820, 1.898E27, 165, "Esférica", sol);
        Lua io = new Lua("Io", 4500000000l, "Satélite natural", 3643.2, 8.9319E22, 130, "Esférica", jupiter);
        Lua europa = new Lua("Europa", 4500000000l, "Satélite natural", 3121.6, 4.7998E22, 102, "Esférica", jupiter);
        Lua ganimedes = new Lua("Ganimedes", 4500000000l, "Satélite natural", 5268.2, 1.4819E23, 110, "Esférica", jupiter);
        Lua callisto = new Lua("Callisto", 4500000000l, "Satélite natural", 4820.6, 1.0759E23, 134, "Esférica", jupiter);
        
        SistemaEstelar bug = new SistemaEstelar("Bug", 4600000000l, sol);
        bug.exibirSistemaComDados();

    }
}
