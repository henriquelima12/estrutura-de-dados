public class Fila extends Vetor {

    public Fila(int capacity) {
        super(capacity);
    }

    public int size() {
        return super.size();
    }

    public void enqueue(int n) throws Exception {
        add(size(), n);
    }

    public void dequeue() throws Exception {
        remove(0);
    }

    public int front() throws Exception {
        return get(0);
    }
}
