package forum.hub.api.domain.curso;

import jakarta.validation.constraints.NotBlank;

public record DadosCurso(
        @NotBlank
        String nome,
        CategoriaCurso categoria
) {
    public DadosCurso(Curso curso) {
        this(curso.getNome(), curso.getCategoria());
    }
}
