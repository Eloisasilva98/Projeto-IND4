package modelo;

public class Ator extends Artista {
    private String formacao;

    public Ator(String nome, String dataNascimento, String primeacoes, String genero, String formacao) {
        super(nome, dataNascimento, primeacoes, genero);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Ator{" +
                "formacao='" + formacao + '\'' +
                '}';
    }
}



