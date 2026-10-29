package br.com.wenderson.conversor_temperatura.service;


import org.springframework.stereotype.Service;

@Service
public class ConversorService {

    public double converter(double temperatura, String escala){

       if(escala.equals("celsius")){
           return (temperatura * 9 / 5) + 32;
       }

       if (escala.equals("fahrenheit")){
           return (temperatura - 32) * 5 / 9;
       }

       return temperatura;
   }
}
