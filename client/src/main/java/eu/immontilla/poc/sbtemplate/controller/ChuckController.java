package eu.immontilla.poc.sbtemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Controller
public class ChuckController {
    
    @RequestMapping("/chuck")
    public String home(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String str = restTemplate.getForObject("https://localhost:8443/chuck/norris", String.class);
        JsonParser parser = new JsonParser();
        JsonObject o = parser.parse(str).getAsJsonObject();
        model.addAttribute("fact", o.get("funFact").getAsString());
        return "chuck";
    }
}
