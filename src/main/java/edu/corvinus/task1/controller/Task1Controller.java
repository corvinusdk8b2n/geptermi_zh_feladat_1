package edu.corvinus.task1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Task1Controller
{
    @RequestMapping("/szamol")
    public String veletlen(@RequestParam(value ="number") String numberString)
    {
        double number = Double.parseDouble(numberString);
        double newNumber = 0;
        String result = "";

        if(number >= 0)
        {
            newNumber = Math.sqrt(number);
            result = Double.toString(newNumber);
        }
        else
        {
            double abs = Math.abs(number);
            abs = Math.sqrt(abs);
            result = abs + "i";
        }

        return result;
    }
}
