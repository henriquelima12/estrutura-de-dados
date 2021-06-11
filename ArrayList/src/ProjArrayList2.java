import java.util.*;

public class ProjArrayList2 {
    public static void main(String[] args) {
        ArrayList<Livro> lista = new ArrayList();
        
        Scanner entrada = new Scanner(System.in);
        String ISBNaux;
        String tituloAux;
        int paginasAux;
        for(int i=1; i<=5; i++){
            System.out.println("\nDigite os dados do livro "+i);
            System.out.print("ISBN: ");
            ISBNaux = entrada.nextLine();
            System.out.print("Título: ");
            tituloAux = entrada.nextLine();
            System.out.print("Número de páginas: ");
            paginasAux = entrada.nextInt(); entrada.nextLine();
            lista.add(new Livro(ISBNaux, tituloAux, paginasAux));
        }
            
            System.out.println("\nLista de livros:");
            for(int j=0; j<lista.size(); j++){
                Livro aux = lista.get(j);
                aux.MostraLivro();
                System.out.println(" ");
            }        
    }
}
