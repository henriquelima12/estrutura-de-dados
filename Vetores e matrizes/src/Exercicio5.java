//Henrique Lima Araújo - 32091702
import java.util.Random;
        
public class Exercicio5 {
    public static void main(String[] args) {
        int [][] predio = new int[10][8];
        
        preencheMatriz(predio);
        mostraMatriz(predio);
        System.out.println("A quantidade de apartamentos vazios é: " +(apVazio(predio)));
        System.out.println("O andar com maior número de moradores é o andar: " +(andar(predio)));
        System.out.println("O total de moradores desse prédio é: " +(somaMoradores(predio)));
        
    }
    
    public static void preencheMatriz(int matriz[][]){
        Random gerador = new Random();
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                matriz[i][j] = gerador.nextInt(7);
            }     
        }
    }
    
     public static void mostraMatriz(int matriz[][]){
        for (int i=0; i<matriz.length; i++){
            System.out.println("");
            if((i + 1)<10){
                System.out.print(+(i + 1)+ "° Andar:    ");
            }else{
                System.out.print(+(i + 1)+ "° Andar:   ");
            }
            for (int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]);
                System.out.print("  ");
            }
        }
        System.out.println("");
        System.out.println("");
    }
    
    public static int apVazio(int matriz[][]){
        int vazio = 0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j]== 0){
                    vazio++;
                }
            }
        }
        return vazio;
    }
    
    public static int andar(int matriz[][]){
        int somaAndar = 0;
        int andar = 0;
        int acumulador = 0;  
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
               somaAndar += matriz[i][j];              
            }           
            if(somaAndar>acumulador){
                acumulador = somaAndar;
                andar = i + 1;
            }     
            somaAndar = 0;
        }
        return andar;
    }
    
    public static int somaMoradores(int matriz[][]){
        int somaTotal = 0;      
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
               somaTotal += matriz[i][j];          
            }    
        }
        return somaTotal;
    }
    
}
    
