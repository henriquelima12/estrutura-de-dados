import java.util.*;

public class Carrinho{
    ArrayList <Item> listaItens = new ArrayList();
    double totalCompra;
    double porcDesconto;
    double valorPagar;

    public Carrinho(ArrayList <Item> listaItens, double porcDesconto) {
        this.listaItens = listaItens;
        totalCompra = 0;
        this.porcDesconto = porcDesconto;
        valorPagar = 0;
    }
    
    public void mostraCarrinho(){
        System.out.println("");
        System.out.print("\nItem\t\t");
        System.out.print("Descrição\t\t");
        System.out.print("Preço\t\t");
        System.out.print("Quantidade\t\t");
        System.out.print("SubTotal\n\t\t");
        System.out.println("");
        for(int i=0; i<listaItens.size(); i++){
            System.out.print((i+1)+"\t");
            listaItens.get(i).mostraItem();
            totalCompra+=listaItens.get(i).calcSubTotal();
            System.out.println("");
        }
        calcDesconto();
        valorPagar = totalCompra - calcDesconto();
        System.out.printf("\nSubTotal: %.2f\n" ,totalCompra);
        System.out.printf("Desconto: %.2f\n" ,calcDesconto());
        System.out.printf("Total a Pagar: %.2f\n" ,valorPagar);
        System.out.printf("\n");       
    }
    
    public double calcDesconto(){
        return totalCompra * porcDesconto / 100;
    }
    
    public void excluiItem(int i){
        listaItens.remove(i);
        totalCompra = 0;
        valorPagar = 0;
        mostraCarrinho();
    }
    
    
}
