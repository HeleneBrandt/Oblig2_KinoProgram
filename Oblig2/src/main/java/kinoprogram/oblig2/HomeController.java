package kinoprogram.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String heiVerden(String navn) {
        return "Hei verden" + navn;
        // kommer til prot 8080 når kjøres da må man bruke chrome.
    }
}
