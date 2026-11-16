package br.com.wenderson.conversor_temperatura;

import br.com.wenderson.conversor_temperatura.service.ConversorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test //celsius para kelvin
    void cenario04(){
        ConversorService conversorService = new ConversorService();
        double valorEsperado = 273.15;

        double resultado = conversorService.converter(0, "kelvin/celsius");
        assertEquals(valorEsperado, resultado);
    }

    @Test //fahrenheit para kelvin
    void cenario05(){
        ConversorService conversorService = new ConversorService();
        double valorEsperado = 260.92777777777775;

        double resultado = conversorService.converter(10, "kelvin/fahrenheit");
        assertEquals(valorEsperado, resultado, 0.0001);
    }

    @Test
    void cenario06(){
        ConversorService conversorService = new ConversorService();
        double valorEsperado = 0;

        double resultado = conversorService.converter(-273.15, "kelvin/celsius");
        assertEquals(valorEsperado, resultado);
    }
}
