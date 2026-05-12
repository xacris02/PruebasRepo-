package com.example.SmokeGameBack;

import com.example.SmokeGameBack.repository.ProductoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class SmokeGameBackApplicationTests {

    // Mockeamos el repositorio para evitar errores en DataLoader durante el test
    @MockBean
    private ProductoRepository productoRepository;

    @Test
    void contextLoads() {
        // Test de humo básico para verificar que el contexto levanta
    }

}