
public class Fila extends Vetor{

    public Fila(int capacity) {
        super(capacity);
    }
    public int size(){
        return super.size();
    }
    
    public void enqueue(String n) throws Exception {
        add(size(), n);
    }

    public void dequeue() throws Exception {
        remove(0);
    }

    public String front() throws Exception {
        return get(0);
    }
}
