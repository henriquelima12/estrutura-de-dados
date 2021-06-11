//Felipe Dantas Tavares - 32080549
//Fernando Kradich Perez Barreto - 32047568
//Henrique Lima Araújo - 32091702
//Lucas Lima Xavier dos Santos - 32020724

import java.util.*;

public class ProjFila {

    public static void main(String[] args) throws Exception {
        Fila clientes = new Fila(1000);
        int minuto = 0;
        int duracao = 0;
        int totCli = 0;
        int tempo = 0;
        int maiorTempo = -1;
        int somaTempo = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDigite a duracao da simulacao: ");
        duracao = entrada.nextInt();
        System.out.println("");

        for (minuto = 0; minuto < duracao; minuto++) {
            if (!clientes.isEmpty()) {
                tempo = minuto - clientes.front();
                clientes.dequeue();
            }
            if (tempo > maiorTempo) {
                maiorTempo = tempo;
            }
            somaTempo += tempo;
            int k = (int) (Math.random() * 3);
            totCli+=k;
            if (k == 1) {
                clientes.enqueue(minuto);
            } else if (k == 2) {
                clientes.enqueue(minuto);
                clientes.enqueue(minuto);
            }

        }
        System.out.println("Quantidade de minutos: " + duracao);
        System.out.println("Total de clientes atendidos: " + totCli);
        System.out.println("Tempo médio de espera na fila: " + (somaTempo / totCli));
        System.out.println("Maior tempo de espera na fila: " + maiorTempo);

    }
}