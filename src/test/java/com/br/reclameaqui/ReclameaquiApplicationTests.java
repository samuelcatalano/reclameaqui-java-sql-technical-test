package com.br.reclameaqui;

import com.br.reclameaqui.controller.ReclameAquiApplicationController;
import com.br.reclameaqui.model.City;
import com.br.reclameaqui.model.Company;
import com.br.reclameaqui.model.Complaint;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Samuel Catalano
 */

@EntityScan({"com.br.reclameaqui.model"})
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest
public class ReclameaquiApplicationTests {
	
	@Autowired
	private ReclameAquiApplicationController applicationController;
	@Autowired
	private WebApplicationContext webApplicationContext;
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper objectMapper;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testContexLoads() throws Exception {
		assertThat(this.applicationController).isNotNull();
	}
	
	@Transactional
	@Test
	public void testSaveComplaint() throws Exception {
		final Complaint complaint = new Complaint();
		complaint.setTitle("Mais uma vez enganado pela empresa XPTO");
		complaint.setDescription("Essa empresa XPTO é uma vergonha!!!!");
		complaint.setCompany(new Company(1L, "XPTO"));
		complaint.setCity(new City(1L, "São Paulo", "SP"));
		
		this.mockMvc.perform(post("/reclameaqui/create")
			.contentType(MediaType.APPLICATION_JSON)
			.content(this.objectMapper.writeValueAsString(complaint)))
			.andExpect(status().isOk());
	}
	
	@Transactional
	@Test
	public void testGetAllComplaints() throws Exception{
		this.mockMvc.perform(get("/reclameaqui/allComplaints")).andDo(print())
			.andExpect(status()
			.isOk());
	}
	
	@Transactional
	@Test
	public void testGetAllByTitle() throws Exception {
		this.mockMvc.perform(get("/reclameaqui/allByTitle/dinheiro")).andDo(print())
			.andExpect(status()
			.isOk());
	}
	
	@Transactional
	@Test
	public void testGetAllByDescription() throws Exception {
		this.mockMvc.perform(get("/reclameaqui/allByDescription/empresa")).andDo(print())
			.andExpect(status()
			.isOk());
	}
	
	@Transactional
	@Test
	public void testGetAllByCity() throws Exception {
		this.mockMvc.perform(get("/reclameaqui/allByCity/São Paulo")).andDo(print())
			.andExpect(status()
			.isOk());
	}
	
	@Transactional
	@Test
	public void testGetAllByState() throws Exception {
		this.mockMvc.perform(get("/reclameaqui/allByState/SP")).andDo(print())
			.andExpect(status()
			.isOk());
	}
	
	@Transactional
	@Test
	public void testGetAllByCompany() throws Exception {
		this.mockMvc.perform(get("/reclameaqui/allByCompany/XPTO")).andDo(print())
			.andExpect(status()
			.isOk());
	}
	
	@Transactional
	@Test
	public void testExpectedAllComplaintsNotEmpty() throws Exception {
		this.mockMvc.perform(get("/reclameaqui/allComplaints")).andDo(print())
			.andExpect(jsonPath("$").isNotEmpty());
	}
	
	@Transactional
	@Test
	public void testWrongPath() throws Exception {
		this.mockMvc.perform(get("/xyzw/allByCompany/empresa")).andDo(print())
			.andExpect(status()
			.isNotFound());
	}
}