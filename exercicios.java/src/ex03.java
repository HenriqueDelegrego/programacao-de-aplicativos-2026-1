public class ex03 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("José", 20, "123", "DESI", 9);
        Aluno a2 = new Aluno("Maria", 18, "142", "DESI", 8);
        Aluno a3 = new Aluno("Ana", 17, "164", "PCP", 7);
        Aluno a4 = new Aluno("Robson", 21, "173", "MEC", 7.9);
        Aluno a5 = new Aluno("Carlos", 15, "254", "AUT", 9.5);

        ListaAlunos escola = new ListaAlunos();

        escola.adicionarAluno(a1);
        escola.adicionarAluno(a2);
        escola.adicionarAluno(a3);
        escola.adicionarAluno(a4);
        escola.adicionarAluno(a5);

        System.out.println(escola.obterAlunoPorCursoIdadeEMedia("DESI", 18, 7));

        System.out.println(escola.obterAlunoPorMatricula("254"));

    }

}
