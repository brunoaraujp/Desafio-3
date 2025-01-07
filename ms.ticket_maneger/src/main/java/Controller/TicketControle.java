package Controller;

import entidade.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TicketService;

import java.io.Serializable;


@RestController
@RequestMapping( "api/tickte")
public class TicketControle implements Serializable {


    @Autowired
    TicketService ticketService;

    @PostMapping
    public ResponseEntity<Ticket> criarticket(@RequestBody Ticket ticket) {


        Ticket icket = ticketService.salvar(ticket);

        return ResponseEntity.status(HttpStatus.CREATED).body(icket);


    }


    @GetMapping("/{id}")
    public ResponseEntity<Ticket> bucarcomid(@PathVariable String id) {

        Ticket ticket = ticketService.buscarid(id);

        return ResponseEntity.ok(ticket);


    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Ticket>atualizartic (@PathVariable String id, @RequestBody Ticket ticket){
        Ticket tic = ticketService.salvar(ticket);

        return ResponseEntity.ok(tic);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> DeletarTic(@PathVariable String id){
        ticketService.deletar(id);

        return ResponseEntity.noContent().build();
    }
}
