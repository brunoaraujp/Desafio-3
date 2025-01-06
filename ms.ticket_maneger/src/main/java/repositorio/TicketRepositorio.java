package repositorio;

import entidade.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepositorio extends MongoRepository<Ticket,String > {

}
