public class Vetor {
    private Gamer[] vetor;
    private int capacity;
    private int size;

    public Vetor(int capacity) {
        vetor = new Gamer[capacity];
        this.capacity = capacity;
        this.size = 0;
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
    
    public Gamer get(int i) throws Exception {
        if(i >= size)
            throw new Exception("Posição Inválida para Retorno");
        return vetor[i];
    }
    public void set(int i, Gamer novo) throws Exception {
        if(i>=size){
            throw new Exception("Posição Inválida para Substituição");
        }
        vetor[i] = novo;
        ordena(vetor);    
    }
    
    public void achaPos(Gamer novo) throws Exception{
        if(size == 0){
            add(0, novo);
        }else{
            if(size!=capacity){
                add(size, novo);
                ordena(vetor);
            }       
        }                                         
    }
    
    public void add(int i, Gamer novo) throws Exception {
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
            if(nome.equals(vetor[i].getNome()))
                return i;
        return -1;
    }
    
    public Gamer[] getArray() {
        return vetor;
    }
    
    public void ordena(Gamer[] vetor){
        Gamer acumula;
        for(int a = 0; a < size; a++){
            for(int b = 1; b < size - a; b++ ){
                if(vetor[b - 1].getScore() < vetor[b].getScore()){
                    acumula = vetor[b - 1];
                    vetor[b - 1] = vetor[b];
                    vetor[b] = acumula;
                }  
            }                        
        }
    }
    
    
}
