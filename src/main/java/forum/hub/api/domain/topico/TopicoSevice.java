package forum.hub.api.domain.topico;

import forum.hub.api.domain.curso.Curso;
import forum.hub.api.domain.curso.CursoRepository;
import forum.hub.api.domain.usuario.Usuario;
import forum.hub.api.domain.usuario.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicoSevice {

    @Autowired
    private TopicoRepository repository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CursoRepository cursoRepository;


    public DadosDetalhamentoTopico cadastrar(@Valid DadosCadastroTopico dados) {
        verificarTopicoExistente(dados.titulo(), dados.mensagem());
        var usuario = buscarUsuario(dados.idAutor());
        var curso = buscarCurso(dados.idCurso());

        var topico = new Topico(dados.titulo(), dados.mensagem(), usuario, curso );
        repository.save(topico);
        return new DadosDetalhamentoTopico(topico);
    }



    private void verificarTopicoExistente(String titulo, String mensagem) {
        if (repository.existsByTituloAndMensagem(titulo, mensagem)) {
            throw new IllegalStateException("Já existe um tópico com o mesmo título e mensagem.");
        }
    }

    private Usuario buscarUsuario(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Autor não encontrado."));
    }

    private Curso buscarCurso(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Curso não encontrado."));
    }



}
