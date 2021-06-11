import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício DoubleList:");
        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("Brasil");
        nomes.add("Argentina");
        nomes.add("Uruguai");
        nomes.add("Chile");
        System.out.println("\nArray antes da duplicação dos elementos:");
        System.out.println(nomes);
        System.out.println("\nArray depois da duplicação dos elementos:");
        ArrayList<String> resultNomes = DoubleList.duplica(nomes);
        System.out.println(resultNomes);
        
        System.out.println("\n\nExercício RemoveDuplicate:");
        ArrayList <String> nomes2 = new ArrayList<>();
        nomes2.add("Brasil");
        nomes2.add("Argentina");
        nomes2.add("Uruguai");
        nomes2.add("Uruguai");
        nomes2.add("Chile");
        nomes2.add("Chile");
        nomes2.add("Paraguai");              
        nomes2.add("Peru");       
        nomes2.add("Bolívia");
        nomes2.add("Colômbia");
        nomes2.add("Colômbia");
        
        System.out.println("\nArray antes da verificação de elementos duplicados:");
        System.out.println(nomes2);
        System.out.println("\nArray depois da verificação de elementos duplicados:");
        ArrayList<String> uniqueName = RemoveDuplicates.removeDuplicacao(nomes2);
        System.out.println(uniqueName);
       
    }
}
