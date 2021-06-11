public class Arvore {
    Node root; // raiz da árvore

    Arvore() {
        root = null;
    }

    public boolean isEmpty() {
        if(root == null){
            return true;
        }else{
            return false;
        }
    }

    public void addRoot(Node e) throws Exception{
        if(root != null){
            throw new Exception("Árvore já possui raiz");
        }
        root = e;
    }

    public Node getRoot() {
        return root;
    }

    public boolean isRoot(Node n) {
        if(n.parent == null){
            return true;
        }else{
            return false;
        }
    }

    public boolean isInternal(Node n) {
        if(n.left != null || n.right!= null){
            return true;
        }else{
            return false;
        }

    }
    public boolean isLeaf(Node n) {
        if(n.left == null && n.right== null){
            return true;
        }else{
            return false;
        }
    }

    public void addLeft(Node n, Node m) throws Exception{
        if(m.left != null){
            throw new Exception("Esse nó já possui filho na esquerda");
        }
        m.left = n;
        n.parent = m;
    }

    public Node left(Node n) {
        return n.left;
    }

    public boolean hasLeft(Node n) {
        if(n.left != null){
            return true;
        }else{
            return false;
        }
    }

    public void addRight(Node n, Node m) throws Exception{
        if(m.right != null){
            throw new Exception("Esse nó já possui filho na direita");
        }
        m.right = n;
        n.parent = m;

    }

    public Node right(Node n) {
        return n.right;

    }

    public boolean hasRight(Node n) {
        if(n.right != null){
            return true;
        }else{
            return false;
        }
    }

    public void remove(Node n) {
        if(n == root){
            root = null;
        }else{
            if(n.parent.left == n){
                n.parent.left = null;
            }else if(n.parent.right == n){
                n.parent.right = null;
            }
        }

    }

    public void visitPreOrdem(Node no) {
        if(no == null){
            return;
        }
        no.MostraNode();
        visitPreOrdem(no.left);
        visitPreOrdem(no.right);
    }
    
    public void visitInOrdem(Node no) {
        if(no == null){
            return;
        }
        visitInOrdem(no.left);
        no.MostraNode();
        visitInOrdem(no.right);
    }
    
    public void visitPosOrdem(Node no) {
         if(no == null){
            return;
        }
        visitPosOrdem(no.left);
        visitPosOrdem(no.right);
        no.MostraNode();       
    }
    
}
