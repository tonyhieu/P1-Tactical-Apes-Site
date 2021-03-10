package files.labs;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/labs")
    public String labs() {
        return "pages/labs";
    }

    //pages not created yet - LABS
    @GetMapping("/fibonacci")
    public String fibonacci() { return "pages/labs/fibonacci";}
    @GetMapping("/rot")
    public String rot() { return "pages/labs/rot";}
    @GetMapping("/caesar")
    public String caesar() { return "pages/labs/caesar";}
    @GetMapping("/palindrome")
    public String palindrome() { return "pages/labs/palindrome";}
    @GetMapping("/commonfactor")
    public String commonfactor() { return "pages/labs/commonfactor";}

    @GetMapping("/pali")
    public String pali(@RequestParam(name="phrase", required=false,  defaultValue="racecar") String phrase, Model model) {
        Palindrome pali = new Palindrome();
        model.addAttribute("log1", pali.getLog1(phrase));
        return "pages/labs/palindrome";
    }

    @GetMapping("/fib")
    public String fib(@RequestParam(name="fibseq", required=false,  defaultValue="2") String fibseq, Model model) {
        Fibonacci fibb = new Fibonacci();
        int sequence = Integer.parseInt(fibseq);
        model.addAttribute("fibseq", fibb.returnFib(sequence));
        return "pages/labs/fibonacci";
    }

    @GetMapping("/rot13")
    public String rot(@RequestParam(name="phrase", required=false, defaultValue = "Gur dhvpx oebja sbk whzcf bire 13 ynml qbtf.") String phrase, Model model) {
        Rot13 rottt = new Rot13();
        model.addAttribute("rott", rottt.rot13(phrase));
        return "pages/labs/rot";
    }

    @GetMapping("/cip")
    public String ciph(@RequestParam(name="phrase", required=false, defaultValue = "Eyaad") String phrase, @RequestParam(name="shift", required=false, defaultValue = "13") int shift, Model model) {

        Caesar cipherr = new Caesar();
        model.addAttribute("cipher", cipherr.caesar(shift, phrase));
        return "pages/labs/caesar";
    }

    @GetMapping("/com")
    public String com(@RequestParam(name="common", required = false) int common, @RequestParam(name="factor", required = false) int factor, Model model) {
        Recursion recursion = new Recursion();
        model.addAttribute("log1", recursion.returnGcf(common, factor));
        model.addAttribute("log2", recursion.reduceFraction(common, factor));
        return "pages/labs/commonfactor";
    }

}
