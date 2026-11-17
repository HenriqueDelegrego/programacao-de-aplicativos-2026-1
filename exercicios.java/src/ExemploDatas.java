import java.time.LocalDate;
import java.time.Period;

public class ExemploDatas {

    public class ExemploDatas {


        public static void main(String[] args) {

            LocalDate hoje = LocalDate.now();

            System.out.println(hoje);

            LocalDate dataNascimentoPedro = LocalDate.of(2006, 10, 21);

            LocalDate dataNascimentoEloiza = LocalDate.of(2009, 04, 10);

            if(dataNascimentoEloiza.ifAfter(dataNascimentoPedro)) {
                System.out.println("Eloiza é mais nova");
            } else {
                System.out.println("Pedro é mais novo");
            }

            int idadeEloiza = Period.between(dataNascimentoEloiza, hoje).getYears();

            System.out.println("A Eloiza tem " + idadeEloiza + "anos" );
        }
    }
}
