package com.example.demo.services;
import com.example.demo.CatFact.CatFact;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class Services {

    public String hentCatData() throws IOException {
        URL catUrl = new URL("https://cat-fact.herokuapp.com/facts/random");

        BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catUrl.openStream()));

        CatFact data = new Gson().fromJson((inputFromCatURL), CatFact.class);



            inputFromCatURL.close();

            return data.toString();

    }
    public String hentCatData10() throws IOException {
        ArrayList<CatFact> facts = new ArrayList();

        for (int counter = 0; counter < 10; counter++) {



            URL catUrl = new URL("https://cat-fact.herokuapp.com/facts/random");

            BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catUrl.openStream()));

            CatFact data = new Gson().fromJson((inputFromCatURL), CatFact.class);

            inputFromCatURL.close();

            facts.add(data);


        }
        return facts.toString();

    }

    public String hentCatDato() throws IOException {

        ArrayList<CatFact> factsDato = new ArrayList();


        for (int counter = 0; counter < 10; counter++) {

            URL catUrl = new URL("https://cat-fact.herokuapp.com/facts/random");

            BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catUrl.openStream()));

            CatFact data = new Gson().fromJson((inputFromCatURL), CatFact.class);

            inputFromCatURL.close();

            factsDato.add(data);

        }
        Collections.sort(factsDato);

        return factsDato.toString();

    }
    public String parameter(char c, int n) throws IOException {


        URL catUrl = new URL("https://cat-fact.herokuapp.com/facts/random");

        BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catUrl.openStream()));

        CatFact data = new Gson().fromJson((inputFromCatURL), CatFact.class);

        inputFromCatURL.close();
        int count = 0;

        for(int i = 0; i < data.getText().length(); i++){
            if(c == data.getText().charAt(i)){
                count++;
            }
        }
        if (count == n){
            return data.toString();
        } else{
            return "Sorry no luck";
        }



    }

}
