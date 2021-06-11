public class Item {
    String descricao;
    double preco;
    int qtd;

    public Item(String descricao, double preco, int qtd) {
        this.descricao = descricao;
        this.preco = preco;
        this.qtd = qtd;
    }
    
    public double calcSubTotal(){
        return preco * qtd;
    }
    
    public void mostraItem(){
        System.out.print("\t"+descricao+"\t\t");
        System.out.print("\t"+preco+"\t\t");
        System.out.print(qtd+"\t\t");
        System.out.print("\t"+calcSubTotal());
    }
}
