public class Livro {
    String ISBN;
    String titulo;
    int paginas;

    public Livro(String ISBN, String titulo, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.paginas = paginas;
    }
    
    public void MostraLivro(){
        System.out.println("ISBN: " +ISBN);
        System.out.println("Título: " +titulo);
        System.out.println("Páginas: " +paginas);
    }
}
