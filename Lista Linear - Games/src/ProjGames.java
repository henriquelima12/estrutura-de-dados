/*
#Felipe Dantas Tavares - 32080549
#Henrique Lima Araújo - 32091702
*/
public class ProjGames {
    public static void main(String[] args) {
        Vetor scores = new Vetor(10);
        try{
            
            scores.achaPos(new Gamer("Carlos" ,625));
            scores.achaPos(new Gamer("João" ,700));
            scores.achaPos(new Gamer("Pedro" ,650));
            scores.achaPos(new Gamer("Paulo" ,850));
            scores.achaPos(new Gamer("Henrique" ,1000));
            
            Gamer[] aux = scores.getArray();
            for(int i=0; i<scores.size(); i++)
                System.out.println(aux[i]);
            
            int resp = scores.search("João");
            if(resp == -1)
                System.out.println("O nome João não existe na lista");
            else
                System.out.println("O nome João está na posição " +resp);
            
            scores.remove(3);
            aux = scores.getArray();
            System.out.println("\nApós remoção:");
            for(int i=0; i<scores.size(); i++)
                System.out.println(aux[i]+ " - ");
                       
            scores.set(2, new Gamer("Felipe", 1400));
            aux = scores.getArray();
            System.out.println("\nApós substituição:");
            for(int i=0; i<scores.size(); i++)
            System.out.println(aux[i]+ " - ");
            
            
                      
        }catch(Exception e){
            System.out.println("Erro:" +e.getMessage());
        }
    }
}
