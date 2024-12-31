package com.bruno.ms.Manager_event.Restemplate;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class conex {

    @GetMapping("{cep}")
    public String CEP(@PathVariable String cep) {
        return null;
    }
}
