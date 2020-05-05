package br.edu.ufcg.virtus.model;

import br.edu.ufcg.virtus.core.model.Model;

import javax.persistence.*;

@Entity(name = "carro_default")
public class Carro extends Model<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_fabrica")
    private Fabrica factory;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Fabrica getFactory() {
        return factory;
    }

    public void setFactory(Fabrica factory) {
        this.factory = factory;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return this.id;
    }
}
