public class Node {
    String elemento; 
    Node left, right, parent; 

    Node(String elemento) {
        this.elemento = elemento;
        left = right = parent = null;
    }
    
    public void MostraNode(){
        System.out.println(elemento);
    }
}
