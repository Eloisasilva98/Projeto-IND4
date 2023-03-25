package modelo;

public class Musico extends Artista {
    private String atuacao;


    public Musico(String nome, String dataNascimento, String primeacoes, String genero, String atuacao) {
        super(nome, dataNascimento, primeacoes, genero);
        this.atuacao = atuacao;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

    @Override
    public String toString() {
        return "Musico{" +
                "atuacao='" + atuacao + '\'' +
                '}';
    }
}
