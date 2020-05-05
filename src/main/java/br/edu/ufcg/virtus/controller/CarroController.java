package br.edu.ufcg.virtus.controller;

import br.edu.ufcg.virtus.core.api.ApiVersion;
import br.edu.ufcg.virtus.core.api.ApiVersions;
import br.edu.ufcg.virtus.core.controller.CrudBaseController;
import br.edu.ufcg.virtus.core.service.CrudService;
import br.edu.ufcg.virtus.dto.CarroDTO;
import br.edu.ufcg.virtus.model.Carro;
import br.edu.ufcg.virtus.service.CarroService;
import io.swagger.annotations.Api;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carros")
@Api(value = "carros", tags = "carros-controller")
@ApiVersion(ApiVersions.V1)
public class CarroController extends CrudBaseController<Carro, Integer, CarroDTO> {

    @Autowired
    private CarroService carroService;

    @Override
    protected CrudService getService() {
        return this.carroService;
    }
    
    @GetMapping("/getOne")
    public void getOne() {
    	try {
			Process process = Runtime.getRuntime().exec("mvn -Dtest=TestCore#asd test");
			Scanner leitor = new Scanner(process.getInputStream());
			while (leitor.hasNextLine()) {
				
				System.out.println(leitor.nextLine());
			}
			leitor.close();
			                
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
