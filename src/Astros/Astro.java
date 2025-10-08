package Astros;

import java.text.DecimalFormat;

public abstract class Astro {
    protected String nome;
    protected long idade;
    protected String tipoDeAstro;
    protected double tamanho;
    protected double massa;
    protected double temperatura;
    protected String forma;

    DecimalFormat formatoDeNumeros = new DecimalFormat("#,###.##");
    DecimalFormat formatoDeNumerosCientifico = new DecimalFormat("#,###.E0");

    public void dados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + formatoDeNumeros.format(this.getIdade()) + " anos de idade.");
        System.out.println("Tipo de Astro: " + this.getTipoDeAstro());
        System.out.println("Tamanho: " + formatoDeNumeros.format(this.getTamanho()) + " Km.");
        System.out.println("Massa: " + formatoDeNumerosCientifico.format(this.getMassa()) + " Kg.");
        System.out.println("Temperatura: " + formatoDeNumeros.format(this.getTemperatura()) + " K.");
        System.out.println("forma: " + this.getForma());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getIdade() {
        return idade;
    }

    public String getTipoDeAstro() {
        return tipoDeAstro;
    }

    public void setTipoDeAstro(String tipoDeAstro) {
        this.tipoDeAstro = tipoDeAstro;
    }

    public void setIdade(long idade) {
        this.idade = idade;
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

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

}
