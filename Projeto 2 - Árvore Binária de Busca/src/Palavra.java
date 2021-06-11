public class Palavra {
    String palavra;
    int ocorrencias;
    Palavra left, right, parent;
    
    public Palavra(String palavra){
        this.palavra = palavra;
        ocorrencias = 1;
        left = right = parent = null;
    }
    
    public void mostraNo(){
        System.out.print(palavra + "(" +ocorrencias+ ")"+ " ");
    }  
}
