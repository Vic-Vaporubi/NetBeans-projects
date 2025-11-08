
package olamundo;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public void detalhar(){
        System.out.printf("%nTitulo : %s%n Autor : %s%n Total de Paginas : %d. ", titulo, autor, totPag);
    }

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    

    @Override
    public void abrir() {
        if(getAberto()){
            System.out.println("O livro já está aberto");
        } else{
            setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if(!getAberto()){
            System.out.println("O livro já está fechado");
        } else{
            setAberto(false);
        }
    }

    @Override
    public void folhear() {
        setAberto(true);
        setPagAtual(getTotPag());
    }

    @Override
    public void avancarPag() {
        if(getAberto() && getPagAtual() != getTotPag()){
            setPagAtual(getPagAtual()+1);
        } else if(getAberto() && getPagAtual() == getTotPag()){
            setAberto(false);
        } else{
            setAberto(true);
            setPagAtual(1);
        }
    }

    @Override
    public void voltarPag() {
        if(getAberto() && getPagAtual() != 1){
            setPagAtual(getPagAtual() - 1);
        } else if(!getAberto()){
            System.out.println("O livro está fechado");
        } else{
            setAberto(false);
        }
    }
    
    
}
