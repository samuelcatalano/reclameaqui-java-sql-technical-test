package com.br.reclameaqui.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author Samuel Catalano
 */
public class ResponseDto implements Serializable {
	
	@Getter
	@Setter
	private int numberOfComplaints;
	
	@Getter
	@Setter
	private List<ComplaintDto> complaints;
	
	/**
	 * Default constrcutor
	 */
	public ResponseDto() {
	}
	
	/**
	 * Constructor with parameters
	 * @param numberOfComplaints the numberOfComplaints
	 * @param complaints the complaints
	 */
	public ResponseDto(final int numberOfComplaints, final List<ComplaintDto> complaints) {
		this.numberOfComplaints = numberOfComplaints;
		this.complaints = complaints;
	}
}