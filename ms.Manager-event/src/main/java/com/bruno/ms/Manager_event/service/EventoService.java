package com.bruno.ms.Manager_event.service;

import com.bruno.ms.Manager_event.entidade.Evento;
import com.bruno.ms.Manager_event.repositorio.EventoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventoService {

    @Autowired
    EventoRepositorio eventoRepositorio;

    @Transactional
    public Evento salvar(Evento evento) {

        return eventoRepositorio.save(evento);
    }
    @Transactional
    public Evento buscarPor(String id) {
       return eventoRepositorio.findById(id).orElseThrow(
               ()-> new RuntimeException("usuario não encontrado")
       );
    }
}
