package modelo;

import java.util.ArrayList;

public class Filme extends Midia{
    private double duracao;
    private String tipo;
    private ArrayList<Ator> elenco;
    private String diretor;
    private String produtor;

    public Filme(String titulo, int ano, String genero, double duracao, String tipo, ArrayList<Ator> elenco, String diretor, String produtor) {
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.tipo = tipo;
        this.elenco = elenco;
        this.diretor = diretor;
        this.produtor = produtor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Ator> getElenco() {
        return elenco;
    }

    public void setElenco(ArrayList<Ator> elenco) {
        this.elenco = elenco;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "duracao=" + duracao +
                ", tipo='" + tipo + '\'' +
                ", elenco=" + elenco +
                ", diretor='" + diretor + '\'' +
                ", produtor='" + produtor + '\'' +
                '}';
    }
}
