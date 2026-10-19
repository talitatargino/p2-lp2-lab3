import java.util.Arrays;
import java.util.Scanner;
public class FilmNow {
    private int idf;
    private Filme [] filmes;
    private Filme [] hotList;
    private static final int CAPACIDADE_MAXIMA = 100;
    private static final int CAPACIDADE_HOTLIST = 10;
    Scanner sc = new Scanner(System.in);
    public FilmNow(){
        this.filmes = new Filme[CAPACIDADE_MAXIMA];
        this.hotList = new Filme[CAPACIDADE_HOTLIST];
        this.idf = 0;
    }
    public String exibeMenu(){
        return  "(A)Adicionar filme\n" +
                "(M)Mostrar todos\n" +
                "(D)Detalhar filme   \n" +
                "(E)Exibir HotList\n" +
                "(H)Atribuir Hot\n" +
                "(R)Remover Hot\n" +
                "(S)Sair\n";
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
                    saida+=  i + " - " + filmes[i].getNome()+ "\n";
            }
        }
        return saida;
    }
    public String detalharFilme(int posicao){
        return filmes[posicao].detalharFilme();
    }
    public String adicionarHot(int posicao, int posicaoHot){
        filmes[posicao].setStatus("hot");
        hotList[posicaoHot] = filmes[posicao];
        return "ADICIONADO À HOTLIST NA POSIÇÃO "+ posicaoHot;
    }
    public void removeHot(int posicao){
        filmes[posicao].setStatus("naoHot");
        for (int j =0; j<10; j++){
            if (filmes[posicao].equals(hotList[j])){
                hotList[j] = null;
            }
        }
    }
    public String exibirHotList(){
        String saida = "";
        for (int i =00; i<10 ; i++){
            if (hotList[i]!=null){
                saida += i+ "- " + hotList[i].getNome()+ ", "+ hotList[i].getAnoLancamento()+ "\n";
            }
        }
        return saida;
    }
}
