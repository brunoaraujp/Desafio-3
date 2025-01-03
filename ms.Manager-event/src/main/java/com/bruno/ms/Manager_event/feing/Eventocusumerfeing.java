package com.bruno.ms.Manager_event.feing;

import com.bruno.ms.Manager_event.dtos.criacaoeventodto;
import com.bruno.ms.Manager_event.entidade.Evento;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "viacep-cusmuer", url  = """
        https://viacep.com.br/ws/cep/json/""")

public interface Eventocusumerfeing {
    @GetMapping(value = "cep")
    criacaoeventodto getEvento(@PathVariable(value = "cep") String cep);

}
