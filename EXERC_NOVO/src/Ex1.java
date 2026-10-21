
// Classe principal do programa.
// É nela que vamos criar e utilizar objetos Usuario.
public class Ex1 {

    public static void main(String[] args) {

        // Criando um objeto da classe Usuario.
        // "new Usuario()" cria uma nova instância (um novo objeto)
        // baseada no molde definido pela classe Usuario.
        Usuario u1 = new Usuario();

        // Acessando o atributo "nome" do objeto u1
        // e colocando o valor "Joãozinho" nele.
        u1.nome = "Joãozinho";

        // Definindo a data de nascimento do primeiro usuário.
        u1.dataNascimento = "14/01/1998";

        // Definindo o estado civil do primeiro usuário.
        u1.estadoCivil = "Casado";

        // Definindo o sexo do primeiro usuário.
        // Como sexo é do tipo char, usamos aspas simples: 'M'.
        u1.sexo = 'M';

        // Exibindo informações do objeto u1.
        // O ponto (.) é usado para acessar atributos ou métodos de um objeto.
        System.out.println(u1.nome + " é " + u1.estadoCivil);

        // Criando um segundo objeto da classe Usuario.
        // Apesar de u1 e u2 serem da mesma classe,
        // eles são objetos diferentes e possuem seus próprios valores.
        Usuario u2 = new Usuario();

        // Definindo os dados do segundo usuário.
        u2.nome = "Maria";
        u2.dataNascimento = "2/10/2002";
        u2.estadoCivil = "Solteira";
        u2.sexo = 'F';

        // Exibindo informações do objeto u2.
        System.out.println(u2.nome + " é " + u2.estadoCivil);

    }
}