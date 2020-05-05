package br.edu.ufcg.virtus.model;

import br.edu.ufcg.virtus.core.model.Model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "fabrica")
public class Fabrica extends Model<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Carro.class, mappedBy = "factory")
    private List<Carro> cars;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public List<Carro> getCars() {
        return cars;
    }

    public String getName() {
        return name;
    }

    public void setCars(List<Carro> cars) {
        this.cars = cars;
    }

    public void setName(String name) {
        this.name = name;
    }
}
