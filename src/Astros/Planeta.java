package Astros;

import java.text.DecimalFormat;

public class Planeta implements Astros {
    private String nome; // Terra, Marte...
    private double raio; // Em Km
    private double tamanho; // Em Km
    private double massa; // Em Kg
    private String tipoDePlaneta; // Rochoso, Gasoso, Gelo, oceânico...
    private boolean temLuaEmOrbita; // Possui uma lua em sua orbita?
    private int quantidadeDeLuasEmOrbita = 0;
    private Lua[] luas;
    private double distanciaDaEstrela; // Em Km
    private Estrela estrela;

    DecimalFormat formatoDeNumeros = new DecimalFormat("#,###.##");
    DecimalFormat formatoDeNumerosCientifico = new DecimalFormat("#,###.E0");

    public Planeta(String nome, double tamanho, double massa, String tipoDePlaneta, int maxLuas, Estrela estrela) {
        this.setNome(nome);
        this.setTamanho(tamanho);
        this.setMassa(massa);
        this.setTipoDePlaneta(tipoDePlaneta);
        this.luas = new Lua[maxLuas];
        this.setEstrela(estrela);
        estrela.adicionarPlaneta(this);
    }

    public Estrela getEstrela() {
        return estrela;
    }

    public void setEstrela(Estrela estrela) {
        this.estrela = estrela;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public double getRaio() {
        return raio;
    }

    public double getMassa() {
        return massa;
    }

    public String getTipoDePlaneta() {
        return tipoDePlaneta;
    }

    public boolean isTemLuaEmOrbita() {
        return temLuaEmOrbita;
    }

    public int getQuantidadeDeLuasEmOrbita() {
        return quantidadeDeLuasEmOrbita;
    }

    public double getDistanciaDaEstrela() {
        return distanciaDaEstrela;
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

    public void setTipoDePlaneta(String tipoDePlaneta) {
        this.tipoDePlaneta = tipoDePlaneta;
    }

    public void setTemLuaEmOrbita(boolean temLuaEmOrbita) {
        this.temLuaEmOrbita = temLuaEmOrbita;
    }

    public void setQuantidadeDeLuasEmOrbita(int quantidadeDeLuasEmOrbita) {
        this.quantidadeDeLuasEmOrbita = quantidadeDeLuasEmOrbita;
        if (this.getQuantidadeDeLuasEmOrbita() >= 1) {
            this.setTemLuaEmOrbita(true);
        }
    }

    public void setDistanciaDaEstrela(double distanciaDaEstrela) {
        this.distanciaDaEstrela = distanciaDaEstrela;
    }

    public void adicionarLua(Lua lua) {
        if (this.getQuantidadeDeLuasEmOrbita() < luas.length) {
            luas[this.getQuantidadeDeLuasEmOrbita()] = lua;
            this.setQuantidadeDeLuasEmOrbita(this.getQuantidadeDeLuasEmOrbita() + 1);
        } else {
            System.out.println("Planeta excedeu o limite possível de orbita.");
        }
    }

    @Override
    public void dados() {
        System.out.println("==========Planeta " + this.getNome() + "==========");
        System.out.println("Tamanho do planeta: " + formatoDeNumeros.format(this.getTamanho()) + " Km.");
        System.out.println("Massa do planeta: " + formatoDeNumerosCientifico.format(this.getMassa()) + " Kg.");
        System.out.println("Planeta do tipo: " + this.getTipoDePlaneta());
        if (this.isTemLuaEmOrbita()) {
            if (this.getQuantidadeDeLuasEmOrbita() == 1) {
                System.out.println(
                        "O planeta possui uma lua chamada: " + luas[0].getNome() + ", em orbita.");
            } else {
                System.out.println("O planeta possui " + this.getQuantidadeDeLuasEmOrbita() + " luas em orbita.");
                for (int i = 0; i < this.getQuantidadeDeLuasEmOrbita(); i++) {
                    System.out.println((i + 1) + "-Lua: " + luas[i].getNome());
                }
            }
        } else {
            System.out.println("O planeta " + this.getNome() + " não possui uma lua em orbita.");
        }
        System.out.println("O planeta está orbitando a estrela: " + this.getEstrela().getNome());
        System.out.println("----------------------------------------");
    }

    public void compararTamanho(Planeta planeta) {
        if (this.getRaio() > planeta.getRaio()) {
            System.out.println("O planeta " + this.getNome() + " é maior que o planeta " + planeta.getNome());
            System.out.println(
                    "Possuindo um tamanho de " + this.getRaio() + " Km." + " Enquanto o planeta " + planeta.getNome()
                            + " possui um tamamho de " + planeta.getRaio() + " km.");
        } else {
            System.out.println("O planeta " + this.getNome() + " é menor que o planeta " + planeta.getNome());
            System.out.println("Enquanto o planeta " + this.getNome() + " possui um tamanho de " + this.getRaio()
                    + " Km." + " O planeta " + planeta.getNome()
                    + " possui um tamamho de " + planeta.getRaio() + " km.");
        }
    }

}
