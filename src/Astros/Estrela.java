package Astros;

import java.text.DecimalFormat;

public class Estrela implements Astros {
    private String nome; // Sol...
    private double raio; // Em Km
    private double tamanho;
    private double massa; // Em Kg
    private double luminosidade; // Em Watts
    private double temperaturaDaSuperficie; // Em Kelvin
    private int quantidadeDePlanetasEmOrbita = 0;// Quantos planetas orbitam essa estrela
    private Planeta[] planetas;

    DecimalFormat formatoDeNumeros = new DecimalFormat("#,###.##");
    DecimalFormat formatoDeNumerosCientifico = new DecimalFormat("#,###.E0");

    public Estrela(String nome, double tamanho, double massa, double luminosidade, double temperaturaDaSuperficie,
            int maxPlanetas) {
        this.setNome(nome);
        this.setTamanho(tamanho);
        this.setMassa(massa);
        this.setLuminosidade(luminosidade);
        this.setTemperaturaDaSuperficie(temperaturaDaSuperficie);
        this.planetas = new Planeta[maxPlanetas];
    }

    public String getNome() {
        return nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getRaio() {
        return raio;
    }

    public double getMassa() {
        return massa;
    }

    public double getLuminosidade() {
        return luminosidade;
    }

    public double getTemperaturaDaSuperficie() {
        return temperaturaDaSuperficie;
    }

    public int getQuantidadeDePlanetasEmOrbita() {
        return quantidadeDePlanetasEmOrbita;
    }

    public Planeta getPlanetas(int i) {
        return planetas[i];
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setLuminosidade(double luminosidade) {
        this.luminosidade = luminosidade;
    }

    public void setTemperaturaDaSuperficie(double temperaturaDaSuperficie) {
        this.temperaturaDaSuperficie = temperaturaDaSuperficie;
    }

    public void setQuantidadeDePlanetasEmOrbita(int quantidadeDePlanetasEmOrbita) {
        this.quantidadeDePlanetasEmOrbita = quantidadeDePlanetasEmOrbita;
    }

    public void setPlanetas(int i, Planeta planeta) {
        this.planetas[i] = planeta;
    }

    public void adicionarPlaneta(Planeta planeta) {
        if (this.getQuantidadeDePlanetasEmOrbita() < planetas.length) {
            this.planetas[this.getQuantidadeDePlanetasEmOrbita()] = planeta;
            this.setQuantidadeDePlanetasEmOrbita(this.getQuantidadeDePlanetasEmOrbita() + 1);
        }
    }

    @Override
    public void dados() {
        System.out.println("----------DETALHES DA ESTRELA----------");
        System.out.println("Nome da estrela: " + this.getNome());
        System.out.println("Tamanho da estrela: " + formatoDeNumeros.format(this.getTamanho()) + " Km.");
        System.out.println("Massa da estrela: " + formatoDeNumerosCientifico.format(this.getMassa()) + " Kg.");
        System.out.println("Estrela com luminosidade de " + formatoDeNumeros.format(this.getLuminosidade()) + " W.");
        System.out.println("Estrela com temperatura de " + formatoDeNumeros.format(this.getTemperaturaDaSuperficie() )+ " K.");
        if (this.getQuantidadeDePlanetasEmOrbita() == 1) {
            System.out.println(
                    "A estrela possui um planeta chamado: " + planetas[0].getNome() + ", em orbita.");
        } else if (this.getQuantidadeDePlanetasEmOrbita() > 1) {
            System.out.println("A estrela possui " + this.getQuantidadeDePlanetasEmOrbita() + " planetas em orbita.");
            for (int i = 0; i < this.getQuantidadeDePlanetasEmOrbita(); i++) {
                System.out.println((i + 1) + "-Planeta: " + planetas[i].getNome());
            }
        } else {
            System.out.println("A estrela " + this.getNome() + " não possui um planeta em orbita.");
        }
        System.out.println("----------------------------------------");
    }

    public void compararTamanho(Planeta planeta) {
    }

}
