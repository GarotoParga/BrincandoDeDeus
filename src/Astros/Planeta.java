package Astros;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Planeta extends Astro {
    private boolean temLuaEmOrbita; // Possui uma lua em sua orbita?
    private int quantidadeDeLuasEmOrbita;
    private List<Lua> luas;
    private Estrela estrela;

    DecimalFormat formatoDeNumeros = new DecimalFormat("#,###.##");
    DecimalFormat formatoDeNumerosCientifico = new DecimalFormat("#,###.E0");

    public Planeta(String nome, long idade, String tipoDeAstro, double tamanho, double massa, double temperatura ,String forma,
            Estrela estrela) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setTipoDeAstro(tipoDeAstro);
        this.setTamanho(tamanho);
        this.setMassa(massa);
        this.setTemperatura(temperatura);
        this.setForma(forma);
        this.setEstrela(estrela);
        this.setQuantidadeDeLuasEmOrbita(0);
        this.setTemLuaEmOrbita(false);
        estrela.adicionarPlanetaNaEstrela(this);
        this.luas = new ArrayList<>();
    }

    public void adicionarLua(Lua lua) {
        luas.add(lua);
        this.setQuantidadeDeLuasEmOrbita(this.getQuantidadeDeLuasEmOrbita() + 1);
        this.setTemLuaEmOrbita(true);
    }

    public Estrela getEstrela() {
        return estrela;
    }

    public void setEstrela(Estrela estrela) {
        this.estrela = estrela;
    }

    public boolean isTemLuaEmOrbita() {
        return temLuaEmOrbita;
    }

    public int getQuantidadeDeLuasEmOrbita() {
        return quantidadeDeLuasEmOrbita;
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

    public List<Lua> getLuas() {
        return luas;
    }

    public void setLuas(List<Lua> luas) {
        this.luas = luas;
    }

    @Override
    public void dados() {
        System.out.println("---------- DETALHES DO PLANETA ----------");
        super.dados();
        if (this.isTemLuaEmOrbita()) {
            if (this.getQuantidadeDeLuasEmOrbita() == 1) {
                System.out.println(
                        "O planeta possui uma lua chamada: " + luas.get(0).getNome() + ", em orbita.");
            } else {
                System.out.println("O planeta possui " + this.getQuantidadeDeLuasEmOrbita() + " luas em orbita.");
                for (int i = 0; i < this.getQuantidadeDeLuasEmOrbita(); i++) {
                    System.out.println((i + 1) + "-Lua: " + luas.get(i).getNome());
                }
            }
        } else {
            System.out.println("O planeta " + this.getNome() + " não possui uma lua em orbita.");
        }
        System.out.println("O planeta está orbitando a estrela: " + this.getEstrela().getNome());
        System.out.println("----------------------------------------");

    }

}
