public class Teste1 {
    static int c = 0;
    
    public static void main (String[] args){
        int[][] A = new int [400][400];
        int[][] B = new int [400][400];
        //preenche as matrizes A e B com números aleatórios
        preencheA(A);
        preencheB(B);
         //cria a matriz C para receber o resultado
        int[][] C = new int [A.length][B[0].length];
        C = multiplica (A,B);
        exibeResult(C);
        System.out.println("");
        System.out.println("O número de vezes que a instrução foi executada: " +c);
    }

    public static void preencheA(int A[][]){
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[i].length; j++){
                A[i][j] = (int)(Math.random() * 10 + 1);
            }
        }
    }

    public static void preencheB(int B[][]){
        for (int i=0; i<B.length; i++){
            for (int j=0; j<B[i].length; j++){
                B[i][j] = (int)(Math.random() * 10 + 1);
            }
        }
    }
    
    public static int[][] multiplica (int[][]A, int[][]B) {
        int[][] C = new int [A.length][B[0].length];
        for (int i=0;i<A.length;i++)
            for (int j=0;j<B[0].length;j++){
                C[i][j]=0;
                for (int k=0;k<A[0].length;k++){
                    C[i][j]+=A[i][k] * B[k][j];
                    c++;
            }
        }
        return C;
    }
    
    public static void exibeResult(int C[][]){
        for (int i=0; i<C.length; i++){
            System.out.println("");
            for(int j=0; j<C[i].length; j++){
                System.out.print(C[i][j]);
                System.out.print(" ");
            }
        }
    }    
}
