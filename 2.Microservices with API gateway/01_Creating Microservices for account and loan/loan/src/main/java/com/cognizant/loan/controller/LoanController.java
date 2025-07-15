package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Map<String, Object> getLoanDetails(@PathVariable String number) {
        Map<String, Object> response = new HashMap<>();
        response.put("number", number);
        response.put("type", "Car");
        response.put("loan", 400000);
        response.put("emi", 3500);
        response.put("tenure", 10);
        return response;
    }
}
