public class TestaLinkedList {
    public static void main(String[] args) throws Exception{
        
        LinkedList animais1 = new LinkedList();
        
        Node n1 = new Node("Boi");
        animais1.addFirst(n1);
        Node n2 = new Node("Jacaré");
        animais1.addLast(n2);
        Node n3 = new Node("Morcego");
        animais1.addLast(n3);
        Node n4 = new Node("Cachorro");
        animais1.addFirst(n4);
        System.out.println("Cabeça: " +animais1.first().nomeAnimal);
        System.out.println("Cauda: " +animais1.last().nomeAnimal);
        animais1.mostraLista();
        System.out.println("Qtd de nós: " +animais1.size());
        System.out.println("");
        Node n5 = new Node("Cobra");
        animais1.addAfter(n5, "Morcego");
        Node n6 = new Node("Macaco");
        animais1.addAfter(n6, "Cachorro");
        System.out.println("Cabeça: " +animais1.first().nomeAnimal);
        System.out.println("Cauda: " +animais1.last().nomeAnimal);
        animais1.mostraLista();
        System.out.println("Qtd de nós: " +animais1.size());
        System.out.println("");
        Node n7 = new Node("Camaleão");
        animais1.addBefore(n7, "Jacaré");
        Node n8 = new Node("Onça");
        animais1.addBefore(n8, "Boi");
        Node n9 = new Node("Foca");
        animais1.addAfter(n9, "Cobra");
        System.out.println("Cabeça: " +animais1.first().nomeAnimal);
        System.out.println("Cauda: " +animais1.last().nomeAnimal);
        animais1.mostraLista();
        System.out.println("Qtd de nós: " +animais1.size());
        System.out.println("");
        animais1.remove("Foca");
        animais1.remove("Cobra");
        System.out.println("Cabeça: " +animais1.first().nomeAnimal);
        System.out.println("Cauda: " +animais1.last().nomeAnimal);
        animais1.mostraLista();
        System.out.println("Qtd de nós: " +animais1.size());
        
    }    
}
