package com.Strategy;

import com.Strategy.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class CardController {

    @Autowired
    CardService cardService;

    @GetMapping("test")
    public String test(){
        return "works";
    }

    @PostMapping("create/{id}")
    public void createProduct(@PathVariable String id){
        cardService.createProduct(id);
    }

}
