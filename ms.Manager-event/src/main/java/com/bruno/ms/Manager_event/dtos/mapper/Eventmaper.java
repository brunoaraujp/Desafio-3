package com.bruno.ms.Manager_event.dtos.mapper;

import com.bruno.ms.Manager_event.dtos.EventoRespostaDto;
import com.bruno.ms.Manager_event.dtos.criacaoeventodto;
import com.bruno.ms.Manager_event.entidade.Evento;
import org.modelmapper.ModelMapper;

public class Eventmaper {

    public static Evento toEvento(criacaoeventodto Eventodto) {

        return new ModelMapper().map(Eventodto, Evento.class);
    }

    public static EventoRespostaDto todto(Evento Evento) {

        return new ModelMapper().map(Evento, EventoRespostaDto.class);
    }





}
