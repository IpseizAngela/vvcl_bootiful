package com.vvcl.bootiful.controller;


import com.vvcl.bootiful.service.AdderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/adder", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class AdderController {

    private final AdderService adderService;

    public AdderController(AdderService adderService) {
        this.adderService = adderService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/current")
    public int currentNum() {
        return adderService.currentBase();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/current")
    public void setCurrentBase(@RequestParam String base) { this.adderService.setBase(Integer.parseInt(base)); }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
    public String add(@RequestParam String num) {
        return String.valueOf(adderService.add(Integer.parseInt(num)));
    }

}
