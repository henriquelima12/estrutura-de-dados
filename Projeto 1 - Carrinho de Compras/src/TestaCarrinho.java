//Felipe Dantas Tavares - 32080549
//Fernando Kradich Perez Barreto - 32047568
//Henrique Lima Araújo - 32091702
//Lucas Lima Xavier dos Santos - 32020724
import java.util.*;

public class TestaCarrinho {
    static Scanner entrada = new Scanner(System.in);
    static double totalCompra;
    static double totalDiario = 0;
    
    public static void main(String[] args) throws Exception{
        boolean sair = false;
        while(!sair){
            System.out.println("Menu Principal");
            System.out.println("1 - Iniciar Compra");
            System.out.println("2 - Exibir Total Diário");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");            
            int op;
            try {
                Scanner e = new Scanner(System.in);
                op = e.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("\nInsira um caractere válido\n");
                continue;
            }
            
            try{
                switch (op) {
                    case 1:
                        iniciaCompra();
                        break;
                    case 2:
                        totalDiario();
                        break;
                    case 3:
                        sair = true;
                        break;
                    default:
                        System.out.println("\nOpção Inválida\n");
                }   
            }catch(InputMismatchException e){
                System.out.println("\nValor inválido\n");
            }catch(IndexOutOfBoundsException e2){
                System.out.println("\nÍndice inválido\n");
            }                              
        }    
    }
    
    public static void iniciaCompra() throws Exception{
        totalCompra = 0;
        boolean insereItem = true;
        boolean excluiItem = true;
        int item = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList <Item> listaDeItens = new ArrayList<>();
        Carrinho carrinho = new Carrinho(listaDeItens, 10);
        while (insereItem) {
            System.out.println("\nItem " + (item + 1));
            System.out.print("Descrição: ");
            String descricao = scan.next(); 
            System.out.print("Preço: ");
            double preco = scan.nextDouble();
            System.out.print("Quantidade: ");
            int qtd = scan.nextInt();
            Item itemCompra = new Item(descricao, preco, qtd);
            listaDeItens.add(itemCompra);
            boolean verificaResp = false;
            while (!verificaResp) {
                System.out.print("Deseja Adicionar outro produto? (s/n): ");
                String adc = entrada.next();
                switch (adc) {
                    case "s":
                        item = item + 1;
                        verificaResp = true;
                        break;
                    case "n":
                        insereItem = false;
                        verificaResp = true;
                        break;
                    default:
                        System.out.println("\nResposta Inválida\n");
                }
            }
        }
        carrinho.mostraCarrinho();
        
        do {           
            System.out.print("\nDeseja excluir algum item do carrinho? (s/n): ");
            String exc = entrada.next();
            System.out.println(" ");
            switch (exc) {
                case "s":
                    System.out.print("Informe o número do item que será excluído: ");
                    int indice = entrada.nextInt();
                    carrinho.excluiItem(indice - 1);
                    break;
                case "n":
                    excluiItem = false;
                    break;
                default:
                    System.out.println("Resposta Inválida");
            }
        }while (excluiItem);
        totalCompra+=carrinho.valorPagar;
        totalDiario+=totalCompra;
        finalizaCompra();
    }
    
    public static void totalDiario() throws Exception{ 
        System.out.printf("\nTotal arrecadado no dia: R$ %.2f\n" ,totalDiario);
        System.out.println("");
    }
    
    public static void finalizaCompra() throws Exception {
        boolean pagamento = false;
        double pagDinheiro = 0;
        do{
            System.out.print("Tipo de pagamento( Dinheiro = d / Cartão = c ): ");
            String tipoPag = entrada.next();           
            switch(tipoPag){
                case "d":
                    while(pagDinheiro<totalCompra){
                        System.out.print("\nInsira um valor maior ou igual ao valor total da compra");
                        System.out.print("\nValor recebido: R$ ");
                        pagDinheiro = entrada.nextDouble(); 
                    }
                    System.out.printf("Troco: R$ %.2f\n" ,(pagDinheiro - totalCompra));
                    System.out.println("");
                    pagamento = true;
                    break;
                case "c":
                    System.out.printf("Valor recebido: R$ %.2f\n"  ,totalCompra);
                    System.out.println("Troco: R$ 0,00\n");
                    pagamento = true;
                    break;
                default:
                    System.out.println("\nResposta Inválida\n");      
            }           
        }while(!pagamento);
    }
}
