package school.sptech.aula02nivelamento;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

// ESSES @.. REPRESENTAM A NOTAÇÃO - NOTATION DO SPRING BOOT
@RestController //Falando que essa classe é uma RestController, necessário para a criação de endpoint
@RequestMapping("/frases") // Mapeamento de requisições. Criando o nome da chamada do enpoint
public class FraseController // ESSA CLASSE É CHAMADA DE MÓDULO
{

    private List<String> listaFrase = new ArrayList<String>();

    @GetMapping("/contagem")
    public String contagem(){
        return String.format("Você tem %s frases cadastradas!", listaFrase.size());
    }

    @PostMapping("/add-frase/{frase}")
    public String addFrase(@PathVariable String frase){
        listaFrase.add(frase);
        return "Frase cadastrada!";
    }

    @GetMapping("/listar-frases")
    public String listarFrases(){
        String conjuntoFrase = "";
        for (String frase:
             listaFrase) {
            conjuntoFrase += frase;
        }
        return conjuntoFrase;
    }




    @GetMapping //Por default esse Get será do / (A raiz da classe)
    public String frase() {

        return "Hello World!!";
    }

    @GetMapping("/outra-frase") //Por default esse Get será do / (A raiz da classe)
    public String outraFrase(){
        return "Hello World!!";
    }

    @GetMapping("/personalizada/{nome}")
    public String personalizada(@PathVariable String nome){ //@PathVariable é uma variável de caminho
        return String.format("Boa tarde %s! MC Cast Testes testes", nome);
    }
    @GetMapping("/personalizada/{nome}/{sobrenome}")
    public String personalizada(@PathVariable String nome, @PathVariable String sobrenome){ //@PathVariable é uma variável de caminho
        return String.format("Boa tarde %s %s! MC Cast Testes testes", nome, sobrenome);
    }
}
