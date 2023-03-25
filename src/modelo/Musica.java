package modelo;

public class Musica extends Midia {
    private int duracao;
    private String artista;
    private int nota;

    @Override
    public String toString() {
        return "Musica{" +
                "duracao=" + duracao +
                ", artista='" + artista + '\'' +
                ", nota=" + nota +
                '}';
    }

    public Musica(String titulo, int ano, String genero, int duracao, String artista, int nota) {
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.artista = artista;
        this.nota = nota;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
