package modelo;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Midia> midia;
    private String ordemExecucao;
    private Midia midiaAtual;

    public Playlist(ArrayList<Midia> midia, String ordemExecucao, Midia midiaAtual) {
        this.midia = midia;
        this.ordemExecucao = ordemExecucao;
        this.midiaAtual = midiaAtual;
    }

    public ArrayList<Midia> getMidia() {
        return midia;
    }

    public void setMidia(ArrayList<Midia> midia) {
        this.midia = midia;
    }

    public String getOrdemExecucao() {
        return ordemExecucao;
    }

    public void setOrdemExecucao(String ordemExecucao) {
        this.ordemExecucao = ordemExecucao;
    }

    public Midia getMidiaAtual() {
        return midiaAtual;
    }

    public void setMidiaAtual(Midia midiaAtual) {
        this.midiaAtual = midiaAtual;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "midia=" + midia +
                ", ordemExecucao='" + ordemExecucao + '\'' +
                ", midiaAtual=" + midiaAtual +
                '}';
    }
}
