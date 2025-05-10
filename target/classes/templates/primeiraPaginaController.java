package templates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class primeiraPaginaController {
    
    @GetMapping("/home")
    public String showPrimeiraPagina() {
        return "primeiraPagina";
    }
}
