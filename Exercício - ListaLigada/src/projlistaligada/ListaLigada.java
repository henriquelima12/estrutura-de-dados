package projlistaligada;

public class ListaLigada <E>{
    private Node <E> header; 
    private Node <E> trailer; 
    private int size;

    public <E> ListaLigada() {
        header = null;
        trailer = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Node <E> first() {
        return header;
    }

    public Node <E> last() {
        return trailer;
    }

    public void addFirst(E elemento) {
        Node n = new Node(elemento);
        if (header == null) {
            n.setNext(header);
            header = n;
        }else{
            n.next = header;
            header = n;
        }
        size++;
    }

    public void addLast(E elemento) {
        Node n = new Node(elemento);
        if (header == null) {
            n.setNext(header);
            header = n;
        } else {
            Node nw;
            for (nw = header; nw.getNext() != null; nw = nw.getNext());
            nw.setNext(n);
        }
        size++;
    }

    public void mostraLista() {
        Node aux = header;
        System.out.println(header.getElemento());
        while (aux.next != null) {
            aux = aux.next;
            System.out.println(aux.getElemento());
        }
        System.out.println("Fim da Lista!");
    }

    public void addAfter(E elemento, E pos) throws Exception {
        Node n = new Node(elemento);
        if (isEmpty())
        {
            throw new Exception("Lista vazia!");
        } else {
            
            if (trailer.getElemento().equals(pos)) {
                addLast(elemento);
            } else {
                Node aux;
                for (aux = header; aux.next != null; aux = aux.next) {
                    if (aux.getElemento().equals(pos)) {
                        n.next = aux.next;
                        aux.next = n;
                        size++;
                    }
                }
            }
        }
    }

    public void addBefore(E elemento, E pos) throws Exception {
        Node n = new Node(elemento);
        if (isEmpty())
        {
            throw new Exception("Lista vazia!");
        } else {
            if (header.getElemento().equals(pos)) {
                addFirst(elemento);
            } else {
                Node aux, ant = null;
                for (aux = header; !(aux.getElemento().equals(pos)); aux = aux.next) {
                    ant = aux;
                }
                ant.next = n;
                n.setNext(aux);
                size++;
            }
        }
    }

    public void remove(E elemento) throws Exception {
        if (isEmpty())
        {
            throw new Exception("Lista vazia!");
        } else {
            if (header.getElemento().equals(elemento)) {
                header = header.next;
            } else {
                Node aux, ant = null;
                for (aux = header; !(aux.getElemento().equals(elemento)); aux = aux.next) {
                    ant = aux;
                }
                ant.next = aux.next;
            }
            size--;
        }
    }

    
}
