package modelo;

public class Artista {
    private String nome;
    private String dataNascimento;
    private String Primeacoes ;

    private String genero;




    public Artista(String nome, String dataNascimento, String primeacoes, String genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        Primeacoes = primeacoes;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPrimeacoes() {
        return Primeacoes;
    }

    public void setPrimeacoes(String primeacoes) {
        Primeacoes = primeacoes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Artista{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", Primeacoes='" + Primeacoes + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}

