import java.time.LocalDate; // Importa a classe LocalDate para trabalhar com datas (ano, mês e dia, sem horário)
import java.time.Period; // Importa a classe Period para calcular a diferença/intervalo entre duas datas

public class usuario {

    private LocalDate setDataNascimento;

    public Usuario(LocalDate dataNascimento) {
        setDataNascimento(dataNascimento);
    }

    public boolena determinarMaiorIdade() {
        int idade = Period.between(dataNascimento, LocalDate.now()), getYears ();

        if (idade >= 18) {
            return true;
        } else {
             return  false;
        }
    }

    public LocalDate getSetDataNascimento() {
         return setDataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null || )
    }
}
