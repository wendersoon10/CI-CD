package br.com.wenderson.conversor_temperatura;

import br.com.wenderson.conversor_temperatura.service.ConversorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorServiceTest {

    @Test
    void cenario01(){
        ConversorService conversorService = new ConversorService();
        double valorEsperado = 212.0;

        double resultado = conversorService.converter(100, "celsius");
        assertEquals(valorEsperado, resultado, 000.1);
    }

    @Test
    void cenario02(){
        ConversorService conversorService = new ConversorService();

        double resultado = conversorService.converter(32, "fahrenheit");
        assertEquals(0, resultado, 000.1);
    }

    @Test
    void cenario03(){
        ConversorService conversorService = new ConversorService();
        int valorEsperado = -40;

        double resultado = conversorService.converter(-40, "celsius");
        assertEquals(valorEsperado, resultado, 000.1);


    }
}
