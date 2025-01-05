package entidade;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_ticket")
public class Ticket {

    @Id
    private Integer id;

    private String Cpf;

    private String quantidade ;



}
