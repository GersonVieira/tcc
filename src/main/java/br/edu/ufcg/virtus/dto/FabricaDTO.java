package br.edu.ufcg.virtus.dto;

import br.edu.ufcg.virtus.core.dto.ModelDTO;

import java.util.List;

public class FabricaDTO extends ModelDTO {
    private Integer id;
    private String name;
    private List<CarroSimplesDTO> cars;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<CarroSimplesDTO> getCars() {
        return cars;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCars(List<CarroSimplesDTO> cars) {
        this.cars = cars;
    }
}
