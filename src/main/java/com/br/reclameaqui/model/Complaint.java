package com.br.reclameaqui.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Samuel Catalano
 */

@Entity
@Table(name = "complaint")
public class Complaint implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@Getter
	@Setter
	private Long id;
	
	@Column(name = "title", nullable = false, length = Integer.MAX_VALUE)
	@Getter
	@Setter
	private String title;
	
	@Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
	@Getter
	@Setter
	private String description;
	
	@JoinColumn(name = "company", referencedColumnName = "id")
	@ManyToOne(optional = false)
	@Getter
	@Setter
	private Company company;
	
	@JoinColumn(name = "city", referencedColumnName = "id")
	@ManyToOne(optional = false)
	@Getter
	@Setter
	private City city;
}