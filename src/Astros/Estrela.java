package Astros;

public class Estrela {
    private String nome; // Sol...
    private double raio; // Em Km
    private double massa; // Em Kg
    private double luminosidade; // Em Watts
    private double temperaturaDaSuperficie; // Em Kelvin
    private int quantidadeDePlanetasEmOrbita; // Quantos planetas orbitam essa estrela
    private Planeta[] planetas;

    public Estrela(String nome, double raio, double massa, double luminosidade, double temperaturaDaSuperficie) {
        this.setNome(nome);
        this.setRaio(raio);
        this.setMassa(massa);
        this.setLuminosidade(luminosidade);
        this.setTemperaturaDaSuperficie(temperaturaDaSuperficie);
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

}
