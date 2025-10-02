package Astros;

import java.text.DecimalFormat;

public class Lua implements Astros {
    private String nome;
    private double raio;
    private double tamanho;
    private double massa;
    private Planeta orbitandoPlaneta;
    private double distanciaDoPlaneta;
    private Planeta planeta;

    DecimalFormat formatoDeNumeros = new DecimalFormat("#,###.##");
    DecimalFormat formatoDeNumerosCientifico = new DecimalFormat("#,###.E0");

    public Lua(String nome, double tamamho, double massa, Planeta planeta) {
        this.setNome(nome);
        this.setTamanho(tamamho);
        this.setMassa(massa);
        this.setPlaneta(planeta);
        planeta.adicionarLua(this);
    }

    public String getNome() {
        return nome;
    }

    public double getRaio() {
        return raio;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getMassa() {
        return massa;
    }

    public Planeta getOrbitandoPlaneta() {
        return orbitandoPlaneta;
    }

    public double getDistanciaDoPlaneta() {
        return distanciaDoPlaneta;
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

    public void setOrbitandoPlaneta(Planeta orbitandoPlaneta) {
        this.orbitandoPlaneta = orbitandoPlaneta;
    }

    public void setDistanciaDoPlaneta(double distanciaDoPlaneta) {
        this.distanciaDoPlaneta = distanciaDoPlaneta;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    @Override
    public void dados() {
        System.out.println("----------DETALHES DA LUA----------");
        System.out.println("Nome da lua: " + this.getNome());
        System.out.println("Tamanho da lua: " + formatoDeNumeros.format(this.getTamanho()) + " Km.");
        System.out.println("Massa da lua: " + formatoDeNumerosCientifico.format(this.getMassa()) + " Kg.");
        System.out.println("Orbitando planeta: " + this.getPlaneta().getNome());
        System.out.println("----------------------------------------");
    }

    public void compararTamanho(Planeta planeta) {
    }

}
