public class Pilha extends Vetor{
    int top; // topo da pilha
    
    public Pilha(int capacity){
// Cria uma pilha com uma capacidade inicial
        super(capacity);
        top=-1;
    }
    
    public int size(){
        return super.size();
    }
    public void push(String n) throws Exception {
        top++;
        add(top, n);    
    }
    public void pop() throws Exception {
        remove(top);
        top--;    
    }
    public String top() throws Exception {
        return get(top);
    }

}
