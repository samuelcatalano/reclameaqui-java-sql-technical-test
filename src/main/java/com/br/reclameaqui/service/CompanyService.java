package com.br.reclameaqui.service;

import com.br.reclameaqui.model.Company;
import com.br.reclameaqui.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Samuel Catalano
 */

@Service
@Slf4j
public class CompanyService{

	@Autowired
	private CompanyRepository repository;
	
	/**
	 * Find by name
	 * @param name the name
	 * @return Company
	 */
	public Company findByName(final String name) {
		return this.repository.findByName(name);
	}
	
	/**
	 * Find all companies
	 * @return all companies
	 */
	public List<Company> findAll() {
		return (List<Company>) this.repository.findAll();
	}
}