package com.bruno.ms.Manager_event.Controller;

import com.bruno.ms.Manager_event.dtos.criacaoeventodto;
import com.bruno.ms.Manager_event.entidade.Evento;
import com.bruno.ms.Manager_event.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Evento")
public class EventoControle {

    @Autowired
    EventoService eventoService ;

    @PostMapping
    public ResponseEntity<Evento> criarEvento (@RequestBody criacaoeventodto criacaoeventodto){

        Evento eve = eventoService.salvar();

        return ResponseEntity.status(HttpStatus.CREATED).body(eve);


    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> bucarcomid (@PathVariable String id ){

        Evento eve = eventoService.buscarPor(id);

        return ResponseEntity.ok(eve);


    }


    @GetMapping
    public ResponseEntity<List<Evento>> bucartods(){

        List<Evento> evets = eventoService.buscartodos();

        return ResponseEntity.ok(evets);


    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Evento> atualizarEvento (@PathVariable String id, @RequestBody Evento evento){
        Evento eve = eventoService.salvar(evento);

        return ResponseEntity.ok(eve);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> DeletarEventp (@PathVariable String id){
         eventoService.deletar(id);

        return ResponseEntity.noContent().build();
    }





}
