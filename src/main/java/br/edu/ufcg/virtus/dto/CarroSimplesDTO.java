package br.edu.ufcg.virtus.dto;

import br.edu.ufcg.virtus.core.dto.ModelDTO;

public class CarroSimplesDTO extends ModelDTO {
    private  Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
