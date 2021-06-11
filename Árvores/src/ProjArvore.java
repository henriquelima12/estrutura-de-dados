//Felipe Dantas Tavares - 32080549
//Henrique Lima Araújo - 32091702
public class ProjArvore {
    public static void main(String[] args) throws Exception {
        Arvore arvore = new Arvore();
        Node n1 = new Node("Raiz");
        arvore.addRoot(n1);
        
        Node n2 = new Node("Mackenzie");
        arvore.addLeft(n2, n1);
        Node n3 = new Node("Pessoal");
        arvore.addRight(n3, n1);
        Node n4 = new Node("Trabalhos");
        arvore.addLeft(n4, n2);
        Node n5 = new Node("Programas");
        arvore.addRight(n5, n2);
        Node n6 = new Node("LPII");
        arvore.addLeft(n6, n5);
        Node n7 = new Node("Estrutura");
        arvore.addRight(n7, n5);
        
        System.out.println("Pré-Ordem:");
        arvore.visitPreOrdem(arvore.root);
        System.out.println("");
        System.out.println("In-Ordem:");
        arvore.visitInOrdem(arvore.root);
        System.out.println("");
        System.out.println("Pós-Ordem:");
        arvore.visitPosOrdem(arvore.root);  
        System.out.println("");
        
        System.out.println("n1 é nó raiz? " +arvore.isRoot(n1));
        System.out.println("n3 é nó interno? " +arvore.isInternal(n3));
        System.out.println("n6 é nó folha? " +arvore.isLeaf(n6));
        System.out.println("n7 possui nó na esquerda? " +arvore.hasLeft(n7));
        System.out.println("n2 possui nó na direita? " +arvore.hasRight(n2));
        System.out.println("");
        
        arvore.remove(n5);
        System.out.println("Árvore Após remoção(Pré-Ordem):");
        arvore.visitPreOrdem(arvore.root);
        System.out.println("");
        System.out.println("Árvore Após remoção(In-Ordem):");
        arvore.visitInOrdem(arvore.root);
        System.out.println("");
        System.out.println("Árvore Após remoção(Pós-Ordem):");
        arvore.visitPosOrdem(arvore.root);
        
    }
}
