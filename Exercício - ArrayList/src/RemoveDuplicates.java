import java.util.ArrayList;
/* 
Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings and that eliminates any duplicates from 
the list. For example, suppose that a variable called list contains the following values: 
{"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"} After calling removeDuplicates(list); the list 
should store the following values: {"be", "is", "not", "or", "question", "that", "the", "to"}

Because the values will be sorted, all of the duplicates will be grouped together.
*/
public class RemoveDuplicates {
    public static ArrayList<String> removeDuplicacao(ArrayList <String> nomes){
        for(int i=0; i<nomes.size()-1; i++){
            String nome = nomes.get(i);
            if(nome.equals(nomes.get(i+1))){
                nomes.remove(i+1);
            }
        }
        return nomes;
    }
}
