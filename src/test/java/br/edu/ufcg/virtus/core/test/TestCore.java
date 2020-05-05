package br.edu.ufcg.virtus.core.test;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.ufcg.virtus.controller.CarroController;
import br.edu.ufcg.virtus.controller.UserController;
import br.edu.ufcg.virtus.core.exception.BusinessException;
import br.edu.ufcg.virtus.model.Carro;
import br.edu.ufcg.virtus.model.Fabrica;
import br.edu.ufcg.virtus.service.CarroService;
import br.edu.ufcg.virtus.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCore {
	
	@Autowired
	UserController userC;
	
	@Autowired
	UserService userS;
	
	@Autowired
	CarroService carroS;
	
	@Test
	public void asd() throws ServletException, BusinessException {
		Fabrica fabrica= new Fabrica();
		fabrica.setId(1);
		Carro carro= new Carro();
		carro.setFactory(fabrica);
		carro.setName("HR-V");
		carroS.insert(carro);
		carroS.getOne(6);
		this.userS.login("demo@virtus.ufcg.edu.br", "master");
		
		
		
	}

}
