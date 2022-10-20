package com.br.reclameaqui.repository;

import com.br.reclameaqui.model.Complaint;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Samuel Catalano
 */

@Repository
public interface ComplaintRepository extends CrudRepository<Complaint,Long>{
	
	@Query("SELECT c FROM Complaint c WHERE c.title like %:title%")
	List<Complaint> findByTitle(@Param("title") String title);
	
	@Query("SELECT c FROM Complaint c WHERE c.description like %:description%")
	List<Complaint> findByDescription(@Param("description") String description);
	
	@Query("SELECT c FROM Complaint c WHERE c.city.name = :city")
	List<Complaint> findByCity(@Param("city") String city);
	
	@Query("SELECT c FROM Complaint c WHERE c.city.state = :state")
	List<Complaint> findByState(@Param("state") String state);
	
	@Query("SELECT c FROM Complaint c WHERE c.company.name = :company")
	List<Complaint> findByCompany(@Param("company") String company);
}