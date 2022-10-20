package com.br.reclameaqui.repository;

import com.br.reclameaqui.model.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Samuel Catalano
 */

@Repository
public interface CompanyRepository extends CrudRepository<Company,Long>{
	
	@Query("SELECT c FROM Company c WHERE c.name = :name")
	Company findByName(final @Param("name") String name);
}