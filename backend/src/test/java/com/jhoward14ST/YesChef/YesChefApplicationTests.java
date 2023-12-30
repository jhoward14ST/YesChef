package com.jhoward14ST.YesChef;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class YesChefApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	// @Test
	// void contextLoads() {
	// }

	// @Test
	// public void apiRootShouldReturnDefaultMessage() throws Exception {
    //     ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port + "/", String.class);
    //     assertEquals("Welcome to the YesChef API", response.getBody());
    // }
}
