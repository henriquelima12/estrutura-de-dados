public class Main {
    public static void main(String[] args) {
        int[] chaves = new int[32000];
        preencheVet(chaves);
        mostraVet(chaves);
        bubbleSort(chaves);
        System.out.println("");
        mostraVet(chaves);
        System.out.println("");
        System.out.println("A comparação foi realizada " +(bubbleSort(chaves))+ " vezes");
        
    }
    
    public static int bubbleSort(int[] chaves) {
        int temp;
        int cont = 0;
        // inicia o Bubble Sort
        for (int i = 0; i < chaves.length; i++) {
            for (int j = 1; j < chaves.length - i; j++) {
                cont++;
                if (chaves[j - 1] > chaves[j]) {
        //troca os elementos
                    temp = chaves[j - 1];
                    chaves[j - 1] = chaves[j];
                    chaves[j] = temp;
                }
            }
        }
        return cont;
    }
    
    public static void preencheVet(int[] chaves){
        for (int i=0;i<chaves.length;i++){
            chaves[i] = (int)(Math.random() * 20000 + 1);
        }
    }
    
    public static void mostraVet(int[] chaves){
        for (int i=0;i<chaves.length;i++){
            System.out.print(chaves[i]+ "\t");
        }
    }

}
