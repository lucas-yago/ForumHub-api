package forum.hub.api.controller;


import forum.hub.api.domain.topico.DadosCadastroTopico;
import forum.hub.api.domain.topico.DadosDetalhamentoTopico;
import forum.hub.api.domain.topico.TopicoSevice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoSevice service;

    @PostMapping
    @Transactional
    public ResponseEntity<DadosDetalhamentoTopico> cadastrar(@RequestBody @Valid DadosCadastroTopico dados, UriComponentsBuilder uriBuilder){

        var  topico = service.cadastrar(dados);
        var uri = uriBuilder.path("/topicos/${id}").buildAndExpand(topico.id()).toUri();

        return ResponseEntity.created(uri).body(topico);
    }
}
