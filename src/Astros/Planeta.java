package Astros;

public class Planeta implements Astros {
    private String nome; // Terra, Marte...
    private double raio; // Em Km
    private double massa; // Em Kg
    private String tipoDePlaneta; // Rochoso, Gasoso, Gelo, oceânico...
    private boolean temLuaEmOrbita; // Possui uma lua em sua orbita?
    private int quantidadeDeLuasEmOrbita;
    private Lua[] luas;
    private Estrela orbitandoEstrela; // Lua, Europa, Ganimede...
    private double distanciaDaEstrela; // Em Km

    public Planeta(String nome, double raio, double massa, String tipoDePlaneta) {
        this.setNome(nome);
        this.setRaio(raio);
        this.setMassa(massa);
        this.setTipoDePlaneta(tipoDePlaneta);
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

    public Estrela getOrbitandoEstrela() {
        return orbitandoEstrela;
    }

    public double getDistanciaDaEstrela() {
        return distanciaDaEstrela;
    }

    public Lua getLuas(int i) {
        return this.luas[i];
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
    }

    public void setOrbitandoEstrela(Estrela orbEstrela) {
        this.orbitandoEstrela = orbEstrela;
    }

    public void setDistanciaDaEstrela(double distanciaDaEstrela) {
        this.distanciaDaEstrela = distanciaDaEstrela;
    }

    public void setLuas(int i, Lua lua) {
        this.luas[i] = lua;
    }

    @Override
    public void dados() {
        System.out.println("-----DETALHES DO PLANETA-----");
        System.out.println("Nome do Planeta: " + this.getNome());
        System.out.println("Raio do planeta: " + this.getRaio() + "Km.");
        System.out.println("Massa do planeta: " + this.getRaio() + "Kg.");
        System.out.println("Planeta do tipo: " + this.getTipoDePlaneta());
        if (this.isTemLuaEmOrbita()) {
            if (this.getQuantidadeDeLuasEmOrbita() == 1) {
                System.out.println(
                        "O planeta " + " possui uma lua, chamada " + this.getLuas(0).getNome() + " em orbita.");
            } else {
                System.out.println("O planeta possui " + this.getQuantidadeDeLuasEmOrbita() + " luas em orbitas.");
                for (int i = 0; i <= this.getQuantidadeDeLuasEmOrbita(); i++) {
                    System.out.println(i + "Lua: " + this.getLuas(i).getNome());
                }
            }
        } else {
            System.out.println("O planeta " + this.getNome() + " não possui uma lua em orbita.");
        }
        System.out.println("O planeta está orbitando a estrela " + this.getOrbitandoEstrela().getNome());
        System.out.println("Distância do planeta até a estrela "
                + this.getOrbitandoEstrela().getNome() + " é de " + this.getRaio() + "Km.");
        System.out.println("----------");
    }

    @Override
    public void compararTamanho(Planeta planeta) {
        if (this.getRaio() > planeta.getRaio()) {
            System.out.println("O planeta " + this.getNome() + " é maior que o planeta " + planeta.getNome());
            System.out.println(
                    "Possuindo um tamanho de " + this.getRaio() + "Km." + " Enquanto o planeta " + planeta.getNome()
                            + " possui um tamamho de " + planeta.getRaio() + "km.");
        } else {
            System.out.println("O planeta " + this.getNome() + " é menor que o planeta " + planeta.getNome());
            System.out.println("Enquanto o planeta " + this.getNome() + " possui um tamanho de " + this.getRaio()
                    + "Km." + " O planeta " + planeta.getNome()
                    + " possui um tamamho de " + planeta.getRaio() + "km.");
        }
    }

}
