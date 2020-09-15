package com.example.demo.controllers;
import com.example.demo.CatFact.CatFact;
import com.example.demo.services.Services;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

@Controller
public class CatController {

    @GetMapping ("/")
    @ResponseBody

    public String velkomst(){
        return "Velkommen til programmet hvor du lærer om katte";
    }

    @GetMapping ("/getSingle")
    @ResponseBody

    public String getSingle() throws IOException {
        Services s = new Services();

        return s.hentCatData();
    }

    @GetMapping ("/getTen")
    @ResponseBody

    public String getTen() throws IOException {
        Services s1 = new Services();



        return s1.hentCatData10();
    }
    @GetMapping ("/getDate")
    @ResponseBody

    public String getDate() throws IOException {
        Services s2 = new Services();



        return s2.hentCatDato();
    }
    @GetMapping ("/getParam")
    @ResponseBody
    public String getParam(@RequestParam char c, @RequestParam int n) throws IOException {
        Services s3 = new Services();

        return s3.parameter(c,n);

    }

}
