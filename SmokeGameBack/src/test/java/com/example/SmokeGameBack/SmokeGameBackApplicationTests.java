package com.example.SmokeGameBack;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase
class SmokeGameBackApplicationTests {

	@Test
	void contextLoads() {
	}

}