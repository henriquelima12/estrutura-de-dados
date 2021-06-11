public class LinkedList {
    
    Node header; 
    Node trailer; 
    int size; 

    public LinkedList() {
        header = null;
        trailer = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }

    public Node first() {
        return header;
    }

    public Node last() {
        return trailer;
    }

    public void addFirst(Node novoAnimal) {
        if(isEmpty()){
            header = novoAnimal;
            trailer = novoAnimal;
        }else{
            novoAnimal.next = header;
            header = novoAnimal;
        }
        size++;       
    }

    public void addLast(Node novoAnimal) {
        if(isEmpty()){
            header = novoAnimal;
            trailer = novoAnimal;
        }else{
            trailer.next = novoAnimal;
            trailer = novoAnimal;
        }
        size++;
    }
    
    public void addAfter(Node novoAnimal, String pos) throws Exception{
        if(isEmpty()){
            throw new Exception ("Lista Vazia");
        }else{
            if(trailer.nomeAnimal.equals(pos)){
                addLast(novoAnimal);
            }else{
                Node aux;
                for(aux=header; aux.next!=null; aux=aux.next){
                    if(aux.nomeAnimal.equals(pos)){
                        novoAnimal.next = aux.next;
                        aux.next = novoAnimal;
                        size++;
                    }
                }
            }
        }
    }
    
    public void addBefore(Node novoAnimal, String pos) throws Exception{
        if(isEmpty()){
            throw new Exception ("Lista Vazia");
        }else{
            if(header.nomeAnimal.equals(pos)){
                addFirst(novoAnimal);
            }else{
                Node aux, ant=null;
                for(aux=header; !(aux.nomeAnimal.equals(pos)); aux=aux.next){
                    ant = aux;
                }
                ant.next = novoAnimal;
                novoAnimal.next = aux;
                size++;
            }
        }
    }
    
    public void remove(String animal) throws Exception{
        if(isEmpty()){
            throw new Exception ("Lista Vazia");
        }else{
            if(header.nomeAnimal.equals(animal)){
                header = header.next;
            }else{
                Node aux, ant=null;
                for(aux=header; !(aux.nomeAnimal.equals(animal)); aux=aux.next){
                    ant = aux;
                }
                ant.next = aux.next;
            }
            size--;
        }
    }
    
    public void mostraLista(){
        Node aux = header;
        header.mostraAnimal();
        while(aux.next != null){
            aux = aux.next;
            aux.mostraAnimal();
        }
        System.out.println("Fim da lista");
    }
    
}
