package Astros.Interstellar;

import java.util.ArrayList;
import java.util.List;

import Astros.Estrela;
import Astros.Galaxia;
import Astros.Planeta;

public class SistemaEstelar {
    private String nome;
    private Estrela estrela;
    private List<Planeta> planetas;
    private Galaxia galaxia;

    public SistemaEstelar(String nome, Estrela estrela) {
        this.nome = nome;
        this.estrela = estrela;
        this.planetas = new ArrayList<>();
        estrela.setMeuSistema(this);
    }

    public void adicionarPlanetaNoSistema(Planeta planeta) {
        planetas.add(planeta);
    }

    public String getNome() {
        return nome;
    }

    public Estrela getEstrela() {
        return estrela;
    }

    public Galaxia getMinhaGalaxia() {
        return galaxia;
    }

    public void setMeuSistema(Galaxia galaxia) {
        if (this.getMinhaGalaxia() == null) {
            this.galaxia = galaxia;
        } else {
            System.out.println("Impossível vincular Galaxia " + this.nome + " no Sistema "
                    + this.getNome() + ".");
            System.out.println("Sistema " + this.getNome() + " está vinculada a Galaxia "
                    + this.getMinhaGalaxia().getNome() + ".");
        }
    }

    public void exibirSistema() {
        System.out.println("==== Sistema: " + this.nome + " ====");
        System.out.println("Estrela: " + this.estrela.getNome());
        if (this.getEstrela().getPlanetas() == null) {
            System.out.println("Não possui planetas!");
        } else {
            System.out.println("----- Planetas -----");
            for (Planeta p : this.getEstrela().getPlanetas()) {
                System.out.println(p.getNome()); // exibe o nome de cada planeta
            }
        }
        System.out.println("========================================");
    }

    public void exibirSistemaComDados() {
        System.out.println("==== Sistema: " + this.nome + " ====");
        System.out.println("Estrela: " + this.estrela.getNome());
        if (this.getEstrela().getPlanetas().isEmpty()) {
            System.out.println("Não possui planetas!");
        } else {
            System.out.println("----- Planetas -----");
            for (Planeta p : this.getEstrela().getPlanetas()) {
                p.dados(); // exibe os dados de cada planeta
            }
        }
        System.out.println("========================================");
    }
}
