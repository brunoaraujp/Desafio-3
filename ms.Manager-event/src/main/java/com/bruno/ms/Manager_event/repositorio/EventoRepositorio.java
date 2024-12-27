package com.bruno.ms.Manager_event.repositorio;

import com.bruno.ms.Manager_event.entidade.Evento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepositorio extends MongoRepository <Evento , String>  {
}
