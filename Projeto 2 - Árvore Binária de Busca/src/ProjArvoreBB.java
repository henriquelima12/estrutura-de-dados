//Felipe Dantas Tavares - 32080549
//Fernando Kradich Perez Barreto - 32047568
//Henrique Lima Araújo - 32091702
//Lucas Lima Xavier dos Santos - 32020724
import java.io.*;
import java.util.*;

public class ProjArvoreBB {
    static Arvore tree = new Arvore();
    static int contador = 0;

    public static void main(String[] args) throws IOException { 
        boolean sair = false;
        while (!sair) {
            System.out.println("Menu Principal");
            System.out.println("1 - Carregar o texto");
            System.out.println("2 - Contador de palavras");
            System.out.println("3 - Busca por palavra");
            System.out.println("4 - Exibiçao do texto");
            System.out.println("5 - Encerrar");
            System.out.print("Escolha uma opção: ");
            int opcao;
            try {
                Scanner entrada = new Scanner(System.in);
                opcao = entrada.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Insira um caractere válido\n");
                continue;
            }
            
            switch (opcao) {
                case 1:
                    carregarTexto();
                    break;
                case 2:
                    System.out.println("Número de palavras na árvore: " +contador+"\n");
                    break;
                case 3:
                    System.out.print("Digite a palavra que deseja buscar na árvore: ");
                    Scanner scanner = new Scanner(System.in);
                    String p = scanner.next();
                    Palavra palavra = new Palavra(p);
                    Palavra result = tree.busca(palavra);
                    if(result == null){
                        System.out.println("Verifique se a palavra foi escrita corretamente ou se a árvore foi carregada\n");
                    }else{
                        result.mostraNo();
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    exibirTexto();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção Inválida\n");
            }
        }
    }
    
    public static void carregarTexto() throws IOException{
        FileReader data;
        try {
            data = new FileReader("musica.txt");
            BufferedReader linha = new BufferedReader(data);
            String aux = linha.readLine();
            while (aux != null) {
                String [] aux2 = aux.split(" ");
                for(int i = 0; i<aux2.length; i++){
                    Palavra p = new Palavra(aux2[i]);
                    if(tree.busca(p) == null){
                        tree.insere(new Palavra(aux2[i]));
                        contador++;
                    }else{
                        Palavra result = tree.busca(p);
                        result.ocorrencias++;
                    }   
                }
                aux = linha.readLine();
            }
            System.out.println("Texto Carregado\n");
            data.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de dados não encontrado!\n");
            System.exit(0);
        }        
    }
    
    public static void exibirTexto(){
        System.out.println("\nPercurso In-Ordem");
        tree.executaInOrdem(tree.root());
        System.out.println("\n");
    }
}
