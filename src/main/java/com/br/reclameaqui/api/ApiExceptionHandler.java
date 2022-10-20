package com.br.reclameaqui.api;

import com.br.reclameaqui.view.ErrorView;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

/**
 * @author Samuel Catalano
 */

@RestController
@ControllerAdvice
public class ApiExceptionHandler{
	
	@ResponseStatus(INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public ErrorView handleException(final Exception ex){
		return new ErrorView(ex.getMessage());
	}
}