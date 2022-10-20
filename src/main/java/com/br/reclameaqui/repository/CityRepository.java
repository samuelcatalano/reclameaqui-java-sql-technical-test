package com.br.reclameaqui.repository;

import com.br.reclameaqui.model.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Samuel Catalano
 */

@Repository
public interface CityRepository extends CrudRepository<City,Long>{
	
	@Query("SELECT c FROM City c WHERE c.name = :name")
	City findByName(final @Param("name") String name);
	
	@Query("SELECT c FROM City c WHERE c.state = :state")
	List<City> findByState(final @Param("state") String state);
}