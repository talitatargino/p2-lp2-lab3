import java.util.Scanner;
public class Main{
    public static void main(String [] args) {
        FilmNow sistema = new FilmNow();
        Scanner sc = new Scanner(System.in);
        String opcao= "";

        while(!opcao.equals("S")){
            System.out.println(sistema.exibeMenu());
            System.out.print("Opção> ");
            opcao = sc.nextLine().trim().toUpperCase();
            if (!opcao.equals("A") && !opcao.equals("M") && !opcao.equals("D") && !opcao.equals("S")){
                System.out.println("OPÇÃO INVÁLIDA.");
                continue;
            }
            if (opcao.equals("A")){
                System.out.print("Posição> ");
                int posicao = Integer.parseInt(sc.nextLine());
                if (posicao<1 || posicao>100){
                    System.out.println("POSIÇÃO INVÁLIDA");
                    continue;
                }
                else{
                    System.out.print("Nome> ");
                    String nome = sc.nextLine();
                    System.out.print("Ano> ");
                    int anoLancamento = Integer.parseInt(sc.nextLine());
                    System.out.print("Local> ");
                    String local = sc.nextLine();
                    System.out.println(sistema.adicionaFilme(posicao , nome, anoLancamento, local));
                }
            }
            if (opcao.equals("M")){
                System.out.println(sistema.mostrarTodos());
            }
            if (opcao.equals("D")){
                System.out.print("Posição> ");
                int posicao = Integer.parseInt(sc.nextLine());
                if (posicao<1 || posicao>100) {
                    System.out.println("POSIÇÃO INVÁLIDA");
                    continue;
                }
                System.out.println(sistema.detalharFilme(posicao));
            }
        }
    }
}