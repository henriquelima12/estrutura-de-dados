public class Node {
    String nomeAnimal;     
    Node next;        
    
    public Node(String nomeAnimal) {       
        this.nomeAnimal = nomeAnimal;
        next = null;
    }
    
    public void mostraAnimal(){
        System.out.println("Animal: " + nomeAnimal);
    }
}