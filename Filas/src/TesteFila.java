
public class TesteFila {
    public static void main(String[] args) throws Exception {
         Fila f1 = new Fila(10);
         f1.enqueue("Maria");
         f1.enqueue("João");
         f1.enqueue("Pedro");
         System.out.println("Quantidade de pessoas na fila: " +f1.size());
         System.out.println("Primera pessoa da fila: " +f1.front());
         f1.dequeue();
         System.out.println("Primera pessoa da fila: " +f1.front());
         f1.dequeue();
         f1.dequeue();
         System.out.println("Quantidade de pessoas na fila: " +f1.size());
         f1.dequeue();       
    }
   
    
}
