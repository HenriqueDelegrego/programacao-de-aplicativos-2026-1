
public class Livro {

    String titulo;
    boolean emprestado;

    public void emprestar() {

        if (emprestado == true) {

            throw new IllegalStateException(
                    "O livro já está emprestado"
            );

        }

        emprestado = true;
    }

    public void devolver() {

        if (emprestado == false) {

            throw new IllegalStateException(
                    "O livro não está emprestado"
            );

        }

        emprestado = false;
    }

    @Override
    public String toString() {

        if (emprestado == true) {

            return "Livro: " + titulo
                    + " - Emprestado";

        } else {

            return "Livro: " + titulo
                    + " - Disponível";

        }

    }
}
