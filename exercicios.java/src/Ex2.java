
public class Ex2 {
    public static void main(String[] args) {

        // INSTANCIAÇÃO: Criação de 4 objetos (instâncias) distintos a partir do molde
        // da classe 'Flor'
        Flor f1 = new Flor("Tulipa", 60, "Caio");
        Flor f2 = new Flor("Margarida", 50, "Joãozinho");
        Flor f3 = new Flor("Rosa", 40, "Ana");
        Flor f4 = new Flor("Lírio aranha azul", 100, "Caio");

        // Instanciação do objeto gerenciador (Floricultura)
        Floricultura floricultura = new Floricultura();

        // ASSOCIAÇÃO EM PRÁTICA: Vinculando os objetos 'Flor' criados ao objeto
        // 'floricultura'
        floricultura.adicionarFlor(f1);
        floricultura.adicionarFlor(f2);
        floricultura.adicionarFlor(f3);
        floricultura.adicionarFlor(f4);

        System.out.println(floricultura.pesquisarFlores("Caio"));
    }
}
