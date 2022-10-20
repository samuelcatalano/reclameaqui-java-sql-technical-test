package com.br.reclameaqui.controller;

import com.br.reclameaqui.dto.ComplaintDto;
import com.br.reclameaqui.dto.ResponseDto;
import com.br.reclameaqui.model.Complaint;
import com.br.reclameaqui.service.ComplaintService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Catalano
 */

@Slf4j
@RestController
@RequestMapping(value = "/reclameaqui")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReclameAquiApplicationController{

    @Autowired
	private ModelMapper mapper;

    @Autowired
	private ComplaintService complaintService;
	
	/**
	 * Save new Complaint.
	 * @param complaint the complaint
	 * @return {@link Complaint}
	 */
	@POST
	@RequestMapping("/create")
	@Consumes("service/json")
	public ResponseEntity createComplaint(@RequestBody final Complaint complaint) {
		final List<ComplaintDto> dtos = new ArrayList<>();
		final ComplaintDto dto = this.mapper.map(this.complaintService.save(complaint), ComplaintDto.class);
		
		dtos.add(dto);
		final ResponseDto response = new ResponseDto(1, dtos);
		return ResponseEntity.ok(response);
	}
	
	/**
	 * Get all complaints.
	 * @return list of complaints
	 */
	@GET
	@RequestMapping("/allComplaints")
	@ResponseBody
	public ResponseEntity getallComplaints(){
		final List<ComplaintDto> dtos = new ArrayList<>();
		final List<Complaint> complaints = this.complaintService.findAll();
		
		for(final Complaint complaint : complaints){
			dtos.add(this.mapper.map(complaint, ComplaintDto.class));
		}
		return ResponseEntity.ok(new ResponseDto(dtos.size(), dtos));
	}
	
	/**
	 * Get all complaints by title.
	 * @return list of complaints
	 */
	@GET
	@RequestMapping("/allByTitle/{title}")
	@ResponseBody
	public ResponseEntity getAllByTitle(@PathVariable(value = "title") final String title) {
		final List<ComplaintDto> dtos = new ArrayList<>();
		final List<Complaint> complaints = this.complaintService.findByTitle(title);
		
		for(final Complaint complaint : complaints){
			dtos.add(this.mapper.map(complaint, ComplaintDto.class));
		}
		return ResponseEntity.ok(new ResponseDto(dtos.size(), dtos));
	}
	
	/**
	 * Get all complaints by description.
	 * @return list of complaints
	 */
	@GET
	@RequestMapping("/allByDescription/{description}")
	@ResponseBody
	public ResponseEntity getAllByDescription(@PathVariable(value = "description") final String description) {
		final List<ComplaintDto> dtos = new ArrayList<>();
		final List<Complaint> complaints = this.complaintService.findByDescription(description);
		
		for(final Complaint complaint : complaints){
			dtos.add(this.mapper.map(complaint, ComplaintDto.class));
		}
		return ResponseEntity.ok(new ResponseDto(dtos.size(), dtos));
	}
	
	/**
	 * Get all complaints by city.
	 * @return list of complaints
	 */
	@GET
	@RequestMapping("/allByCity/{city}")
	@ResponseBody
	public ResponseEntity getAllByCity(@PathVariable(value = "city") final String city) {
		final List<ComplaintDto> dtos = new ArrayList<>();
		final List<Complaint> complaints = this.complaintService.findByCity(city);
		
		for(final Complaint complaint : complaints){
			dtos.add(this.mapper.map(complaint, ComplaintDto.class));
		}
		return ResponseEntity.ok(new ResponseDto(dtos.size(), dtos));
	}
	
	/**
	 * Get all complaints by state.
	 * @return list of complaints
	 */
	@GET
	@RequestMapping("/allByState/{state}")
	@ResponseBody
	public ResponseEntity getAllByState(@PathVariable(value = "state") final String state) {
		final List<ComplaintDto> dtos = new ArrayList<>();
		final List<Complaint> complaints = this.complaintService.findByState(state);
		
		for(final Complaint complaint : complaints){
			dtos.add(this.mapper.map(complaint, ComplaintDto.class));
		}
		return ResponseEntity.ok(new ResponseDto(dtos.size(), dtos));
	}
	
	/**
	 * Get all complaints by company.
	 * @return list of complaints
	 */
	@GET
	@RequestMapping("/allByCompany/{company}")
	@ResponseBody
	public ResponseEntity getAllByCompany(@PathVariable(value = "company") final String company) {
		final List<ComplaintDto> dtos = new ArrayList<>();
		final List<Complaint> complaints = this.complaintService.findByCompany(company);
		
		for(final Complaint complaint : complaints){
			dtos.add(this.mapper.map(complaint, ComplaintDto.class));
		}
		return ResponseEntity.ok(new ResponseDto(dtos.size(), dtos));
	}
}