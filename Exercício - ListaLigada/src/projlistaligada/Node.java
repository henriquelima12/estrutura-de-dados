package projlistaligada;

public class Node <E>{
    E elemento;	
    Node next;	
    Node prev;

    public Node(E elemento) {	
        this.elemento = elemento;
        this.next = null;
        this.prev = null;
    }

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
    
}
