import java.util.ArrayList;
/* 
Write a method doubleList that takes an ArrayList of Strings as a parameter and that replaces every string with two of that string. 
For example, if the list stores the values {"how", "are", "you?"} before the method is called, it should store the values 
{"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.
*/
public class DoubleList {
    public static ArrayList<String> duplica(ArrayList <String> nomes){
        for(int i=0; i<nomes.size(); i+=2){
            String nome = nomes.get(i);
            nomes.add(i+1, nome);
        }
        return nomes;
    }
}
