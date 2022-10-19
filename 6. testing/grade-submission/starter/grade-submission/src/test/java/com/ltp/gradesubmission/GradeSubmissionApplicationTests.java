package com.ltp.gradesubmission;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ltp.gradesubmission.controller.GradeController;

@SpringBootTest
@AutoConfigureMockMvc
class GradeSubmissionApplicationTests {

  @Autowired
  private MockMvc mockMvc;

	@Test
	void contextLoads() {
    assertNotNull(mockMvc);
	}

  @Test
  public void testShowGradeForm() {
    RequestBuilder requestBuilder = MockMvcRequestBuilders.get(urlTemplate: "/?is=123");

    mockMvc.perform(request).andExpect(status)
  }

}