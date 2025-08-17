package forum.hub.api.domain.usuario;

public record DadosUsuario(
        String nome,
        String email,
        String senha
) {
    public DadosUsuario(Usuario usuario) {
        this(usuario.getNome(), usuario.getEmail(), usuario.getSenha());
    }
}
