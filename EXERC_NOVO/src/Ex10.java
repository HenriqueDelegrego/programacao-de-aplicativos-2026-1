
public class Ex10 {

    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.titulo = "O Senhor dos Anéis";

        System.out.println(livro);

        livro.emprestar();

        System.out.println(livro);

        livro.devolver();

        System.out.println(livro);

    }
}