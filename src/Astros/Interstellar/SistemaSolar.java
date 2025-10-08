package Astros.Interstellar;

import Astros.Estrela;

public class SistemaSolar extends SistemaEstelar{

    public SistemaSolar(String nome, long idade, Estrela estrela) {
        super(nome, idade, estrela);
        super.exibirSistemaComDados();
    }

}