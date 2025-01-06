package service;

import entidade.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositorio.TicketRepositorio;

@Service
public class TicketService {


    @Autowired
    TicketRepositorio ticketRepositorio;

    @Transactional
    public Ticket salvar(Ticket ticket) {
        return ticketRepositorio.save(ticket);

    }
}
