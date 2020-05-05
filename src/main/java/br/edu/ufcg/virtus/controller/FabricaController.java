package br.edu.ufcg.virtus.controller;

import br.edu.ufcg.virtus.core.api.ApiVersion;
import br.edu.ufcg.virtus.core.api.ApiVersions;
import br.edu.ufcg.virtus.core.controller.CrudBaseController;
import br.edu.ufcg.virtus.core.service.CrudService;
import br.edu.ufcg.virtus.dto.FabricaDTO;
import br.edu.ufcg.virtus.model.Fabrica;
import br.edu.ufcg.virtus.service.FabricaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("fabricas")
@Api(value = "fabricas", tags = "fabricas-controller")
@ApiVersion(ApiVersions.V1)
public class FabricaController extends CrudBaseController<Fabrica, Integer, FabricaDTO> {

    @Autowired
    private FabricaService fabricaService;

    @Override
    protected CrudService<Fabrica, Integer> getService() {
        return this.fabricaService;
    }
}
