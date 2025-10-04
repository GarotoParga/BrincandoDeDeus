package Astros.Interstellar;

import java.util.ArrayList;
import java.util.List;

import Astros.Estrela;
import Astros.Galaxia;
import Astros.Lua;
import Astros.Planeta;

public class SistemaEstelar {
    private String nome;
    private Estrela estrela;
    private Lua lua;
    private List<Planeta> planetas;
    private List<Estrela> estrelas;
    private Galaxia galaxia;

    public SistemaEstelar(String nome, Estrela estrela) {
        this.nome = nome;
        this.estrela = estrela;
        this.planetas = new ArrayList<>();
        this.estrelas = new ArrayList<>();
        estrela.setMeuSistema(this);
        estrelas.add(estrela);
    }

    public void adicionarPlanetaNoSistema(Planeta planeta) {
        planetas.add(planeta);
    }

    public void adicionarEstrelaNoSistema(Estrela estrela) {
        estrelas.add(estrela);
        if (estrela.getPlanetas() != null) {
            for (Planeta planeta : estrela.getPlanetas()) {
                planetas.add(planeta);
            }
        }
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

    public void setMinhaGalaxia(Galaxia galaxia) {
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
        if (this.estrelas.size() > 1) {
            int i = 1;
            for (Estrela estrela : estrelas) {
                System.out.println(i + "---Estrela: " + estrela.getNome());
                i++;
            }
        } else {
            System.out.println("---Estrela: " + estrela.getNome());
        }
        if (this.getEstrela().getPlanetas().isEmpty()) {
            System.out.println("Não possui planetas!");
        } else {
            System.out.println("----- Planetas -----");
            for (Planeta p : this.getEstrela().getPlanetas()) {
                int iPlan = 1;
                System.out.println(iPlan + "--Planeta: " + p.getNome());// exibe o nome de cada planeta
                iPlan++;
                if (p.isTemLuaEmOrbita()) {
                    for (Lua lua : p.getLuas()) {
                        int i = 1;
                        System.out.println("   " + i + "-Lua de " + p.getNome() + ": " + lua.getNome());
                        i++;

                    }
                }
            }
        }
        System.out.println("========================================");
    }

    public void exibirSistemaComDados() {
        System.out.println("==== Sistema: " + this.nome + " ====");
        if (this.estrelas.size() > 1) {
            int i = 1;
            for (Estrela estrela : estrelas) {
                System.out.println(i + "---Estrela: " + estrela.getNome());
                i++;
                estrela.dados();
            }
        } else {
            System.out.println("---Estrela: " + estrela.getNome());
            estrela.dados();
        }
        if (this.getEstrela().getPlanetas().isEmpty()) {
            System.out.println("Não possui planetas!");
        } else {
            System.out.println("----- Planetas -----");
            for (Planeta p : this.getEstrela().getPlanetas()) {
                int iPlan = 1;
                System.out.println(iPlan + "--Planeta: " + p.getNome());
                iPlan++;
                p.dados(); // exibe os dados de cada planeta
                if (p.isTemLuaEmOrbita()) {
                    for (Lua lua : p.getLuas()) {
                        int i = 1;
                        System.out.println("   " + i + "-Lua de " + p.getNome() + ": " + lua.getNome());
                        lua.dados();
                        i++;

                    }
                }
            }
        }
        System.out.println("========================================");
    }
}
