import java.util.Arrays;
import java.util.Scanner;
public class FilmNow {
    private int idf;
    private Filme [] filmes;
    private static final int CAPACIDADE_MAXIMA = 100;
    Scanner sc = new Scanner(System.in);
    public FilmNow(){
        this.filmes = new Filme[CAPACIDADE_MAXIMA];
        this.idf = 0;
    }
    public String exibeMenu(){
        return  " (A) Adicionar filme \n (M) Mostrar todos \n (D) Detalhar filme \n (S) Sair";
    }

    public String adicionaFilme(int posicao ,String nome,int anoLancamento, String local){
        if (nome== null || anoLancamento== 0){
            return "FILME INVALIDO";
        }
        Filme filmeRecebido= new Filme(nome, anoLancamento, local);

        for (int i = 0 ; i<100 ;i ++){
            if (filmes[i] != null && filmes[i].equals(filmeRecebido)){
                return "FILME JA ADICIONADO";
            }
        }
        filmes[posicao] = filmeRecebido;
        return "FILME ADICIONADO";
    }
    public String mostrarTodos(){
        String saida= "";
        for(int i = 0 ; i<100; i++){
            if (filmes[i]!= null){
                saida+= i + " - " + filmes[i].getNome()+ "\n";
            }
        }
        return saida;
    }
    public String detalharFilme(int posicao){
        return filmes[posicao].detalharFilme(filmes[posicao].getNome(), filmes[posicao].getAnoLancamento(), filmes[posicao].getLocal());
    }
}
