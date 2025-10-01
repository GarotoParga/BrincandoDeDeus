package Astros;

public class Lua implements Astros{
    private String nome;
    private double raio;
    private double massa;
    private Planeta orbitandoPlaneta;
    private double distanciaDoPlaneta;


    public Lua(String nome, double raio, double massa){
        this.setNome(nome);
        this.setRaio(raio);
        this.setMassa(massa);
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


    @Override
    public void dados() {
        System.out.println("Nome da lua: " + this.getNome());
        System.out.println("Raio da lua: " + this.getRaio());
        System.out.println("Massa da lua: " + this.getMassa());
        System.out.println("Orbitando planeta: " + this.getOrbitandoPlaneta().getNome());
    }


    @Override
    public void compararTamanho(Planeta planeta) {
    }

}
