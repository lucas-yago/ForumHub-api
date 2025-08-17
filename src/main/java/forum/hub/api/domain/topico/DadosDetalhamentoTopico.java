package forum.hub.api.domain.topico;

import forum.hub.api.domain.curso.DadosCurso;
import forum.hub.api.domain.usuario.DadosUsuario;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        Boolean status,
        DadosUsuario autor,
        DadosCurso curso
) {
    public DadosDetalhamentoTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus(),
                new DadosUsuario(topico.getAutor()),
                new DadosCurso(topico.getCurso())
        );
    }

}
