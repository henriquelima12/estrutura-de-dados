import java.util.*;

public class ProjArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList();
        
        for(int i=0; i<=12; i++){
            num.add(i);
        }
        
        int soma = 0;
        System.out.println("Os inteiros são:");
        for(int i=0; i<num.size(); i++){
            System.out.println(num.get(i) +" ");
            soma+=num.get(i);
        }
        
        System.out.println("Soma dos valores: " +soma);
    }
}
