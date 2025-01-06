package Controller;

import entidade.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TicketService;


@RestController
@RequestMapping(value = "api/Ticket")
public class TicketControle {


    @Autowired TicketService ticketService;


    @PostMapping
    public ResponseEntity<Ticket> criarticket(@RequestBody Ticket ticket) {


         Ticket icket = ticketService.salvar(ticket);

        return ResponseEntity.status(HttpStatus.CREATED).body(icket);


    }
}

