package com.bruno.ms.Manager_event.service;

import com.bruno.ms.Manager_event.entidade.Evento;
import com.bruno.ms.Manager_event.feing.Eventocusumerfeing;
import com.bruno.ms.Manager_event.repositorio.EventoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
               ()-> new RuntimeException("id de evento não encontrado")
       );
    }
    @Transactional
    public List<Evento> buscartodos() {
        return eventoRepositorio.findAll();


    }

    public Evento atualizar (Evento evento, String id) {
        Evento eVento = eventoRepositorio.findById(id).orElseThrow(
                ()-> new RuntimeException("id de evento não encontrado ")


        );

      if(!eVento.getNome_evento().equals(evento.getNome_evento())){
          eVento.setNome_evento(evento.getNome_evento());
        }

        if(!eVento.getDescricao().equals(evento.getDescricao())){
            eVento.setDescricao(evento.getDescricao());
        }
        return eventoRepositorio.save(evento);


    }
    public void deletar( String id){
        eventoRepositorio.findById(id).orElseThrow(
                ()-> new RuntimeException("id de evento não encontrado")
        );
        eventoRepositorio.deleteById(id);
    }




}
