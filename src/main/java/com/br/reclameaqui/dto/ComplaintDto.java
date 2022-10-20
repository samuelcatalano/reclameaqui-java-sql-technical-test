package com.br.reclameaqui.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Samuel Catalano
 */
public class ComplaintDto implements Serializable {
	
	@Getter
	@Setter
	private Long id;
	
	@Getter
	@Setter
	private String title;
	
	@Getter
	@Setter
	private String description;
	
	@Getter
	@Setter
	private CompanyDto company;
	
	@Getter
	@Setter
	private CityDto city;
}