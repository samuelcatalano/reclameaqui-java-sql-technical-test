package com.br.reclameaqui.service;

import com.br.reclameaqui.model.City;
import com.br.reclameaqui.repository.CityRepository;
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
public class CityService{

	@Autowired
	private CityRepository repository;
	
	/**
	 * Find by name
	 * @param name the name
	 * @return City
	 */
	public City findByName(final String name){
		return this.repository.findByName(name);
	}
	
	/**
	 * Find by state
	 * @param state the state
	 * @return List of cities
	 */
	public List<City> findByState(final String state){
		return this.repository.findByState(state);
	}
	
	/**
	 * Find all cities
	 * @return all cities
	 */
	public List<City> findAll() {
		return (List<City>) this.repository.findAll();
	}
}