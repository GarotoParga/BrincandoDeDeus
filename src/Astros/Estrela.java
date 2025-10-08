package Astros;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import Astros.Interstellar.SistemaEstelar;

public class Estrela extends Astro {
    private int quantidadeDePlanetasEmOrbita; 
    private List<Planeta> planetas;
    private SistemaEstelar sistemaEstelar;

    DecimalFormat formatoDeNumeros = new DecimalFormat("#,###.##");
    DecimalFormat formatoDeNumerosCientifico = new DecimalFormat("#,###.E0");

    public Estrela(String nome, long idade, String tipoDeAstro, double tamanho, double massa, double temperatura,
            String forma) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setTipoDeAstro(tipoDeAstro);
        this.setTamanho(tamanho);
        this.setMassa(massa);
        this.setTemperatura(temperatura);
        this.setForma(forma);
        this.setQuantidadeDePlanetasEmOrbita(0);
        this.planetas = new ArrayList<>();
    }

    public void adicionarPlanetaNaEstrela(Planeta planeta) {
        this.planetas.add(planeta);
        this.setQuantidadeDePlanetasEmOrbita(this.getQuantidadeDePlanetasEmOrbita() + 1);
    }

    public int getQuantidadeDePlanetasEmOrbita() {
        return quantidadeDePlanetasEmOrbita;
    }

    public List<Planeta> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(List<Planeta> planetas) {
        this.planetas = planetas;
    }

    public void setQuantidadeDePlanetasEmOrbita(int quantidadeDePlanetasEmOrbita) {
        this.quantidadeDePlanetasEmOrbita = quantidadeDePlanetasEmOrbita;
    }

    public SistemaEstelar getMeuSistema() {
        return sistemaEstelar;
    }

    public void setMeuSistema(SistemaEstelar sistemaEstelar) {
        if (this.getMeuSistema() == null) {
            this.sistemaEstelar = sistemaEstelar;
        } else {
            System.out.println("Impossível vincular Sistema " + sistemaEstelar.getNome() + " na Estrela "
                    + this.getNome() + ".");
            System.out.println("Estrela " + this.getNome() + " está vinculada ao Sistema "
                    + this.getMeuSistema().getNome() + ".");
        }
    }

    @Override
    public void dados() {
        System.out.println("---------- DETALHES DA ESTRELA ----------");
       super.dados();
        if (this.getQuantidadeDePlanetasEmOrbita() == 1) {
            System.out.println(
                    "A estrela possui um planeta chamado: "
                            + planetas.get(this.getQuantidadeDePlanetasEmOrbita() - 1).getNome() + ", em orbita.");
        } else if (this.getQuantidadeDePlanetasEmOrbita() > 1) {
            System.out.println("A estrela possui " + this.getQuantidadeDePlanetasEmOrbita() + " planetas em orbita.");
            for (int i = 0; i < this.getQuantidadeDePlanetasEmOrbita(); i++) {
                System.out.println((i + 1) + "-Planeta: " + planetas.get(i).getNome());
            }
        } else {
            System.out.println("A estrela " + this.getNome() + " não possui um planeta em orbita.");
        }
        System.out.println("----------------------------------------");
    }

}
