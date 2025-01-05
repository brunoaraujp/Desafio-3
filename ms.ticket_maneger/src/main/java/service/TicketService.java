package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorio.TicketRepositorio;

@Service
public class TicketService {
    @Autowired TicketRepositorio ticketRepositorio;
}
