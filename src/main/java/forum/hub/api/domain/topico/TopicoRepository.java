package forum.hub.api.domain.topico;

import org.springframework.beans.PropertyValues;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    boolean existsByTituloAndMensagem(String titulo, String mensagem);

    Page<Topico> findAllByAtivoTrue(Pageable paginacao);
}
