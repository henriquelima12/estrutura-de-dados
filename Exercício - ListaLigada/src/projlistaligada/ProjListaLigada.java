//Felipe Dantas Tavares - 32080549
//Henrique Lima Araújo - 32091702
package projlistaligada;

public class ProjListaLigada {
    public static void main(String[] args) {
        ListaLigada <String> lista1 = new ListaLigada();
        ListaLigada <Integer> lista2 = new ListaLigada();
        try {
            lista1.addFirst("Gato");
            lista1.addFirst("Cachorro");
            lista1.addFirst("Morcego");
            lista1.addLast("Boi");
            lista1.addBefore("Formiga", "Morcego");
            lista1.addBefore("Onça", "Boi");
            lista1.remove("Gato");
            lista1.mostraLista();
            System.out.println("");
            lista2.addFirst(1);
            lista2.addLast(2);
            lista2.addLast(4);
            lista2.addFirst(0);
            lista2.addBefore(-1, 0);
            lista2.addBefore(3, 4);
            lista2.remove(-1);
            lista2.mostraLista();
   
        }
        catch (Exception e) {
            System.out.println(e.getMessage());    
        }
    }  
    
}
