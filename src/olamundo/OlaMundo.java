
package olamundo;

public class OlaMundo {

    public static void main(String[] args) {
            System.out.println("Olá Mundo!");
            Pessoa p1 = new Pessoa("João", 17, "Masculino");
            Livro l1 = new Livro("Por onde andei", "Marx Weber", 288, p1);
            l1.detalhar();
            l1.folhear();
            p1.fazerAniversario();
            p1.sobre();
    }
    
}
