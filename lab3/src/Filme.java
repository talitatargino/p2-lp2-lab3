public class Filme {
    private String nome;
    private int anoLancamento;
    private String local;
    public Filme(String nome, int anoLancamento, String local){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.local = local;
    }
    public String detalharFilme(String nome, int anoLancamento, String local){
        return (nome + ", " + anoLancamento+ "\n" + local);
    }
    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public boolean equals(Object o){
        if (o== null){
            return false;
        }
        if (!(o instanceof Filme)){
            return false;
        }
        Filme outro = (Filme) o;
        return this.nome.equalsIgnoreCase(outro.nome) && this.anoLancamento == outro.anoLancamento;
    }
}
