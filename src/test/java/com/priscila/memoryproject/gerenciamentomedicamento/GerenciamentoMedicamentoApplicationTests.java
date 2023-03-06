package com.priscila.memoryproject.gerenciamentomedicamento;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class GerenciamentoMedicamentoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	/**
	 * Teste: Rota GET Reações Adversas.
	 */

	@Test
	void deveRetornarStatusOk() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/reacoesadversas"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
