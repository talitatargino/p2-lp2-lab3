public class Filme {
    private String nome;
    private int anoLancamento;
    private String local;
    private String status;
    public Filme(String nome, int anoLancamento, String local){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.local = local;
        this.status = "naoHot";
    }
    public String detalharFilme(){
        if (getStatus().equals("naoHot")){
        return (getNome() + ", " + getAnoLancamento()+ "\n" + getLocal());
        }
        else{
            return ( "\uD83D\uDD25" + getNome() + ", " + getAnoLancamento()+ "\n" + getLocal());
        }
    }
    public void setStatus(String novoStatus){
        this.status = novoStatus;
    }

    public String getStatus() {
        return status;
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
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nome.toLowerCase(), anoLancamento);
    }
}
