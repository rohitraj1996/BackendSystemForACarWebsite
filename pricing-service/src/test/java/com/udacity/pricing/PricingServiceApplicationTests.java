package com.udacity.pricing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class PricingServiceApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void contextLoads() throws Exception {
	}

	@Test
	public void priceTest() throws Exception {
		this.mockMvc.perform(get("/services/price?vehicleId=1")).andExpect(status().isOk());
	}
}
