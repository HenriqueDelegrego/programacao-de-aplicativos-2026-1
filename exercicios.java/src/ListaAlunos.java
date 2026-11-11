import java.util.ArrayList;
import java.util.List;

public class ListaAlunos {

    private List<Aluno> alunos;

    public ListaAlunos() {
        alunos = new ArrayList<Aluno>();
    }
    public void adicionarAluno(Aluno a) {
        alunos.add(a);
    }
    public List<Aluno> obterAlunoPorCursoIdadeEMedia(String curso, int idade, double media) {

        List<Aluno> alunosPesquisa = new ArrayList<Aluno>();

        for (Aluno a : alunos) {
            if (a.getCurso().equals(curso) && a.getIdade() >= idade && a.getMediaFinal() >= media) {
                alunosPesquisa.add(a);
            }
        }

        return alunosPesquisa;

    }
    public Aluno obterAlunoPorMatricula(String matricula) {

        for (Aluno a : alunos) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        return null;
    }
}
