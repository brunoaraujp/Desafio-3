package com.bruno.ms.Manager_event.dtos;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @ToString
public class EventoRespostaDto {

    private String id_evento;

    private String nome_evento;

    public String getId_evento() {
        return id_evento;
    }

    public void setId_evento(String id_evento) {
        this.id_evento = id_evento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome_evento() {
        return nome_evento;
    }

    public void setNome_evento(String nome_evento) {
        this.nome_evento = nome_evento;
    }

    public String getDataevento() {
        return dataevento;
    }

    public void setDataevento(String dataevento) {
        this.dataevento = dataevento;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    private String descricao;

    private String dataevento;

    private int cep;
}
