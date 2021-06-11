public class ProjPilha {
    public static void main(String[] args) throws Exception{
        Pilha dvds = new Pilha(10);
        dvds.push("Homem Aranha");
        dvds.push("Star Wars");
        dvds.push("Homem Aranha 2");
        
        System.out.println("Filme do topo: " +dvds.top());
        dvds.pop();
        System.out.println("Filme do topo após pop: " +dvds.top());
   
    }
}
