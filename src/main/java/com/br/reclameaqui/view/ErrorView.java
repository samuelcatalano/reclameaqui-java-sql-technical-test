package com.br.reclameaqui.view;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Samuel Catalano
 */
public class ErrorView implements Serializable{

	@Getter
	@Setter
	private String message;
	
	/**
	 * Constructor
	 * @param message the message
	 */
	public ErrorView(final String message){
		this.message = message;
	}
}