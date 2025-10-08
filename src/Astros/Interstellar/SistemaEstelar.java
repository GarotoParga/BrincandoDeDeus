package Astros.Interstellar;

import java.util.ArrayList;
import java.util.List;

import Astros.Estrela;
import Astros.Galaxia;
import Astros.Lua;
import Astros.Planeta;

public class SistemaEstelar {
    protected String nome;
    protected long idade;
    protected Estrela estrela;
    protected Lua lua;
    protected List<Planeta> planetas;
    protected List<Estrela> estrelas;
    protected Galaxia galaxia;

    public SistemaEstelar(String nome, long idade, Estrela estrela) {
        this.setNome(nome);
        this.setIdade(idade);
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
            planetas.addAll(estrela.getPlanetas());
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
            int iPlan = 1;
            for (Planeta p : this.getEstrela().getPlanetas()) {
                System.out.println(iPlan + "--Planeta: " + p.getNome());
                iPlan++;
                if (p.isTemLuaEmOrbita()) {
                    int i = 1;
                    for (Lua lua : p.getLuas()) {
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
                estrela.dados();
                i++;
            }
        } else {
            System.out.println("---Estrela: " + estrela.getNome());
            estrela.dados();
        }
        if (this.getEstrela().getPlanetas().isEmpty()) {
            System.out.println("Não possui planetas!");
        } else {
            System.out.println("----- Planetas -----");
            int iPlan = 1;
            for (Planeta p : this.getEstrela().getPlanetas()) {
                System.out.println(iPlan + "--Planeta: " + p.getNome());
                p.dados(); // exibe os dados de cada planeta
                iPlan++;
                if (p.isTemLuaEmOrbita()) {
                    int i = 1;
                    for (Lua lua : p.getLuas()) {
                        System.out.println("   " + i + "-Lua de " + p.getNome() + ": " + lua.getNome());
                        lua.dados();
                        i++;

                    }
                }
            }
        }
        System.out.println("========================================");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(long idade) {
        this.idade = idade;
    }

    public void setEstrela(Estrela estrela) {
        this.estrela = estrela;
    }

    public void setPlanetas(List<Planeta> planetas) {
        this.planetas = planetas;
    }

    public void setEstrelas(List<Estrela> estrelas) {
        this.estrelas = estrelas;
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

    public long getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Lua getLua() {
        return lua;
    }

    public void setLua(Lua lua) {
        this.lua = lua;
    }

    public List<Planeta> getPlanetas() {
        return planetas;
    }

    public List<Estrela> getEstrelas() {
        return estrelas;
    }

    public Galaxia getGalaxia() {
        return galaxia;
    }

    public void setGalaxia(Galaxia galaxia) {
        this.galaxia = galaxia;
    }

}
