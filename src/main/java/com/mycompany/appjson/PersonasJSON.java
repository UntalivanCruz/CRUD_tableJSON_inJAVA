/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appjson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Developer
 */
public class PersonasJSON {
JSONArray listPersonas;
JSONParser jsonParser;

public PersonasJSON(){
    this.jsonParser= new JSONParser();
}

public String leerJSON(){
  try (FileReader reader = new FileReader("./listPersonas.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            this.listPersonas = (JSONArray) obj;
            System.out.println("Lista de empleados:\n"+this.listPersonas);
        
 } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    return this.listPersonas.toString();
}
 
public boolean guardarJSON(String info){
    return true;
}   
}
