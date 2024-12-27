package com.bruno.ms.Manager_event.entidade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "db_evento")
public class Evento  implements Serializable {



    @Id
    private String id_evento;

    private String nome_evento;

    private String descricao;

    private String duracao;

    private int cep;


}
