public class Arvore {
     private Palavra root;
     
    Arvore() {
        root = null;
    }
    
    public boolean isEmpty() { 
        return root == null;
    }

    public Palavra root() {   
        return root;
    }
    
    public void executaPreOrdem(Palavra p) {
        if (p == null) {
            return;
        }
        p.mostraNo();
        executaPreOrdem(p.left);
        executaPreOrdem(p.right);
    }

    public void executaInOrdem(Palavra p) {
        if (p == null) {
            return;
        }
        executaInOrdem(p.left);
        p.mostraNo();
        executaInOrdem(p.right);
        
    }

    public void executaPosOrdem(Palavra p) {
        if (p == null) {
            return;
        }
        executaPosOrdem(p.left);
        executaPosOrdem(p.right);
        p.mostraNo();
    }
    
     public void insere(Palavra z) {
        Palavra y = null;
        Palavra x = root();
        while (x != null) {
            y = x;
            if ((z.palavra.compareTo(x.palavra)) < 0) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        
        z.parent = y;
        if (y == null) {
            root = z;
        } else if ((z.palavra.compareTo(y.palavra)) < 0 ) {
            y.left = z;
        } else {
            y.right = z;
        }
    }

    public void delete(Palavra Tree, String Tar) {
        Palavra Min, Temp;
        if (Tree == null) { // árvore vazia
            return;
        } else if ((Tar.compareTo(Tree.palavra)) < 0) {
            delete(Tree.left, Tar); // buscar na esquerda
        } else if ((Tar.compareTo(Tree.palavra)) > 0) {
            delete(Tree.right, Tar);// buscar na direita
        } else {
            // encontrou o nó a ser deletado
            if (Tree.left != null && Tree.right != null) {
                // nó com dois filhos 
                Min = minimo(Tree.right);
                Tree.palavra = Min.palavra;
                delete(Tree.right, Tree.palavra);
            } else {
                // nó com um ou nenhum filho
                if (Tree.left == null) {
                    if (Tree.parent == null) {
                        root = Tree.right; // A raiz deverá ser deletada
                    } else {
                        if (Tree.right != null) {
                            Tree.right.parent = Tree.parent;
                        }
                        if (Tree == Tree.parent.left) {
                            Tree.parent.left = Tree.right;
                        } else {
                            Tree.parent.right = Tree.right;
                        }
                    }

                } else if (Tree.right == null) {
                    if (Tree.parent == null) {
                        root = Tree.left; // A raiz deverá ser deletada
                    } else {

                        Tree.left.parent = Tree.parent;
                        if (Tree == Tree.parent.left) {
                            Tree.parent.left = Tree.left;
                        } else {
                            Tree.parent.right = Tree.left;
                        }
                    }
                }
            }
        }
    }

    public Palavra busca(Palavra k) {
        Palavra y = root();
        while (y != null) {
            if (y.palavra.compareTo(k.palavra) == 0 ) {
                return y;
            } else if (y.palavra.compareTo(k.palavra) < 0 ) {
                y = y.right;
            } else {
                y = y.left;
            }
        }
        return null;
    }
    
    public Palavra maximo(Palavra x) {
        //Node<E> x = root();
        while (x.right != null) {
            x = x.right;
        }
        return x;
    }

    public Palavra minimo(Palavra n) {
        Palavra x = n;
        while (x.left != null) {
            x = x.left;
        }
        return x;
    }
}
