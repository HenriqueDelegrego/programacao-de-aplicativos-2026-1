public class Ex07 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario(
                "1",
                "Neymar Junior",
                "neyfrombrazil@gmail.com",
                "777777",
                "050.365.999-00",
                "Av. Copacabana 1955"
        );

        UsuarioDTO usuarioDTO = new UsuarioDTO (usuario);

        usuarioDTO.mostrarDados();
    }
}
