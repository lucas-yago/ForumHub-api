package forum.hub.api.domain.usuario;

public record DadosUsuario(
        String nome,
        String email
) {
    public DadosUsuario(Usuario usuario) {
        this(usuario.getNome(), usuario.getEmail());
    }
}
