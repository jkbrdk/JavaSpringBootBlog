package cz.itnetwork.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String renderIndex() {
        return "pages/home/index";
    }

    @GetMapping("/contact")
    public String renderContact() {
        return "pages/home/contact";
    }

    @GetMapping("/references")
    public String renderReferences() {
        return "pages/home/references";
    }

    @GetMapping("/skills")
    public String renderSkills() {
        return "pages/home/skills";
    }
}
