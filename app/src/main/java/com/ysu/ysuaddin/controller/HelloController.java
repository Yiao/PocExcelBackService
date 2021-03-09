package com.ysu.ysuaddin.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://localhost:3000",maxAge = 3600,allowCredentials = "true")
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public HelloDTO hello() {
        HelloDTO helloDTO = new HelloDTO();
        helloDTO.setName("BACK END");
        helloDTO.setContent("Hello");
        return helloDTO;
    }

    @PostMapping("/addFive")
    public AddFiveDTO addFive(@RequestBody Integer numberIn){
        int resultAddedFive = numberIn + 5;
        AddFiveDTO addFiveDTO = new AddFiveDTO();
        addFiveDTO.setNumberIn(numberIn);
        addFiveDTO.setNumberAddedFive(Integer.toString(resultAddedFive));
        return addFiveDTO;
    }
}
