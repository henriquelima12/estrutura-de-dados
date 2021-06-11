public class Conversao extends Vetor{
    int top; // topo da pilha
    
    public Conversao(int capacity){
        super(capacity);
        top=-1;
    }
    
    public int size(){
        return super.size();
    }
    public void push(int n) throws Exception {
        top++;
        add(top, n);    
    }
    public void pop() throws Exception {
        remove(top);
        top--;    
    }
    public int top() throws Exception {
        return get(top);
    }
}

