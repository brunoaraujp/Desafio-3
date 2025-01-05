package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.TicketService;

@Controller
public class TicketControle {
    @Autowired TicketService ticketService;
}
