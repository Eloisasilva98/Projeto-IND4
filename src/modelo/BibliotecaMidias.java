package modelo;

import java.util.ArrayList;

public class BibliotecaMidias extends Playlist {
    private ArrayList<Midia> midia;
    private String usuario;
    private Playlist playlist;


    public BibliotecaMidias(ArrayList<Midia> midia, String ordemExecucao, Midia midiaAtual, ArrayList<Midia> midia1, String usuario, Playlist playlist) {
        super(midia, ordemExecucao, midiaAtual);
        this.midia = midia1;
        this.usuario = usuario;
        this.playlist = playlist;
    }

    @Override
    public ArrayList<Midia> getMidia() {
        return midia;
    }

    @Override
    public void setMidia(ArrayList<Midia> midia) {
        this.midia = midia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
}
