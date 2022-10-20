package com.br.reclameaqui.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Samuel Catalano
 */
public class CityDto implements Serializable {
	
	@Getter
	@Setter
	private Long id;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private String state;
}