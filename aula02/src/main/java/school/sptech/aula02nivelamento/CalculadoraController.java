package school.sptech.aula02nivelamento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculos")
public class CalculadoraController {

    // VARIAVEL DE CLASSE
    private int contador;

    @GetMapping("/somar/{num1}/{num2}")
    public Integer somar(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }

    @GetMapping("/contador")
    public int contador(){
        return ++contador;
    }

    @GetMapping("/outro-contador")
    public int outroContador(){
        return ++contador;
    }
}
