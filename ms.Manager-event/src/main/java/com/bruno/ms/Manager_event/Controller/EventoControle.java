package com.bruno.ms.Manager_event.Controller;

import com.bruno.ms.Manager_event.entidade.Evento;
import com.bruno.ms.Manager_event.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/Evento")
public class EventoControle {

    @Autowired
    EventoService eventoService ;

    @PostMapping
    public ResponseEntity<Evento> criarEvento (@RequestBody Evento evento){

        Evento eve = eventoService.salvar(evento);

        return ResponseEntity.status(HttpStatus.CREATED).body(eve);


    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> bucarcomid (@PathVariable String id ){

        Evento eve = eventoService.buscarPor(id);

        return ResponseEntity.ok(eve);


    }




}
