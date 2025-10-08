package Astros;

import java.text.DecimalFormat;

public class Lua extends Astro {
    private Planeta orbitandoPlaneta;
    private Planeta planeta;

    DecimalFormat formatoDeNumeros = new DecimalFormat("#,###.##");
    DecimalFormat formatoDeNumerosCientifico = new DecimalFormat("#,###.E0");

    public Lua(String nome, long idade, String tipoDeAstro, double tamamho, double massa, double temperatura, String forma,
            Planeta planeta) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setTipoDeAstro(tipoDeAstro);
        this.setTamanho(tamamho);
        this.setMassa(massa);
        this.setTemperatura(temperatura);
        this.setForma(forma);
        this.setPlaneta(planeta);
        planeta.adicionarLua(this);
    }

    public Planeta getOrbitandoPlaneta() {
        return orbitandoPlaneta;
    }

    public void setOrbitandoPlaneta(Planeta orbitandoPlaneta) {
        this.orbitandoPlaneta = orbitandoPlaneta;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    @Override
    public void dados() {
        System.out.println("---------- DETALHES DA LUA ----------");
        super.dados();
        System.out.println("Orbitando planeta: " + this.getPlaneta().getNome());
        System.out.println("----------------------------------------");
    }

}
