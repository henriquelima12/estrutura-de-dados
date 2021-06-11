public class Vetor {
    private String[ ] A; // armazena os elementos do vetor
    private int capacity; // capacidade do vetor
    private int size; // elementos no vetor
    
    public Vetor(int capacity) {
        A = new String[capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }       
    }
    public int size() {
        return size;
    }
    public String get(int i) throws Exception {
        if(isEmpty()){
            System.out.println("Lista vazia");
        }
        return A[i]; 
    }
    public void set(int i, String n) throws Exception {
        if(isEmpty()){
            System.out.println("Lista vazia");
        }
        A[i] = n; 
    }
    public void add(int i, String n) throws Exception {
        if(size == A.length){
            throw new Exception("Lista Cheia");
        }
        for(int j = size - 1; j>=i; j--){
            A[j+1] = A[j];
        }
        A[i] = n;
        size++;
    }
    public void remove(int i) throws Exception {
        if(isEmpty()){
            throw new Exception("Lista Vazia");
        }
        for(int j = i; j<= size - 1; j++){
            A[j] = A[j + 1];
        }
        size--;
    }
}
