package br.edu.ufcg.virtus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufcg.virtus.core.api.ApiVersion;
import br.edu.ufcg.virtus.core.api.ApiVersions;
import br.edu.ufcg.virtus.core.controller.CrudBaseController;
import br.edu.ufcg.virtus.core.exception.BusinessException;
import br.edu.ufcg.virtus.core.security.authorization.Authorization;
import br.edu.ufcg.virtus.dto.UserDTO;
import br.edu.ufcg.virtus.model.User;
import br.edu.ufcg.virtus.service.UserService;
import io.swagger.annotations.Api;

/**
 * CRUD Controller for the model: User.
 *
 * @author Virtus
 */
@RestController
@RequestMapping("users")
@Authorization("user")
@Api(value = "user", tags = "user-controller")
@ApiVersion(ApiVersions.V1)
public class UserController extends CrudBaseController<User, Integer, UserDTO> {
	
	/**
	 * User service.
	 */
	@Autowired
	private UserService service;
	
	/**
	 * (non-Javadoc)
	 *
	 * @see CrudBaseController#getService()
	 */
	@Override
	protected UserService getService() {
		return service;
	}
	
	/**
	 * (non-Javadoc)
	 * @see br.edu.ufcg.virtus.core.controller.SearchBaseController#toModel(br.edu.ufcg.virtus.core.dto.ModelDTO)
	 */
	@Override
	protected User toModel(UserDTO modelDTO) {
		User model = super.toModel(modelDTO);
		model.setPassword(modelDTO.getNewPassword());
		return model;
	}
	
	/**
	 * Updates the password of the current user.
	 * 
	 * @param dto
	 * 		DTO.
	 * @return If the password was updated.
	 * @throws BusinessException
	 */
	@PatchMapping("/current/password")
	public ResponseEntity<?> updateCurrentPassword(@RequestBody UserDTO dto) throws BusinessException {
		getService().updateCurrentPassword(dto.getCurrentPassword(), dto.getNewPassword());
		
		return success();
	}
}
