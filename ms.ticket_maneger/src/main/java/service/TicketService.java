package service;

import entidade.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import repositorio.TicketRepositorio;

@Service
public class TicketService {


    @Autowired
    TicketRepositorio ticketRepositorio;

    public  Ticket atualizar(Ticket ticket) {
        return ticketRepositorio.save(ticket);

    }

    public  Ticket buscarid(String id) {

        return ticketRepositorio.findById(id).orElseThrow(
                    ()-> new RuntimeException("id de Ticket não encontrado")
            );
        }


    @Transactional
    public Ticket salvar(Ticket ticket) {
        return ticketRepositorio.save(ticket);

    }



}
