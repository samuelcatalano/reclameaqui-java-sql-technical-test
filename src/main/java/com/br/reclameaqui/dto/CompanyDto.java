package com.br.reclameaqui.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Samuel Catalano
 */
public class CompanyDto implements Serializable {
	
	@Getter
	@Setter
	private Long id;
	
	@Getter
	@Setter
	private String name;
}