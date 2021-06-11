
public class Vetor {
    private String[ ] vetor; 
    private int capacity; 
    private int size;
    
    public Vetor(int capacity) {
        vetor = new String[capacity];
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
    public int size(){
        return size;
    }
    public String get(int i) throws Exception {
        if(i >= size)
            throw new Exception("Posição Inválida para Retorno");
        return vetor[i];
    }
    public void set(int i, String novo) throws Exception {
        if(i>=size){
            throw new Exception("Posição Inválida para Substituição");
        }
        vetor[i] = novo;
        
    }
    public void add(int i, String novo) throws Exception {
        if (size()==capacity)
            throw new Exception ("Lista cheia! Impossível inserir!");
        if (i>size)
            throw new Exception ("Posição de inserção inválida!");
        for(int j=size-1; j>=i; j--)
            vetor[j+1] = vetor[j];
        vetor[i] = novo;
        size++;           
    }
    
    public void remove(int i) throws Exception {
        if(isEmpty()){
            throw new Exception ("Lista vazia! Impossível remover");
        }if(i>=size){
            throw new Exception ("Posição de remoção inválida");
        }  
        for (int j=i;j<=size-2;j++)
            vetor[j] = vetor[j+1];  
        size--;
    }
    public int search(String nome) {
        for(int i=0; i<size; i++)
            if(nome.equals(vetor[i]))
                return i;
        return -1;
    }
    
    public String [] getArray() {
        return vetor;
    }
}

