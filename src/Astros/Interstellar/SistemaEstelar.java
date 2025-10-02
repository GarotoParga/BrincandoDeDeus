package Astros.Interstellar;

import java.util.ArrayList;
import java.util.List;

import Astros.Estrela;
import Astros.Planeta;

public class SistemaEstelar {
    private String nome;
    private Estrela estrela;
    private List<Planeta> planetas;

    public SistemaEstelar(String nome, Estrela estrela) {
        this.nome = nome;
        this.estrela = estrela;
        this.planetas = new ArrayList<>();
    }

    public void adicionarPlaneta(Planeta planeta) {
        planetas.add(planeta);
    }

    public Estrela getEstrela() {
        return estrela;
    }

    public List<Planeta> getPlanetas() {
        return planetas;
    }

    public void exibirSistema() {
        System.out.println("==== Sistema: " + this.nome + " ====");
        System.out.println("Estrela: " + this.estrela.getNome());
        System.out.println("----- Planetas -----");
        for (Planeta p : planetas) {
            System.out.println(p.getNome()); // exibe o nome de cada planeta
        }
        System.out.println("========================================");
    }

    public void exibirSistemaComDados() {
        System.out.println("==== Sistema: " + this.nome + " ====");
        System.out.println("Estrela: " + this.estrela.getNome());
        System.out.println("----- Planetas -----");
        for (Planeta p : planetas) {
            p.dados(); // exibe o nome de cada planeta
        }
        System.out.println("========================================");
    }
}
