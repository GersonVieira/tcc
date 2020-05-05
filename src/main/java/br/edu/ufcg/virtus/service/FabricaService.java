package br.edu.ufcg.virtus.service;

import br.edu.ufcg.virtus.core.repository.CrudBaseRepository;
import br.edu.ufcg.virtus.core.service.CrudService;
import br.edu.ufcg.virtus.model.Fabrica;
import br.edu.ufcg.virtus.repository.FabricaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FabricaService extends CrudService<Fabrica, Integer> {

    @Autowired
    private FabricaRepository fabricaRepository;

    @Override
    protected CrudBaseRepository<Fabrica, Integer> getRepository() {
        return this.fabricaRepository;
    }
}
