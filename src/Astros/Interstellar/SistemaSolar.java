package Astros.Interstellar;

import java.util.ArrayList;
import java.util.List;

import Astros.Estrela;
import Astros.Lua;
import Astros.Planeta;

public class SistemaSolar {
    private String nome;
    private Estrela sol;
    private List<Planeta> planetas;

    public SistemaSolar(String nome) {
        this.nome = nome;

        sol = new Estrela("Sol", 1392680, 1989e27, 10000, 38800);
        planetas = new ArrayList<>();

        // ===== PLANETAS E LUAS =====

        // Mercúrio (sem luas)
        Planeta mercurio = new Planeta("Mercúrio", 4879, 3300, "Rochoso", sol);
        planetas.add(mercurio);

        // Vênus (sem luas)
        Planeta venus = new Planeta("Vênus", 12104, 4870, "Rochoso", sol);
        planetas.add(venus);

        // Terra
        Planeta terra = new Planeta("Terra", 12742, 5970, "Rochoso", sol);
        new Lua("Lua", 3474, 384, terra);
        planetas.add(terra);

        // Marte
        Planeta marte = new Planeta("Marte", 6792, 642, "Rochoso", sol);
        new Lua("Fobos", 22, 9, marte);
        new Lua("Deimos", 12, 23, marte);
        planetas.add(marte);

        // Júpiter
        Planeta jupiter = new Planeta("Júpiter", 139822, 1898000, "Gasoso", sol);
        new Lua("Ganímedes", 5268, 1070, jupiter);
        new Lua("Calisto", 4820, 1882, jupiter);
        new Lua("Io", 3643, 421, jupiter);
        new Lua("Europa", 3122, 670, jupiter);
        planetas.add(jupiter);

        // Saturno
        Planeta saturno = new Planeta("Saturno", 116464, 568300, "Gasoso", sol);
        new Lua("Titã", 5150, 1222, saturno);
        new Lua("Reia", 1527, 527, saturno);
        new Lua("Dione", 1123, 377, saturno);
        new Lua("Tétis", 1062, 294, saturno);
        new Lua("Encélado", 504, 238, saturno);
        planetas.add(saturno);

        // Urano
        Planeta urano = new Planeta("Urano", 50724, 86810, "Gasoso", sol);
        new Lua("Titânia", 1578, 436, urano);
        new Lua("Oberon", 1523, 584, urano);
        new Lua("Umbriel", 1169, 266, urano);
        new Lua("Ariel", 1159, 191, urano);
        new Lua("Miranda", 471, 129, urano);
        planetas.add(urano);

        // Netuno
        Planeta netuno = new Planeta("Netuno", 49244, 102400, "Gasoso", sol);
        new Lua("Tritão", 2706, 355, netuno);
        new Lua("Nereida", 340, 5513, netuno);
        planetas.add(netuno);
    }

    public String getNome() {
        return nome;
    }

    public Estrela getEstrela() {
        return sol;
    }

    public List<Planeta> getPlanetas() {
        return planetas;
    }

    public void exibirSistema() {
        System.out.println("==== Sistema: " + this.getNome() + " ====");
        System.out.println("Estrela: " + this.getEstrela().getNome());
        System.out.println("----- Planetas -----");
        for (Planeta p : planetas) {
            System.out.println(p.getNome()); // exibe o nome de cada planeta
        }
        System.out.println("========================================");
    }

    public void exibirSistemaComDados() {
        System.out.println("==== Sistema: " + this.getNome() + " ====");
        System.out.println("Estrela: " + this.getEstrela().getNome());
        System.out.println("----- Planetas -----");
        for (Planeta p : planetas) {
            p.dados(); // exibe o nome de cada planeta
        }
        System.out.println("========================================");
    }
}
