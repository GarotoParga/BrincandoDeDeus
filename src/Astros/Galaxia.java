package Astros;

import java.util.ArrayList;
import java.util.List;

import Astros.Interstellar.SistemaEstelar;

public class Galaxia {
    private String nome;
    private Estrela estrela;
    private Planeta planeta;
    private Lua lua;
    private SistemaEstelar sistemaestelar;
    private List<SistemaEstelar> sistemaEstelar;

    // Construtor
    public Galaxia(String nome, SistemaEstelar sistemaEstelar) {
        this.setSistemaEstelar(new ArrayList<>());
        this.sistemaestelar.setMeuSistema(this);
    }

    public void adicionarSistema(SistemaEstelar sistemaEstelar) {
        this.getSistemaEstelar().add(sistemaEstelar);
    }

    public void mostrarDadosSimples() {
        System.out.println("----------Galaxia " + this.getNome() + " ----------");
        for (SistemaEstelar sistemaEstelarzinho : sistemaEstelar) {
            System.out.println("Nome: " + this.getSistemaEstelar());
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
