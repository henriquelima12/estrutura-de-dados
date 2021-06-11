/*
Felipe Dantas Tavares - 32080549
Henrique Lima Araújo - 32091702
*/
import java.util.Scanner;

public class ProjConversao {
    public static void main(String[] args) {
        Conversao c = new Conversao(10);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número que você deseja converter para hexadecimal: ");
        int num = entrada.nextInt();
        
        try{
            do{
            c.push(num % 16);            
            num = num / 16;
            }
            while (num!=0); 
            
            System.out.print("Número convertido para hexadecimal: ");
            while(c.size()!=0){
                if(c.top()<10){
                    System.out.print(c.top());
                }else{
                    switch(c.top()){
                        case 10:
                            System.out.print("A");
                            break;
                        case 11:
                            System.out.print("B");
                            break;
                        case 12:
                            System.out.print("C");
                            break;
                        case 13:
                            System.out.print("D");
                            break;
                        case 14:
                            System.out.print("E");
                            break;
                        case 15:
                            System.out.print("F");
                            break;
                        default:
                            System.out.println("Número Inválido");
                    }
                }
                c.pop();
            }
        }catch(Exception e){
            System.out.println("Erro: " +e);
        }
        System.out.println("\nFim da execução");
    } 
}
