package Astros;

import java.util.ArrayList;
import java.util.List;

import Astros.Interstellar.SistemaEstelar;

public class Galaxia {
    private String nome;
    private int idade;
    private Estrela estrela;
    private Planeta planeta;
    private Lua lua;
    private SistemaEstelar sistemaEstelarObjEstelar;
    private List<SistemaEstelar> sistemaEstelar;

    // Construtor
    public Galaxia(String nome, SistemaEstelar sistemaEstelar) {
        this.setNome(nome);
        this.sistemaEstelarObjEstelar = sistemaEstelar;
        this.setSistemaEstelar(new ArrayList<>());
        if (sistemaEstelar.getMinhaGalaxia() == null) {
            this.getSistemaEstelar().add(sistemaEstelar);
            sistemaEstelar.setMinhaGalaxia(this);
        } else {
            System.out.println("Impossível vincular Galaxia " + this.nome + " no Sistema "
                    + this.sistemaEstelarObjEstelar.getNome() + ".");
            System.out.println("Sistema " + this.sistemaEstelarObjEstelar.getNome() + " está vinculada a Galaxia "
                    + this.sistemaEstelarObjEstelar.getMinhaGalaxia().getNome() + ".");
        }
    }

    public void adicionarSistema(SistemaEstelar sistemaEstelar) {
        if (sistemaEstelar.getMinhaGalaxia() == null) {
            this.getSistemaEstelar().add(sistemaEstelar);
            sistemaEstelar.setMinhaGalaxia(this);
        } else {
            System.out.println("Impossível vincular Galaxia " + this.nome + " no Sistema "
                    + this.sistemaEstelarObjEstelar.getNome() + ".");
            System.out.println("Sistema " + this.sistemaEstelarObjEstelar.getNome() + " está vinculada a Galaxia "
                    + this.sistemaEstelarObjEstelar.getMinhaGalaxia().getNome() + ".");
        }

    }

    public void mostrarDadosSimples() {
        System.out.println("----------Galaxia " + this.getNome() + " ----------");
        if (this.getSistemaEstelar().size() > 1) {
            System.out.println("Possuindo " + this.sistemaEstelar.size() + " Sistemas Estelares.");
            for (int i = 0; i < sistemaEstelar.size(); i++) {
                System.out.println((i + 1) + "-Sistema Estelar: " + sistemaEstelar.get(i).getNome());
                sistemaEstelar.get(i).exibirSistema();
            }
        } else {
            System.out.println("Possuindo " + this.sistemaEstelar.size() + " Sistema Estelar.");
            System.out.println("Sistema Estelar: " + sistemaEstelarObjEstelar.getNome());
            sistemaEstelarObjEstelar.exibirSistema();
        }
    }

    public void mostrarDadosComplexos() {
        System.out.println("----------Galaxia " + this.getNome() + " ----------");
        if (this.getSistemaEstelar().size() > 1) {
            System.out.println("Possuindo " + this.sistemaEstelar.size() + " Sistemas Estelares.");
            for (int i = 0; i < sistemaEstelar.size(); i++) {
                System.out.println((i + 1) + "-Sistema Estelar: " + sistemaEstelar.get(i).getNome());
                sistemaEstelar.get(i).exibirSistemaComDados();
            }
        } else {
            System.out.println("Possuindo " + this.sistemaEstelar.size() + " Sistema Estelar.");
            System.out.println("Sistema Estelar: " + sistemaEstelarObjEstelar.getNome());
            sistemaEstelarObjEstelar.exibirSistemaComDados();
        }
    }

    // Métodos acessores e Modificadores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estrela getEstrela() {
        return estrela;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public Lua getLua() {
        return lua;
    }

    public List<SistemaEstelar> getSistemaEstelar() {
        return sistemaEstelar;
    }

    public void setSistemaEstelar(List<SistemaEstelar> sistemaEstelar) {
        this.sistemaEstelar = sistemaEstelar;
    }

}
