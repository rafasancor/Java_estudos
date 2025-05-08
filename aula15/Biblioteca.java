public class Biblioteca {
    public static void main(String[] args) {
        Livro l1 = new Livro("O Menino do Pijama Listrado", 2006, "Jonh Boyne ", 216);
        Dvd d1 = new Dvd("Gente Grande", 2015, "Comédia", 130);

        l1.mostrarDetalhes();
        d1.mostrarDetalhes();
        System.out.println();
    }
}

class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;

    public ItemBiblioteca (String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    
    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void mostrarDetalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
    }
}

class Livro extends ItemBiblioteca {
    private String autor;
    private int numPaginas;

    public Livro (String titulo, int anoPublicacao, String autor, int numPaginas){
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getAutor(){
        return autor;
    }

    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }
    
    public int getNumPaginas(){
        return numPaginas;
    }

    @Override
    public void mostrarDetalhes(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}

class Dvd extends ItemBiblioteca{
    private String categoria;
    private int duracao;

    public Dvd (String titulo, int anoPublicacao, String categoria, int duracao) {
        super(titulo, anoPublicacao);
        this.categoria = categoria;
        this.duracao = duracao;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public String getCategoria(){
        return categoria;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public int getDuracao(){
        return duracao;
    }
    @Override
    public void mostrarDetalhes(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Duração: " + this.duracao);
    }
}