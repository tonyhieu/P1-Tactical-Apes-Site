package files.labs;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class MainController {
    @GetMapping("/team")
    public String team() {
        return "pages/team";
    }
    @GetMapping("/yasaswiS")
    public String yasaswiS() {
        return "pages/yasaswiS";
    }
}
